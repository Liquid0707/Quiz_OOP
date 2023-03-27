package QuizOOP.Quiz3;

public class Square extends Rectangle {
    public Square() {
    }
    public double side;
    public Square(double side){
        this.side = side;
    }
    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public Square(boolean side, double width, double length) {
        super(width, length);
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length) {
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square dengan side= " + getWidth() + ", merupakan subclass dari: " + super.toString();
    }
}
