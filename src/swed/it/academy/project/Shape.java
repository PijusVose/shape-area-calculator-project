package swed.it.academy.project;

public abstract class Shape
{
    private double area;
    private double sideOneLength;
    private double sideTwoLength;

    public Shape(double sideOneLength, double sideTwoLength)
    {
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
    }

    public abstract void calculateArea();

    public void calculateRectangleArea()
    {
        this.area = sideOneLength * sideTwoLength;
    }

    @Override
    public String toString()
    {
        return "The area of the shape is " + area + " square cm";
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }
}
