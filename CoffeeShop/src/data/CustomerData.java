package data;

import java.util.ArrayList;

public class CustomerData {
	private ArrayList<Customer> customerList;

    public CustomerData() {
        this.customerList = new ArrayList<>();
        initializeCustomerData();
    }

    public void initializeCustomerData() {
        Customer customer1 = new Customer("김민재", 10000, 30, "01022718216");
        Customer customer2 = new Customer("이상현", 22000, 35, "01011112222");
        
        addCustomer(customer1);
        addCustomer(customer2);
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    
	
}
