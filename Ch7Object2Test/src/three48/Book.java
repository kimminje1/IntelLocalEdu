package three48;

public class Book {
	String title;
	String author;
	String publisher;
	int price;
	String date;

	void setTitle(String title) {
		this.title = title;
	}

	String getTitle() {
		return title;
	}

	void setAuthor(String author) {
		this.author = author;
	}

	String getAuthor() {
		return author;
	}

	void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	String getPublisher() {
		return publisher;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	void setDate(String date) {
		this.date = date;
	}

	String getDate() {
		return date;
	}

	public void setProperties(String title, String author, String publisher, int price, String date) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.date = date;
	}
	
	

}
