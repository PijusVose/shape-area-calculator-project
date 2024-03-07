package swed.it.academy.project;

public class Square extends Shape
{
    public Square(double edgeLength)
    {
        super(edgeLength, edgeLength);
    }

    @Override
    public void calculateArea()
    {
        super.calculateRectangleArea();
    }
}
