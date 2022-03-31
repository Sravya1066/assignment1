package assignment1;

public class Book {
	int bookId;
	String bookName;
	String bookAuthor;
	

	public Book(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	public void Bookdetails() {
		System.out.println("bookId:"+bookId);
		System.out.println("bookName:"+bookName);
		System.out.println("bookAuthor:"+bookAuthor);
		
	}



	public static void main(String[] args)
	{
		
		
		Book book1=new Book(1,'A','Aasha');
		book1.Book();
	
		Book book2=new Book(2,'B','Basha');
		book2.Book();
		Book book3=new Book(3,'c','charan');
		book3=Book();
		
		
		

	}

}
