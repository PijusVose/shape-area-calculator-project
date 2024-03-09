package swed.it.academy.project;

import java.math.BigDecimal;
import java.util.Scanner;

public class IOManager
{
    private static int shapeIndex;
    private static BigDecimal data1;
    private static BigDecimal data2;

    private static final Scanner scanner = new Scanner(System.in);

    public static int getShapeIndex()
    {
        return shapeIndex;
    }

    public static BigDecimal getData1()
    {
        return data1;
    }

    public static BigDecimal getData2()
    {
        return data2;
    }

    public static void chooseShape()
    {
        System.out.println("Please choose a shape:");
        System.out.println("1 for Square");
        System.out.println("2 for Triangle");
        System.out.println("3 for Circle");

        String rawInput = scanner.nextLine();
        shapeIndex = Integer.parseInt(rawInput);
    }

    public static void inputShapeInfo() throws UnknownShapeException
    {
    switch (shapeIndex)
        {
            case 1:
                System.out.println("What is the edge length in centimeters?");
                data1 = scanner.nextBigDecimal();

                break;
            case 2:
                System.out.println("What is the base length of the triangle in centimeters?");
                data1 = scanner.nextBigDecimal();
                System.out.println("What is the height of the triangle in centimeters?");
                data2 = scanner.nextBigDecimal();

                break;
            case 3:
                System.out.println("What is the radius of the circle in centimeters?");
                data1 = scanner.nextBigDecimal();

                break;
            default:
                scanner.close();

                throw new UnknownShapeException("Chosen shape does not exist.");
        }
    }

    public static void printCalculatedArea(String area)
    {
        System.out.println(area);
        System.out.println("-----------------");
    }

    public static boolean shouldContinueProgram()
    {
        if (scanner.hasNextLine())
        {
            scanner.nextLine();

            System.out.println("Do you want to continue? [Y/N]");
            var rawUserInput = scanner.nextLine();

            if (!rawUserInput.equalsIgnoreCase("Y"))
            {
                scanner.close();

                System.out.println("User does not want to continue, stopping calculator.");

                return false;
            }
            else
            {
                return true;
            }
        }
        else
        {
            System.out.println("Scanner has no next line.");

            scanner.close();

            return false;
        }
    }
}
