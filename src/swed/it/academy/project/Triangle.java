package swed.it.academy.project;

public class Triangle extends Shape
{

    public Triangle(double sideOneLength, double sideTwoLength)
    {
        super(sideOneLength, sideTwoLength);
    }

    @Override
    public void calculateArea()
    {
        super.calculateRectangleArea();

        var triangleArea = super.getArea() / 2;

        super.setArea(triangleArea);
    }
}
