package oop.shapes;

public abstract class Quadrilateral implements Shape {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }

    public abstract void setLength(double length);
    public abstract void setWidth(double width);

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return (2 * length) + (2 * width);
    }




}
