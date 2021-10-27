package shape.Example;

public class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(String color,double length,double width) {
        super(color); //calling shape constructor
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Reactangle color is "+super.color+" and area is "+area();
    }
}
