import java.util.Scanner;
public class Task3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int routeNumber;
        while (true)
        {
            System.out.print("Введіть номер маршруту трамваю (від 1 до 9): ");
            if (scanner.hasNextInt())
            {
                routeNumber = scanner.nextInt();
                if (routeNumber >= 1 && routeNumber <= 9)
                {
                    String route_name = "null", start_stop = "null", end_stop = "null";
                    switch (routeNumber)
                    {
                        case 1:
                            route_name = "Тролейбус №1";
                            start_stop = "вул.Ясська";
                            end_stop = "Нацональний Університет";
                            break;
                        case 2:
                            route_name = "Тролейбус №2";
                            start_stop = "Національний Університет";
                            end_stop = "Поліклініка Профогляду ''Гравітон''";
                            break;
                        case 3:
                            route_name = "Тролейбус №3";
                            start_stop = "Дріжджзавод";
                            end_stop = "Училище №15";
                            break;
                        case 4:
                            route_name = "Тролейбус №4";
                            start_stop = "Музей народної архітектури та побуту";
                            end_stop = "Національний Університет";
                            break;
                        case 5:
                            route_name = "Тролейбус №5";
                            start_stop = "Калинівський Ринок";
                            end_stop = "Південно-Кільцева";
                            break;
                        case 6:
                            route_name = "Тролейбус №6";
                            start_stop = "Площа Соборна";
                            end_stop = "Училище №15";
                            break;
                        case 7:
                            route_name = "Тролейбус №6A";
                            start_stop = "Училище №15";
                            end_stop = "Степана Бандери";
                            break;
                        case 8:
                            route_name = "Тролейбус №8";
                            start_stop = "вул. Південно-Кільцева";
                            end_stop = "Національний Університет";
                            break;
                        case 9:
                            route_name = "Тролейбус №8A";
                            start_stop = "вул. Південно-Кільцева";
                            end_stop = "Степана Бандери";
                            break;
                    }
                    System.out.println("Тролейбус номер: " + route_name);
                    System.out.println("Початкова зупинка: " + start_stop);
                    System.out.println("Кінцева зупинка: " + end_stop);
                    System.out.println();
                    break;
                }
                else
                {
                    System.out.println("Номер маршруту повинен бути в діапазоні від 1 до 9. Будь ласка, спробуйте ще раз.");
                }
            }
            else
            {
                System.out.println("Некоректне значення! Будь ласка, введіть номер маршруту трамваю ще раз.");
                scanner.next();
            }
        }
    }
}
