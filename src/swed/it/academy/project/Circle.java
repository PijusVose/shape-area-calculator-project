package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape
{
    public Circle(BigDecimal radius)
    {
        super(radius, radius);
    }

    @Override
    public void calculateArea()
    {
        super.calculateRectangleArea();

        BigDecimal squareArea = super.getArea();
        BigDecimal circleArea = squareArea.multiply(BigDecimal.valueOf(Math.PI));
        BigDecimal roundedArea = circleArea.setScale(2, RoundingMode.UP);

        super.setArea(roundedArea);
    }
}
