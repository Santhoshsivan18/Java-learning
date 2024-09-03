 BookStall {
//     protected String Booktitle;
//     protected double Bookcost;
//     protected int Bookstock;

//     void SetBookDetails(String title, double cost, int stock) {
//         Booktitle = title;
//         Bookcost = cost;
//         Bookstock = stock;
//     }

//     void DisplayBookDetails() {
//         System.out.println();
//         System.out.print(Booktitle + " " + Bookcost + " " + Bookstock);
//         System.out.println();
//     }

//     void SearchForBook(String title, int stock) {
//         if (title == Booktitle && stock >= Bookstock) {
//             System.out.println();
//             System.out.print("Book is available with sufficient stock");
//             double cost = Bookcost * stock;
//             System.out.print("BillCost:" + cost);
//             System.out.println();
//         } else if(title == Booktitle && stock <= Bookstock ){
//             System.out.println();
//             System.out.print("Book is available but with insufficient stock");
//             System.out.println();
//         } else {
//             System.out.println();
//             System.out.print("Book is unavailable with insufficient stock");
//             System.out.println();
//         }
//     }
// }