import java.util.*;

class Author{
    private String name;
    private char sex;
    private int age;

    Author(String name,char sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public int getAge(){
        return age;
    }
    public char getSex(){
        return sex;
    }

    public void displayAuthor(){
        System.out.println("Name: "+name);
        System.out.println("sex: "+sex);
        System.out.println("age: "+age);
    }

}

class Book{
    private String title;
    private double price;
    private int pages;
    private Author author;

    Book(String title,double price,int pages,Author author){
        this.title=title;
        this.price=price;
        this.pages=pages;
        this.author=author;
    }

    public double getPrice(){
        return price;
    }
    public int getPages(){
        return pages;
    }
    public Author getAuthor(){
        return author;
    }

    public void setPrice(double price){
        this.price=price;
    }


    public void displayBook(){
        System.out.println("Title: "+title);
        System.out.println("Price: "+price);
        System.out.println("Pages: "+pages);
        System.out.println("Author:");
        author.displayAuthor();
    }
}

public class BookStore{
    public static void main(String[] args){
        Author a1=new Author("D.R.David",'M',40);
        Author a2=new Author("K.N.Irfhan",'M',45);
        Author a3=new Author("T.K.M.Kumari",'F',36);
        Author a4=new Author("S.Y.Nimali",'F',32);
        Author a5=new Author("L.Ramanan",'M',30);


        ArrayList<Book> books=new ArrayList<>();

        books.add(new Book("Introduction to Java",2000.00,340,a2));
        books.add(new Book("Object-Oriented Design",2500.00,500,a4));
        books.add(new Book("Java for Beginners",1800.00,300,a1));
        books.add(new Book("Introduction to C",1500.00,250,a5));
        books.add(new Book("Java Script for Beginners",1700.00,550,a3));

        System.out.println("The details of all books:");
        for(Book b:books){
            b.displayBook();
        }

    }
}