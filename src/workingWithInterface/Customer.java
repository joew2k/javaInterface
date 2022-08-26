package workingWithInterface;

public class Customer {
	
	public static void main(String[] args) {
		Product book = new Book();
		book.setColor("blue"); //
		book.setPrice(1000.94);
		
		System.out.println(book.getPrice());
	}

}
