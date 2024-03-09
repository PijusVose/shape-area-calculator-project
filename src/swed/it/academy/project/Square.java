package swed.it.academy.project;

import java.math.BigDecimal;

public class Square extends Shape
{
    public Square(BigDecimal edgeLength)
    {
        super(edgeLength, edgeLength);
    }

    @Override
    public void calculateArea()
    {
        super.calculateRectangleArea();
    }
}
