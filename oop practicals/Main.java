/*Identify commonalities and differences between Publication, Book and Magazine classes.  Title, 
Price, Copies are common instance variables and saleCopy is common method. The differences 
are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, 
receiveissue().Write a program to find how many copies of the given books  are ordered and  
display  total sale of  publication.  */

class Publication {
    String title;
    double price;
    int copies;

    Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;

    }

    double saleCopy() {
        return price * copies;
    }
}

class Book extends Publication {
    String author;

    Book(String title, double price, int copies, String author) {

        super(title, price, copies);
        this.author = author;
    }

    void  orderCopies( int qty){
        copies = copies +qty;
         
    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Copies Ordered: " + copies);
    }
}


class Magazine extends Publication{
    
    String currentissue;
    Magazine(String title , double price , int copies , String currentissue){
      super(title, price, copies);
      this . currentissue=currentissue;
    }
// method to order quanties of magzines 
    void orderQty( int qty){
        copies +=qty;
    }
  // Method to receive a new issue of the magazine
    void receiveissue ( String issue ){
        currentissue = issue;
    }

    public void displayMagazineDetails() {
        System.out.println("Magazine Title: " + title);
        System.out.println("Current Issue: " + currentissue);
        System.out.println("Price: " + price);
        System.out.println("Copies Ordered: " + copies);
    }
}

class Publication_Sale{
public static void main(String[] args) {
    Book b1 = new Book("no name ", 3, 36, "tejas clumsy");
    Magazine m1 = new Magazine("magazinnnnn", 10, 100, "issue 30");
    
    // order more copies of book and magzine 
    b1.orderCopies(30);
    m1.orderQty(60);

    // Display the details and sales of book and magazine
    System.out.println("Book Details:");
    b1.displayBookDetails();
    System.out.println("Total Sale for Book: " + b1.saleCopy());
    
    System.out.println("Magazine Details:");
    m1.displayMagazineDetails();
    System.out.println("Total Sale for Magazine: " + m1.saleCopy());

    double totalsale = b1.saleCopy()+m1.saleCopy();
    System.out.println("total sales of publication invluding nooks and mag"+totalsale);
}

}
