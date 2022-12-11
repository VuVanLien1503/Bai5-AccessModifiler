package BT_accessModifiler;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return 2*3.14*this.radius;
    }
}
