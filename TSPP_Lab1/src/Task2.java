import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop)
        {
            System.out.print("Введіть радіус круга: ");
            double radius = scanner.nextDouble();
            System.out.print("Введіть довжину сторони квадрата: ");
            double sideLength = scanner.nextDouble();
            double circleArea = Math.PI * Math.pow(radius, 2);
            double squareArea = Math.pow(sideLength, 2);
            if (circleArea <= squareArea)
            {
                System.out.println("Круг поміститься всередині квадрата.");
            }
            else
            {
                System.out.println("Круг не поміститься всередині квадрата.");
            }

            System.out.print("Бажаєте продовжити (y/n)? ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y"))
            {
                continueLoop = false;
            }
        }
        scanner.close();
    }
}
