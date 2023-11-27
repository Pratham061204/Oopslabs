package lab12.lab;


import java.util.*;

public class Q2Book implements Comparable<Q2Book>{
    private String name;
    private double cost;

    public Q2Book(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public int compareTo(Q2Book o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Q2Book{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
    public boolean equals(Object obj) {
        if (obj instanceof Q2Book) {
            Q2Book book = (Q2Book)obj;
            return this.name.equals(book.getName());
        }
        return false;
    }
}
class BookcompCost implements Comparator<Q2Book>{

    @Override
    public int compare(Q2Book o1, Q2Book o2) {
        return Double.compare(o2.getCost(),o1.getCost());
    }
}
class BookcompName implements Comparator<Q2Book>{

    @Override
    public int compare(Q2Book o1, Q2Book o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
class Generalizedsearch{
    public static boolean search(Object[] arr,Object item){
        for(Object a: arr){
            if(a.equals(item)){
                return true;
            }
        }
        return false;
    }
}
class Main2{
    public static void main(String[] args) {
        Q2Book[] books = {new Q2Book("Harry Potter", 100), new Q2Book("B2", 75), new Q2Book("C", 50)};
        Arrays.sort(books);

        Q2Book searchBook = new Q2Book("Harry Potter", 0);

        if(Generalizedsearch.search(books, searchBook)){
            System.out.println("Found "+searchBook.getName());
        } else {
            System.out.println("Not Found");
        }

        Arrays.sort(books,new BookcompCost());
        System.out.println("Books sorted in descending order acc to Cost: \n"+
                Arrays.toString(books));

        Arrays.sort(books,new BookcompName());
        System.out.println("Books sorted in descending order acc to Names(ASCII values) : \n"+
                Arrays.toString(books));
    }

}
