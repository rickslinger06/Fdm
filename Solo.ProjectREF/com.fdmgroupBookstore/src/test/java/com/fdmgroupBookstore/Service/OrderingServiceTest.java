package com.fdmgroupBookstore.Service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


import Data.OrderRepository;
import Model.Book;
import Model.Order;
import Model.User;
import Service.OrderNotFoundException;
import Service.OrderingService;


public class OrderingServiceTest {
	
	OrderingService orderingService;
	OrderRepository mockOrderRepository;
	

	@Test
	public void test_placeOrderMethodTakesBookandUser(){
		mockOrderRepository = mock(OrderRepository.class);
		orderingService = new OrderingService(mockOrderRepository);
		
		
		Book book1 = new Book();
		User user = new User();
		
		Order expectedOrder = new Order();
		expectedOrder.setBookOrdered(book1);
		expectedOrder.setUser(user);
		
		orderingService.placeOrder(book1, user);
		
		verify(mockOrderRepository, times(1)).save(expectedOrder);
	
		
	}
	
	@Test
	public void test_getOrdersForUserMethodTakesUserAndReturnsOrdersForUser() throws OrderNotFoundException{
		mockOrderRepository = mock(OrderRepository.class);
		orderingService = new OrderingService(mockOrderRepository);
		
		User user2 = new User();
		
		Order order2 = new Order();
		Order order3 = new Order();
		
		List<Order> orderList = new ArrayList<>();
		orderList.add(order3);
		orderList.add(order3);
		user2.setOrders(orderList);
		
		List<Order> expectedListOfOrders = new ArrayList<>();
		expectedListOfOrders.add(order2);
		expectedListOfOrders.add(order3);
		
		List<Order> actualListOfOrders = new ArrayList<>();
		
		actualListOfOrders = orderingService.getOrderForUser(user2);
		
	
		assertEquals(expectedListOfOrders, actualListOfOrders);
		
	}

	
	@Test
	public void test_getOrdersForBookMethodTakesBookReturnsListOrdersForBook() throws OrderNotFoundException{
		mockOrderRepository = mock(OrderRepository.class);
		orderingService = new OrderingService(mockOrderRepository);
		
		Book book2 = new Book();
		
		Order order4 = new Order();
		Order order5 = new Order();
		order4.setBookOrdered(book2);
		order5.setBookOrdered(book2);
		
		List<Order> listOfAllOrders = new ArrayList<>();
		listOfAllOrders.add(new Order());
		listOfAllOrders.add(new Order());
		listOfAllOrders.add(order4);
		listOfAllOrders.add(order5);
		
		
		List<Order> expectedistOfOrders = new ArrayList<>();
		expectedistOfOrders.add(order4);
		expectedistOfOrders.add(order5);
		
		
		List<Order> actualListOfOrders = new ArrayList<>();
		when(mockOrderRepository.findAll()).thenReturn(listOfAllOrders);
		
	
		actualListOfOrders = orderingService.getOrdersForBook(book2);
		
	
		assertEquals(expectedistOfOrders, actualListOfOrders);
		
	}

}
