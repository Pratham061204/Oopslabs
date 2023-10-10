package lab5.lab;
class Area{
    private float side1,side2,area;
    public void cal_Area(int a){
        area=a*a;
        System.out.println("Area of square is "+area);
    }
    public void cal_Area(float a){
        area=(float) Math.PI*a*a;
        System.out.println("Area of circle is "+area);
    }
    public void cal_Area(float side1,float side2){
        area=side1*side2;
        System.out.println("Area of rectangle is "+area);
    }
    public void display(){
        System.out.println("Area is "+area);
    }
}
public class AreaTester {
    public static void main(String[] args) {


        Area a = new Area();
        a.cal_Area(10);
        a.display();
        a.cal_Area(10.00f);
        a.display();
        a.cal_Area(10,20);
        a.display();
    }

}
