package InformaticTasks;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        int countOpen = 0;
        boolean masterkey = false;
        boolean boxKey = false;
        boolean firstArtifact = false;
        boolean secondArtifact = false;
        boolean thirdArtifact = false;
        boolean runaway = false;

        Scanner scan = new Scanner(System.in);

        System.out.println("\n\nИгрок просыпается в комнате, и пытается вспомнить свое имя");
        System.out.print("Меня похоже зовут... ");
        String namePlayer = scan.next();

        System.out.println("\nПривет, " + namePlayer + ", вокруг тебя следующие возможности");
        while (runaway == false) {
            System.out.println("\n1. Открыть дверь\n2. Заглянуть под кровать\n3. Открыть ящик в углу комнаты\n4. Открыть вентиляцию\n5. Взглянуть на тумбочку\n6. Взглянуть на статую рядом с дверью");
            String choise = scan.next();

            switch (choise) {
                case "1":
                    if (masterkey == true) {
                        System.out.println("Поздравялю тебя, " + namePlayer + " ты сбежал!");
                        runaway = true;
                    }
                    else System.out.println("Требуется ОТМЫЧКА (ее можно найти в ящике)");
                    break;
                case "2":
                    System.out.println(namePlayer + ", вы нашли ПЕРВЫЙ АРТЕФАКТ!");
                    firstArtifact = true;
                    break;
                case "3":
                    if (boxKey == true) {
                        masterkey = true;
                        System.out.println(namePlayer + ", вы открыли ящик и нашли ОТМЫЧКУ!");
                    } else System.out.println("Требуется КЛЮЧ ОТ ЯЩИКА (его можно получить активировав статую)");
                    break;
                case "4":
                    if (countOpen == 0) {
                        System.out.println("Вентиляция не открывается. Попробуйте еще 2 раза");
                        countOpen++;
                    } else if (countOpen == 1){
                        System.out.println("Вентиляция не открывается. Попробуйте еще 1 раз");
                        countOpen ++;
                    } else if (countOpen == 2) {
                        System.out.println("Вентиляция открылась \n" + namePlayer + ", вы нашли ВТОРОЙ АРТЕФАКТ");
                        countOpen ++;
                        secondArtifact = true;
                    } else
                        System.out.printf("Вы уже открыли вентиляцию \n");
                    break;
                case "5":
                    System.out.println(namePlayer + ", вы нашли ТРЕТИЙ АРТЕФАКТ");
                    thirdArtifact = true;
                    break;
                case "6":
                    if (firstArtifact == true && secondArtifact == true && thirdArtifact == true) {
                        boxKey = true;
                        System.out.println(namePlayer + ", вы активировали статую и нашли КЛЮЧ ОТ ЯЩИКА!");
                    } else System.out.println("Найдите все артефакты");
                    break;
                default:
                    System.out.println("Введено не корректное дейстиве");
            }
        }
    }
}