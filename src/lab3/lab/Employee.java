package lab3.lab;

import java.util.Scanner;

public class Employee {
    String id,name;
 int dept;
float basic,allowance,totalSalary;

    public Employee(String id, String name, int dept, float basic) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.basic = basic;

    }

    public int getDept() {
        return dept;
    }
    public void calculateSalary(){
        if(getDept()==1){
            allowance=1500;
        }
        else if(getDept()==2){
            allowance=2500;
        }
        else if(getDept()==3){
            allowance=3500;
        }
        else {
            System.out.println("Enter a valid dept no. ");
        }
        totalSalary=basic+allowance+0.4f*basic;
        System.out.println("Total salary is "+totalSalary);
    }
    public void printDetails(){
        System.out.println("Id is "+id);
        System.out.println("Name is "+name);
        System.out.println("Dept is"+ dept);
        System.out.println("Basic salary is "+basic);
        System.out.println("Allowance is"+ allowance);
        System.out.println("Total salary is" +totalSalary);
    }
}
class QEmployee{
    public static void main(String... args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println ("Enter ID: ");
        String id = scanner.nextLine();
        System.out.println ("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println ("Enter Department: ");
        int dept = scanner.nextInt();
        System.out.println ("Enter Basic Salary: ");
        float basic = scanner.nextFloat();
        Employee Pratham=new Employee(id,name,dept,basic);
        Pratham.calculateSalary();
        Pratham.printDetails();

    }
}
