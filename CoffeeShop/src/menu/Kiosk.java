package menu;

import data.*;
import data.Product;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Kiosk {

	public ArrayList<Customer> customerList;
	private ArrayList<Product> userList = new ArrayList<>();
	private CustomerData customerData;
	private Product product;
	private HashSet<String> visitedCustomers;

	// CustomerData를 받는 생성자
	public Kiosk(CustomerData customerData) {
		this.customerData = customerData;
		
	}

	public Kiosk(CustomerData customerData, Product product) {
		this.customerData = customerData;
		this.product = product;
		this.visitedCustomers = new HashSet<>();
	}
	// Product를 받는 생성자
	public Kiosk(Product product) {
		this.product = product;
		this.customerData = new CustomerData();
		// Product 객체를 초기화하고 Product 리스트를 초기화합니다.
	}
	
	public void findCustomerNameByPhone(String phone) {
		for (Customer customer : customerData.getCustomerList()) {
			if (customer.getPhone().equals(phone)) {
				System.out.println("고객 이름: " + customer.getName());
				return;
			}
		}
		System.out.println("일치하는 고객이 없습니다. 가입은 카운터에서 해주세요");
	}
	   public void checkStock() {
	        System.out.println("메뉴 재고 확인:");
	        for (Product item : product.getProductList()) {
	            System.out.print(item.getName() + " - 재고: " 
	        + item.getQuantity());
	            if (item.getQuantity() == 0) {
	                System.out.println(" (품절)");
	            } else {
	                System.out.println();
	            }
	        }
	    }
	
	public void displayMenu() {
		System.out.println("메뉴:");
		int count = 1;
		for (data.Product item : product.getProductList()) {
			System.out.println(count + ". " + item.getName() +
					" " + item.getPrice() + " " + item.getKind());
            count++;
		}
	}
	public void checkCustomerVisit() {
	    System.out.println("이전에 온 손님 목록:");

	    // customerList에 저장된 이전에 온 손님들의 정보 출력
	    for (Customer customer : customerList) {
	        System.out.println("이름: " + customer.getName() + 
	                           ", 전화번호: " + customer.getPhone());
	    }
	}
	public void orderDrink(int number) {
		if (product == null || number < 1 || number >
		product.getProductList().size()) {
			System.out.println("잘못된 선택입니다.");
			return;
		}
		data.Product selectedProduct = product.getProductList().get(number - 1);
		System.out.println("선택한 음료: " + selectedProduct.getName());

	}
	
	//추가 확인
	public boolean confirmSelection(Scanner scanner) {
	    while (true) {
	        System.out.println("정말 선택하시겠습니까? (Y/N)");
	        String confirm = scanner.next();
	        if (confirm.equalsIgnoreCase("Y")) {
	            return true;
	        } else if (confirm.equalsIgnoreCase("N")) {
	            return false;
	        } else {
	            System.out.println("올바른 입력이 아닙니다. 다시 입력해주세요.");
	        }
	    }
	}
		
	   public ArrayList<Product> getUserList() {
	        return userList;
	    }
	
	   public void processOrder(int number, String phone) {
		    if (product == null || number < 1 || number > product.getProductList().size()) {
		        System.out.println("잘못된 선택입니다.");
		        return;
		    }
		    Product selectedProduct = product.getProductList().get(number - 1);
		    System.out.println("선택한 음료: " + selectedProduct.getName());
		    System.out.println("가격: " + selectedProduct.getPrice() + "원");

		    Scanner scanner = new Scanner(System.in);
		    System.out.println("정말 선택하시겠습니까? (Y/N)");
		    String confirm = scanner.next();
		    if (confirm.equalsIgnoreCase("Y")) {
		        // 고객 소지금에서 음료수 가격을 차감
		        for (Customer customer : customerData.getCustomerList()) {
		            if (customer.getPhone().equals(phone)) {
		                int remainingMoney = customer.getMoney() 
		                		- selectedProduct.getPrice();
		                if (remainingMoney < 0) {
		                    System.out.println("잔액이 부족합니다.");
		                    return;
		                }
		             // userList에 구매한 음료수 정보 추가
		                selectedProduct.setBuyer(customer.getName());
		                customer.setMoney(remainingMoney);
		                // userList에 구매한 음료수 정보 추가
		                addOrderToUserList(selectedProduct);
		                
		                // 고객의 소지금을 출력
		                System.out.printf("고객의 소지금: %d원\n", customer.getMoney());
		                return;
		            }
		            
		        }
		     
		    } else if (confirm.equalsIgnoreCase("N")) {
		        // 다시 메뉴를 표시하도록 함
		        displayMenu();
		        System.out.println("번호를 선택하세요:");
		        int choice = scanner.nextInt();
		        processOrder(choice, phone); // 전화번호도 전달
		    } else {
		        System.out.println("올바른 입력이 아닙니다.");
		    }
		}  
	   public void printUserList() {
		    System.out.println("구매한 음료 리스트:");
		    for (Product product : userList) {
		        System.out.printf("%s - %d원 구매자: %s\n", product.getName(), product.getPrice(), product.getBuyer());
		    }
		}
	   public void addOrderToUserList(Product product) {
		    userList.add(product);
		}
	   
	   
}
