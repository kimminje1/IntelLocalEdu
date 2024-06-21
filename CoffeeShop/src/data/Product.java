package data;

import java.util.ArrayList;

public class Product {

	ArrayList<Product> productList = new ArrayList<>();
	public Product() {
		addProductData();
	}
	public String kind;
	public int price;
	public String name;
	private String buyer;
	 private int quantity;
	 
	public Product(String kind, int price,String name) {
		super();
		this.kind = kind;
		this.price = price;
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuyer() {
        return buyer;
    }
	 public void setBuyer(String buyer) {
	        this.buyer = buyer;
	    }
//	grapefruitAde
//	caffeLatte
//	icedLatte
	// 제품을 리스트에 추가하는 메소드
		public void addProduct(Product product) {
			productList.add(product);
		}

		// 제품 리스트를 출력하는 메소드
		public void printProductList() {
			for (Product product : productList) {
				System.out.println(product);
			}
		}
		//Grapefruit Caffe Latte Iced Latte
		 public void addProductData() {
		        Product Grapefruit = new Product("에이드", 5000, "Grapefruit Ade");
		        Product Caffe = new Product("커피", 4500, "Caffe Latte");
		        Product Iced = new Product("커피", 4800, "Iced Latte");

		        addProduct(Grapefruit);
		        addProduct(Caffe);
		        addProduct(Iced);
		    }
		
		
		public String toString() {
			return "종류: " + kind + ", 가격: " + price + ", 이름: " + name;
		}
	
		 public ArrayList<Product> getProductList() {
		        return productList;
		    }
		 
		  public int getQuantity() {
		        return quantity;
		    }
		 
}
