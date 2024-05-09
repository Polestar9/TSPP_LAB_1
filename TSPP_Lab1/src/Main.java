import java.util.Scanner;
public class Main
{
    public static double lab1_task1(double a, double b, double c)
    {
        double y = 0;
        if (c > 0)
        {
            double temp = b - 2 * a;
            if (temp >= 0)
            {
                y = Math.sqrt(temp) + 2 * Math.sqrt(c);
            }
            else
            {
                System.out.println("Рівняння не має розв'язку для c > 0");
            }
        }
        else if (c == 0)
        {
            System.out.println("Рівняння не визначене для c = 0");
        }
        else
        {
            y = b + 12 * Math.pow(c, 3);
        }
        return y;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        while (continueLoop)
        {
            System.out.print("Введіть значення a: ");
            double a = scanner.nextDouble();

            System.out.print("Введіть значення b: ");
            double b = scanner.nextDouble();

            System.out.print("Введіть значення c: ");
            double c = scanner.nextDouble();

            double result = lab1_task1(a, b, c);
            System.out.println("Результат: " + result);

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
