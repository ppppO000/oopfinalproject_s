package oopproject;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book a=new Book("a","b","5");
		Book b=new Book("c","b","5");
		Book C=new Book("D","b","5");
		Library x=new Library();
		x.addBook(a);
		x.addBook(b);
		System.out.println(x.getBooks());
	}

}
