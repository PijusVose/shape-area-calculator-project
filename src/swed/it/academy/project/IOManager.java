package swed.it.academy.project;

import java.util.Scanner;

public class IOManager
{
    private static int shapeIndex;
    private static double data1;
    private static double data2;

    private static final Scanner scanner = new Scanner(System.in);

    public static int getShapeIndex()
    {
        return shapeIndex;
    }

    public static double getData1()
    {
        return data1;
    }

    public static double getData2()
    {
        return data2;
    }

    public static void chooseShape()
    {
        System.out.println("Please choose a shape:");
        System.out.println("1 for Square");
        System.out.println("2 for Triangle");
        System.out.println("3 for Circle");

        var rawInput = scanner.nextLine();
        shapeIndex = Integer.parseInt(rawInput);
    }

    public static void inputShapeInfo() throws UnknownShapeException
    {
        switch (shapeIndex)
        {
            case 1:
                System.out.println("What is the edge length in centimeters?");

                break;
            case 2:
                System.out.println("What is the base length of the triangle in centimeters?");
                data1 = scanner.nextDouble();
                System.out.println("What is the height of the triangle in centimeters?");
                data2 = scanner.nextDouble();

                break;
            case 3:
                System.out.println("What is the radius of the circle in centimeters?");
                data1 = scanner.nextDouble();

                break;
            default:
                scanner.close();

                throw new UnknownShapeException("Chosen shape does not exist.");
        }

        scanner.close();
    }
}
