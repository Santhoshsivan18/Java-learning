import java.util.*;

public class Book {
    public static void main(String[] args) {
        // String s1=new String("Hello");
        // String s2=new String("Hello");
        // System.out.println(s1 == s2);
        // System.out.println(s1.equals(s2));
        Scanner sc = new Scanner(System.in);
        BookStall b1 = new BookStall();
        BookStall b2 = new BookStall();
        BookStall b3 = new BookStall();
        b1.SetBookDetails("C", 100, 10);
        b2.SetBookDetails("C++", 200, 20);
        b3.SetBookDetails("C#", 300, 10);
        b1.DisplayBookDetails();
        b2.DisplayBookDetails();
        b3.DisplayBookDetails();
        b1.SearchForBook("C++",45);
        b2.SearchForBook("C++",45);
        b3.SearchForBook("C++",45);

        // System.out.println("1. Add Book");
        // System.out.println("2. Display Book Details");
        // System.out.println("3. Search for Book");
        // System.out.println("Enter your choice:");
        // int choice = sc.nextInt();
        // switch (choice) {
        //     case 1:
        //         BookStall
        //         break;
        //     case 2:
        //         break;
        //     case 3:
        //         String request = sc.nextLine();
        //         request.split(" ");
        //         char title = request.charAt(0);
        //         int stock = request.charAt(1);
        //         break;
        //     default:
        //         break;
        // }
    }
}

class BookStall {
    protected String Booktitle;
    protected double Bookcost;
    protected int Bookstock;

    void SetBookDetails(String title, double cost, int stock) {
        Booktitle = title;
        Bookcost = cost;
        Bookstock = stock;
    }

    void DisplayBookDetails() {
        System.out.println();
        System.out.print(Booktitle + " " + Bookcost + " " + Bookstock);
        System.out.println();
    }

    void SearchForBook(String title, int stock) {
        if (title.equals(Booktitle) && stock >= Bookstock) {
            System.out.println();
            System.out.print("Book is available with sufficient stock");
            double cost = Bookcost * stock;
            System.out.println();
            System.out.print("BillCost:" + cost);
            System.out.println();
        } else if(title.equals(Booktitle) && stock < Bookstock ){
            System.out.println();
            System.out.print("Book is available but with insufficient stock");
            System.out.println();
        } else {
            System.out.println();
            System.out.print("Book is unavailable with insufficient stock");
            System.out.println();
        }
    }
}
// SetBookDetails {
// void set(char title, double cost, int stock) {
// this.title = title;
// this.cost = cost;
// this.stock = stock;
// }

// void get() {
// return title + cost + stock;
// }
// }

// DisplayBookDetails{

// }