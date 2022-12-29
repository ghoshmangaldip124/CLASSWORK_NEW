package myjavaproject;
import java.util.*;

public class BookMain {

	public static void main(String[] args) {
		int ch;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		System.out.println("Welcome to book Management System");
		do {
			System.out.println("\n1.createBook\n2.get book by id\n3.getallbook\n4.exit\n5.Update\n6.Delete");
			ch=sc.nextInt();
			switch (ch) {
			case 1:
				bservice.createBook();
				break;
			case 2:
				BookService.searchById();
				break;
			case 3:
				BookService.getAllBookDetails();
				break;
			case 5:
				BookService.updateById();
				break;
			case 6:
				BookService.deleteById();
				break;
			case 4:
				System.exit(0);
			}
			System.out.println("Thanks for visit us");
		}while(true);


	}

}
