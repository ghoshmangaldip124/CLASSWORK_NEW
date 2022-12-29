package myjavaproject;
import java.util.*;
public class Book {
		private int BookId;
		private String BookName;
		private double BookPrice;
		
		public Book(int bookId, String bookName, double bookPrice) {
			super();
			BookId = bookId;
			BookName = bookName;
			BookPrice = bookPrice;
		}

		public int getBookId() {
			return BookId;
		}

		public void setBookId(int bookId) {
			BookId = bookId;
		}

		public String getBookName() {
			return BookName;
		}

		public void setBookName(String bookName) {
			BookName = bookName;
		}

		public double getBookPrice() {
			return BookPrice;
		}

		public void setBookPrice(double bookPrice) {
			BookPrice = bookPrice;
		}

		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Book [bookId=");
			builder.append(BookId);
			builder.append(", bookName=");
			builder.append(BookName);
			builder.append(", bookPrice=");
			builder.append(BookPrice);
			builder.append("]");
			return builder.toString();
		}
}
