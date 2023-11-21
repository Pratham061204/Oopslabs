package lab11.lab;

interface Draw {
    public void draw();
}

class Circle implements Draw {
    @Override
    public void draw() {
        System.out.println("Circle is drawn");
    }
}

class Rectangle implements Draw {
    @Override
    public void draw() {
        System.out.println("Rectangle is drawn");
    }
}

class Triangle implements Draw {
    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }

}
class Q2{

    public static void main(String[] args) {

        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        circle.draw();
        rectangle.draw();
        triangle.draw();

    }

}


