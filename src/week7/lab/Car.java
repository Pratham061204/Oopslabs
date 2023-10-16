package week7.lab;

import java.util.Scanner;

public class Car {
    private String Vehicle_id;
    Scanner sc=new Scanner(System.in);
    private Float[] Cost=new Float[3];
    //base + Exercise duty + Sales tax


    private float total;
    //total after calc_total()
    private float Grand_total;
    //price after subtracting discount

    public Car(String vehicle_id, Float[] cost) {
        Vehicle_id = vehicle_id;
        Cost = cost;
    }

    public float calc_total(){
        total=Cost[0]+Cost[1]+Cost[2];
        return total;
    }
    public float calc_grand_total(){
       calc_total();
       total-=0.1f*getTotal();
       return getTotal();
    }

    public float getTotal() {
        return total;
    }
    public static Car getHighestGrand(Car[] cars){
        Car highestgrandcar=cars[0];
        for(Car b:cars){
            if(b.calc_grand_total()>highestgrandcar.calc_grand_total()){
                highestgrandcar=b;
            }
        }
        return highestgrandcar;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of cars:");
        int a=sc.nextInt();
        Car[] cars=new Car[a];
        for(int i=0;i<cars.length;i++){
            System.out.println("Enter Vehicle id");
            String id=sc.next();
            Float[] cost=new Float[3];
            System.out.println("Enter Base Price");
            cost[0]=sc.nextFloat();
            System.out.println("Enter Exercise Duty");
            cost[1]=sc.nextFloat();
            System.out.println("Enter Sales Tax");
            cost[2]=sc.nextFloat();

            cars[i]=new Car(id,cost);
        }
        for (Car b : cars) {
            System.out.println("Vehicle ID: " + b.Vehicle_id);
            System.out.println("Total Cost: " + b.calc_total());
            System.out.println("Grand Total after 10% discount: " + b.calc_grand_total());

        }
        System.out.println("Details of the car with the highest grand total:");
        System.out.println("Vehicle ID: " + getHighestGrand(cars).Vehicle_id);
        System.out.println("Total Cost: " + getHighestGrand(cars).calc_total());
        System.out.println("Grand Total after 10% discount: " + getHighestGrand(cars).calc_grand_total());


    }

}
