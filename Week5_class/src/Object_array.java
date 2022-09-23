import java.util.Scanner;

class Circle {
	int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	double getArea() {
		return 3.14 * this.radius * this.radius;
	}
}

class Book {
	String title, author;
	
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}


public class Object_array {
	static void replaceSpace(char a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i] = ',';
			}
		}
	}
	
	static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print((int)(c[i].getArea()) + " ");
		}
		
		System.out.print("\n\n");
		
		Book [] book;
		book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < book.length; i++) {
			System.out.print("제목>> ");
			String title = scanner.nextLine();
			System.out.print("저자>> ");
			String author = scanner.nextLine();
			
			book[i] = new Book(title, author);
		}
		
		for (int i = 0; i < book.length; i++) {
			System.out.print("(" + book[i].title + "," + book[i].author + ")");
		}
		
		scanner.close();
		
		System.out.print("\n\n");
		
		
		
		char pen[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', '.'};
		printCharArray(pen);
		replaceSpace(pen);
		printCharArray(pen);
	}
}
