package setInterface;

import java.util.HashSet;

import data.Book;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashSet<Book> bookColl=new HashSet<Book>();
	Book book1=new Book(101,8,"Let us C","Yashwant Kanetkar","BPB");
	Book book2=new Book(102,6,"Indias way","Sherlock Simth","ETL");
	Book book3=new Book(103,3,"JaVA Tpoint","Sheldon Cooper","CRPC");

	bookColl.add(book1);
	bookColl.add(book2);
	bookColl.add(book3);
	
	for(Book b: bookColl)
		System.out.println("bookColl :-> "+ b.toString());
	}

}
