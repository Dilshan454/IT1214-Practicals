import java.util.*;
import java.time.*;

interface LibraryItem{
    void displayInfo();
    boolean isAvailable();
    void borrowItem();
    void runItem();
    double calculateFine(int daysOverdue);
}

class Book implements LibraryItem{
    String bookId;
    String title;
    String author;
    String isbn;
    boolean isAvailable;
    LocalDate borrowDate;

    Book(String bookId,String title,String author,String isbn,boolean isAvailable){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.isAvailable=isAvailable;
    }
    
    @Override
    void displayInfo(){
            System.out.println("Book ID: "+bookId);
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("ISBN: "+isbn);
            System.out.println("Available: "+isAvailable);
    }

    @Override
    boolean isAvailable(){
            return isAvailable;
    }

    @Override
    void borrowItem(){
             if (isAvailable) {
            isAvailable = false;
            borrowDate = LocalDate.now();
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available for borrowing.");
        }

    }

    @Override
    void returnItem(){
            if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is already available.");
        }

    }

    @Override
    double calculateFine(int daysOverdue){
            return daysOverdue * 0.5;

    }

}

class Member{
    String memberId;
    String name;
    String email;
    ArrayList<LibraryItem> borrowedItems=new ArrayList<>();

   Member(String memberId,String name,String email){
        this.memberId = memberId;
        this.name = name;
        this.email = email;

   }
   void  borrowItem(LibraryItem item){
         if (item.isAvailable()) {
            item.borrowItem();
            borrowedItems.add(item);
            System.out.println("Item borrowed successfully!");
         } else {
            System.out.println("Item is not available for borrowing.");
        }

   }
   void returnItem(LibraryItem item){
        if (borrowedItems.contains(item)) {
            item.returnItem();
            borrowedItems.remove(item);
            System.out.println("Item returned successfully!");
        } else {
            System.out.println("You have not borrowed this item.");
        }

   }

}
class Library{
    ArrayList<LibraryItem> libraryItems= new ArrayList<>();
    ArrayList<Member> members=new ArrayList<>();

    void addItem(LibraryItem item){
            libraryItems.add(item);
    }

    void addMember(){

    }

    void searchItem(){

    }
    void genarateReport(){

    }
}