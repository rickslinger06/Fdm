package Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;



import Data.OrderRepository;
import Model.Book;
import Model.Order;
import Model.User;


public class OrderingService {
	
	OrderRepository orderRepository;
	List<Order> listOfOrders;
	Order order;

	public OrderingService(OrderRepository mockOrderRepository) {
		// TODO Auto-generated constructor stub
		this.orderRepository = mockOrderRepository;
		listOfOrders = new ArrayList<>();
		order = new Order();
	}

	public Order placeOrder(Book book, User customer) {
		// TODO Auto-generated method stub
//		LocalDateTime now = LocalDateTime.now();
//		order.setOrderDateTime(now);
		order.setBookOrdered(book);
		order.setUser(customer);
		orderRepository.save(order);
		return order;	
	}
	
	public List<Order> placeOrder(List<Book> books, User customer){
		return listOfOrders;
	}

	public List<Order> getOrderForUser(User user) throws OrderNotFoundException{
		listOfOrders = user.getOrders();
		if(listOfOrders.size() > 0) {
			return listOfOrders;
		} else {
			throw new OrderNotFoundException("No order was found for this user.");
		}
	}

	public List<Order> getOrdersForBook(Book book) throws OrderNotFoundException{
		listOfOrders = orderRepository.findAll();
		ArrayList<Order> result = new ArrayList<>();
		for (Order order : listOfOrders) {
			if(order.getBookOrdered() == book) {
				result.add(order);
			}
		}
		
		if(result.size() > 0) {
			return result;
		} else {
			throw new OrderNotFoundException("No order was found for this book.");
		}

	}

}
