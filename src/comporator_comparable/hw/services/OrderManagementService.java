package comporator_comparable.hw.services;

import comporator_comparable.hw.enteties.Order;

import java.util.List;


public interface OrderManagementService {

	void addOrder(Order order);

	List<Order> getOrdersByUserId(int userId);
	
	List<Order> getOrders();

}
