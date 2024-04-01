package InformaticTasks;
import java.util.Scanner;

public class ThirdTAsk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВедите любое целое число");

        int number;
        while (!scan.hasNextInt()) {       //Ввод только целого числа
            System.out.println("Введите ЦЕЛОЕ ЧИСЛО");
            scan.next();
        }
        number = scan.nextInt();
        if(number % 2 == 0) {
            if(number > 0)
                System.out.println("Число " + number + " является положительным и четным");
            else if (number < 0)
                System.out.println("Число " + number + " является отрицательным и четным");
            else System.out.println("Число 0 является четным и нейтральным");
        }
        else {
            if(number > 0)
                System.out.printf("Число " + number + " является положительным и нечетным");
            else if (number < 0)
                System.out.println("Число " + number + " является отрицательным и нечетным");
        }
    }
}