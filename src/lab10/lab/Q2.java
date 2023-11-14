package lab10.lab;

public class Q2 {
    public static void main(String[] args) {
        Car a=new SportCar(10000,1990);
        System.out.println(a.calculateSalePrice());
        Car b=new ClassicCar(100000,2999);
        System.out.println(b.calculateSalePrice());
    }
}
abstract class Car{
    private double price;
    private int year;

    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    abstract double calculateSalePrice();

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                '}';
    }
}
class SportCar extends Car{

    public SportCar(double price, int year) {
        super(price, year);
    }
    public double calculateSalePrice(){
        double t;
       if(getYear()>2000){
            t=0.75*getPrice();
       }
       else if(getYear()>1995){
            t=0.5*getPrice();
       }
       else {
           t=0.25*getPrice();
       }
       return t;
    }

}
class ClassicCar extends Car{

    public ClassicCar(double price, int year) {
        super(price, year);
    }
    public double calculateSalePrice(){
        double total=10000;
        return total;
    }
}
