package swed.it.academy.project;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape
{

    public Triangle(BigDecimal sideOneLength, BigDecimal sideTwoLength)
    {
        super(sideOneLength, sideTwoLength);
    }

    @Override
    public void calculateArea()
    {
        super.calculateRectangleArea();

        BigDecimal squareArea = super.getArea();
        BigDecimal triangleArea = squareArea.divide(BigDecimal.valueOf(2), RoundingMode.CEILING);

        super.setArea(triangleArea);
    }
}
