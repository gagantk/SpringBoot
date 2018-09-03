package org.arpit.java2blog.dao;

import java.util.List;

import org.arpit.java2blog.model.Customer;
import org.arpit.java2blog.model.Login;

public interface CustomerDao {
	public List<Customer> getAllCustomers() ;

	public Customer getCustomer(int id) ;

	public Customer addCustomer(Customer customer);
	

}
