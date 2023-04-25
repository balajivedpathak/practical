package BookSystem;

public class Book {
	
	private int bookId;
	private String bookName;
	private double bookPrice;
	
	//getter setter method 
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//no arg cosntructor
	
	public Book() {
		super();
		
	}
	
	//parameterized constructor
	public Book(int bookId, String bookName, double bookPrice) {
		super();
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookPrice=bookPrice;
	}
}
