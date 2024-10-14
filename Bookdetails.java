import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }
    public String toString() {
        return "The name of the book is : " + this.name + "\n" +
               "Author name: " + this.author + "\n" +
               "The price of the book is: " + this.price + "\n" +
               "Number of pages : " + this.numPages + "\n";
    }
}

public class Bookdetails{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = s.nextInt();
        Books[] b = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of the book: ");
            s.nextLine();
            String name = s.nextLine();
            System.out.print("Enter author of the book: ");
            String author = s.nextLine();
            System.out.print("Enter the price of the book: ");
            int price = s.nextInt();
            System.out.print("Enter the number of pages of the book: ");
            int numPages = s.nextInt();

            b[i] = new Books(name, author, price, numPages);
        }

        System.out.println("\nBook Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(b[i].toString());
        }
	System.out.println("Name of the student: K. Keerthi Reddy");
	System.out.println("USN of the student: 1BM23CS137");

        s.close();
    }
}
