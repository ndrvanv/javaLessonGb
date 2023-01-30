package org.example.lesson_1;

import org.example.Menu;

import java.util.Scanner;
public class MenuLessonOne {
    private static final String TASK_MENU = "Выберите нужный пункт меню: "
            + "\n\t1 - Задача 1"
            + "\n\t2 - Задача 2"
            + "\n\t3 - Задача 3"
            + "\n\t4 - Задача 4"
            + "\n\t5 - Вернуться назад, в главное меню"
            + "\n\t0 - Выход";
    public static void menuLessonOne() {

        while (true) {
            System.out.println(TASK_MENU);
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    LessonOne.task01();
                    break;
                case 2:
                    LessonOne.task02();
                    break;
                case 3:
                    LessonOne.task03();
                    break;
                case 4:
                    LessonOne.task04();
                    break;
                case 5:
                    Menu.menustart();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Такого меню не существует!");
                    break;
            }
        }
    }
}
