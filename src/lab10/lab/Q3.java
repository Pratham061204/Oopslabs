package lab10.lab;

public class Q3 {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square.toString());

        square.setLength(20);
        System.out.println(square.toString());
        System.out.println(square.getArea());
    }
}

class Shape{
    private String color="red";
    private boolean filled=true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        this("green",true);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape with color of "+getColor()+" and is "+(isFilled()?" filled":" not filled");
    }
}
class Circle extends Shape{
    private double radius=1;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        double area=Math.PI*getRadius()*getRadius();
        return area;
    }
    public double getPerimeter(){
        double per=Math.PI*getRadius()*2;
        return per;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "+getRadius()+",which is a subclass of "+super.toString();
    }
}
class Rectangle extends Shape{
    private double width,length;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        double area=getLength()*getWidth();
        return area;
    }
    public double getPerimeter(){
        double per=2*(getLength()+getWidth());
        return per;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+getWidth()+" and length "+getLength()+",which is a subclass of " + super.toString();
    }
}
class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public String toString() {
        return "A Square with side = " + super.getLength() + ", which is a subclass of " + super.toString();
    }
}
