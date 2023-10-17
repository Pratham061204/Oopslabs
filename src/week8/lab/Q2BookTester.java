package week8.lab;

import java.util.*;

public class Q2BookTester {
    public static void main(String[] args) {
        List<Book> books =new LinkedList<>();
        Book a=new Book(1000,"The World: A Family History",2,"British historian Simon Sebag Montefiore","IEEE",0);
        System.out.println("initially status of a is ");
        a.checkStatus();

        a.changeStatus(1);
        System.out.println("After changing status of a it is ");
        a.checkStatus();
        Book b=new Book(2000,"Spare",1,"J. R. Moehringer","IEEE",1);
        System.out.println("status of book b is ");
        b.checkStatus();
        System.out.println("-".repeat(30));
        books.add(a);
        books.add(b);
        Book c=new Book(2001,"Harry Potter",4,"J.K.Rowling","IEEE",2);
        Book d=new Book(2002,"Constitution",4,"Babasaheb Ambedkar","Indian Government",4);
        books.add(0,c);
        books.add(books.size(),d);
        books.forEach(s->s.display());
        System.out.println("-".repeat(300));

        ArrayList<Book> booksss=new ArrayList<>(books);
        booksss.forEach(s->s.display());


    }
}
class Book{

    private long ISBN_no;
    private String name;
    private int edition;
    private String author;
    private String publisher;
    private int status;

    public Book(long ISBN_no, String name, int edition, String author, String publisher, int status) {
        this.ISBN_no = ISBN_no;
        this.name = name;
        this.edition = edition;
        this.author = author;
        this.publisher = publisher;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public long getISBN_no() {
        return ISBN_no;
    }

    public String getName() {
        return name;
    }

    public int getEdition() {
        return edition;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void changeStatus(int status) {
        this.status = status;
    }

    public void checkStatus(){
        switch (getStatus()) {
            case 0->
                System.out.println("Available");

            case 1->
                System.out.println("Issued");

            case 2-> System.out.println("Reserved");

            default-> System.out.println("Invalid no");
        }
    }
    public void display(){
        System.out.println("ISBN_no of book is "+getISBN_no());
        System.out.println("Name of book is "+getName());
        System.out.println("Edition of book is "+getEdition());
        System.out.println("Author of the book is "+getAuthor());
        System.out.println("Publisher of book is "+getPublisher());
        System.out.println("Status is "+getStatus());
    }
}
