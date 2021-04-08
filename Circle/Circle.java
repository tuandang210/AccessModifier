package accessModifier.Circle;

public class Circle {
    private double radius=1.0;
    private String color = "red";

    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getArea(double radius){
        return Math.PI*radius*radius;
    }

    public double getRadius(){
        return this.radius;
    }
}
