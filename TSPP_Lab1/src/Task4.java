import java.util.Scanner;
public class Task4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.print("Введіть значення змінної x: ");
            double x = scanner.nextDouble();
            System.out.print("Введіть значення змінної y: ");
            double y = scanner.nextDouble();
            if (!isValidInput(x, y))
            {
                System.out.println("Помилка обчислення: Ділення на 0: знаменник дорівнює 0");
            }
            else
            {
                double result = calculateFunction(x, y);
                System.out.println("Значення функції для введених x та y: " + result);
            }
            System.out.print("Бажаєте продовжити (y/n)? ");
            String continueInput = scanner.next();
            if (!continueInput.equalsIgnoreCase("y"))
            {
                break;
            }
        }
        scanner.close();
    }
    public static boolean isValidInput(double x, double y)
    {
        return (x != 0 || y != 0);
    }

    public static double calculateFunction(double x, double y)
    {
        return (x * x * x + x * y - y * y) / (1 + x * x + y * y);
    }
}