package swed.it.academy.project;

import java.math.BigDecimal;

public class Pentagon extends Shape
{

    public Pentagon(BigDecimal sideOneLength)
    {
        super(sideOneLength, sideOneLength);
    }

    @Override
    public void calculateArea()
    {
         super.calculateRectangleArea();

         BigDecimal squaredArea = super.getArea();
         BigDecimal middleAreaFormula = BigDecimal.valueOf(Math.sqrt(5 * (5 + (2 + Math.sqrt(5)))));
         BigDecimal pentagonArea =
                 BigDecimal.valueOf(0.25f * middleAreaFormula.doubleValue() * squaredArea.doubleValue());

        super.setArea(pentagonArea);
    }
}
