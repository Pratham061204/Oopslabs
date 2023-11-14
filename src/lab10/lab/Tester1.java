package lab10.lab;

public class Tester1 {
    public static void main(String[] args) {
        Staff a=new Staff("Arya ","GB Road","Nps",2000);
        System.out.println(a.toString());
        Student b=new Student("Pratham","Ajmera Heights","CS",2022,12000);
        System.out.println(b.toString());
    }
}
class Person{
    private String name,address;
    Person(String name,String address){
    this.name=name;
    this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name= " + name +
                ",address= " + address +"]";
    }
}
class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" +super.toString()+
                ",program= " + program +
                ",year= " + year +
                ",fee= " + fee +
                "]"  ;
    }
}
class Staff extends Person{
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() +
                ",school=" + school +
                ",pay=" + pay +
                "]";
    }
}
