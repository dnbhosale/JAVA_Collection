package data;

public class Book {
	
	public int id;
	public int quantity;
	public String name;
	String autho;
	public String publisher;
	public Book(int id, String publisher, String name, String autho, int quantity) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.autho = autho;
		this.publisher = publisher;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", quantity=" + quantity + ", name=" + name + ", autho=" + autho + ", publisher="
				+ publisher + "]";
	}
 

}
