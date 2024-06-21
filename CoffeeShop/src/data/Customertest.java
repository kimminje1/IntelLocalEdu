package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customertest {
	public static void main(String[] args) {
        Customer customer1 = new Customer("김민재", 10000, 30, "01022718216");
        Customer customer2 = new Customer("이상현", 22000, 35, "987-654-3210");
        
        customer1.addCustomer(customer1);
        customer2.addCustomer(customer2);
        
        // 고객 리스트 출력
        customer1.printCustomerList();  // 김민재 출력
        customer2.printCustomerList();  // 이상현 출력
        
    	Product product1 = new Product("에이드", 5000, "Grapefruit Ade");
		Product product2 = new Product("커피", 4500, "Caffe Latte");
		Product product3 = new Product("커피", 4800, "Iced Latte");

		product1.addProduct(product1);
		product1.addProduct(product2);
		product1.addProduct(product3);

		// 제품 리스트 출력
		product1.printProductList();
		
	
	
	
	
	}
	
}
