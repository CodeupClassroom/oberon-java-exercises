package oop.shapes;

public class Rectangle extends Quadrilateral {

    public Rectangle(double length, double width){
        super(length, width);
    }

    public void setLength(double length) {
        super.length = length;
    }

    public void setWidth(double width) {
        super.width = width;
    }


}

