package QuizOOP.Quiz3;

public class Circle extends Shape{
    private double radius;
    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14*getRadius()*getRadius();
    }
    public double getPerimeter() {
        return  2*3.14*getRadius();
    }
    @Override
    public String toString() {
        return "Circle[Shape[color = "+ super.getColor()+
                ", Filled = "+ super.isFilled()+
                ", Radius = "+ radius+
                ']';
    }
}
