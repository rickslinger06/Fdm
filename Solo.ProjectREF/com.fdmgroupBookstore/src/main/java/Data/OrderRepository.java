package Data;

import java.util.List;

import Model.Order;

public interface OrderRepository {
	
	public void save(Order order);
	List<Order> findAll();

}
