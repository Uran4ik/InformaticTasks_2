package InformaticTasks;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите два числа");
        while (!scan.hasNextDouble()) {
            System.out.println("Введите ЧИСЛО");
            scan.next();
        }
        double x = scan.nextDouble();
        while (!scan.hasNextDouble()) {
            System.out.println("Введите ЧИСЛО");
            scan.next();
        }
        double y = scan.nextDouble();
        System.out.println("Вы ввели числа: " + x + " и " + y);
        System.out.println("\nКакие действия выполнить?");
        System.out.println("1. Сложение \n2. Вычитание \n3. Умножение \n4. Деление \n");

        String action = scan.next();
        switch (action){
            case "1":
                System.out.println("Результат: " + x + " + " + y + " = " + (x+y));
                break;
            case "2":
                System.out.println("Результат: " + x + " - " + y + " = " + (x-y));
                break;
            case "3":
                System.out.println("Результат: " + x + " * " + y + " = " + (x*y));
                break;
            case "4":
                if(y != 0)
                    System.out.println("Результат: " + x + " / " + y + " = " + (x/y));
                else
                    System.out.println("Нельзя делить на ноль");
                break;
            default:
                System.out.println("Введено не корректное действие");
                break;
        }
    }
}
