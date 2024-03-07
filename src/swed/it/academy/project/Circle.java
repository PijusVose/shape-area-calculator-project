package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape
{
    public Circle(double radius)
    {
        super(radius, radius);
    }

    @Override
    public void calculateArea()
    {
        super.calculateRectangleArea();

        var circleArea = super.getArea() * Math.PI;
        var roundedArea = new BigDecimal(circleArea).setScale(2, RoundingMode.UP);

        super.setArea(roundedArea.doubleValue());
    }
}
