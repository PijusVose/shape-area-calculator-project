package swed.it.academy.project;

import java.math.BigDecimal;

public abstract class Shape
{
    private BigDecimal area;
    private final BigDecimal sideOneLength;
    private final BigDecimal sideTwoLength;

    public Shape(BigDecimal sideOneLength, BigDecimal sideTwoLength)
    {
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
    }

    public abstract void calculateArea();

    public void calculateRectangleArea()
    {
        this.area = sideOneLength.multiply(sideTwoLength);
    }

    @Override
    public String toString()
    {
        return "The area of the shape is " + area + " square cm";
    }

    public BigDecimal getArea()
    {
        return area;
    }

    public void setArea(BigDecimal area)
    {
        this.area = area;
    }
}
