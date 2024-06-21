package data;

import java.util.ArrayList;

public class Customer {
	ArrayList<Customer> cusomerList = new ArrayList<>();
	
	public String name;
	public int  money = 0;
	public int age;
	public String phone;
	
	public Customer() {
		super();
	}
	public Customer(String name, int money,int age,String phone) {
		super();
		this.name = name;
		this.money = money;
		this.age = age;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString() {
		return "이름: " + name + ", 소지금: " + money + ", 나이: " + age + ", 연락처: " + phone;
	}
	
	public void addCustomer(Customer customer) {
		cusomerList.add(customer);
	}
	
	// 고객 리스트를 출력하는 메소드 (추가 기능)
	public void printCustomerList() {
		for (Customer customer : cusomerList) {
			System.out.println(customer);
		}
	}
	
	
	
}
