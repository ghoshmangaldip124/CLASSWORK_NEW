package myjavaproject;
import java.util.*;
public class BookService {

		static Book book[]=new Book[10];
		static Scanner sc=new Scanner(System.in);
		static int index=0;
		//create book method
		public void createBook() {
			int id;
			String bname;
			double price;
			System.out.println("enter the book Id: ");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter the book name: ");
			bname=sc.nextLine();
			System.out.println("enter the price: ");
			price=sc.nextDouble();
			book[index]=new Book(id,bname,price);
			index++;
			System.out.println("Book added successfully");
		}
		//get all book details
		public static void getAllBookDetails()
		{
			for(int i=0;i<index;i++)
			{
					System.out.println("Book Id: "+book[i].getBookId());
					System.out.println("Book Name: "+book[i].getBookName());
					System.out.println("Book Price: "+book[i].getBookPrice());
					System.out.println("===============================");
			}
		}
		//get book details based on id
		public static void searchById()
		{
			System.out.println("Enter the book id: ");
			int sid=sc.nextInt();
			int i;
			for(i=0;i<index;i++)
			{
				if(book[i].getBookId()==sid)
				{
					System.out.println("Book Id: "+book[i].getBookId());
					System.out.println("Book Name: "+book[i].getBookName());
					System.out.println("Book Price: "+book[i].getBookPrice());
					System.out.println("===============================");
					break;
				}
				
			}
			if(i==index)
				System.out.println("book not found");
		}
		public static void updateById() {
			System.out.println("Enter the book id: ");
			int up=sc.nextInt();
			for(int i=0;i<index;i++) {
				if (book[i].getBookId()==up) {
					int id;
					String bname;
					double price;
					System.out.println("enter the book Id: ");
					id=sc.nextInt();
					System.out.println("enter the book name: ");
					bname=sc.nextLine();
					sc.next();
					System.out.println("enter the price: ");
					price=sc.nextDouble();
					book[index]=new Book(id,bname,price);
					index++;
					System.out.println("Book Update successfully");
	                break;
			}
			}
}
		public static void deleteById() {
			System.out.println("Enter the book id: ");
			int id=sc.nextInt();
			for(int i=0;i<index;i++) {
				if (id == book[i].getBookId()) {
					for(int j=i; j<index; j++) {
						book[j]=book[j+1];
			            System.out.println("Book deleted successfully!");
						}
					 	break;
						}
				}
		}
}

	

