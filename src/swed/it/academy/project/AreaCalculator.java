package swed.it.academy.project;

import java.util.Scanner;

public class AreaCalculator
{
    private static boolean continueProgram = true;

    public static void main(String[] args)
    {
        while (continueProgram)
        {
            runCalculator();
            outputResults();

            if (!IOManager.shouldContinueProgram())
            {
                continueProgram = false;
            }
        }
    }

    private static void runCalculator()
    {
        inputShapeData();
    }

    private static void inputShapeData()
    {
        IOManager.chooseShape();

        try
        {
            IOManager.inputShapeInfo();
        }
        catch (UnknownShapeException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void outputResults()
    {
        var shape =
                switch (IOManager.getShapeIndex())
        {
            case 1 -> { yield new Square(IOManager.getData1()); }
            case 2 -> { yield new Triangle(IOManager.getData1(), IOManager.getData2()); }
            case 3 -> { yield new Circle(IOManager.getData1()); }
            case 4 -> { yield new Pentagon(IOManager.getData1()); }
            default -> { yield null; }
        };

        if (shape != null)
        {
            shape.calculateArea();
            IOManager.printCalculatedArea(shape.toString());
        }
    }
}
