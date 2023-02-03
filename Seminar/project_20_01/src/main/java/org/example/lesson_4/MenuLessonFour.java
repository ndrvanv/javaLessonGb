package org.example.lesson_4;

import org.example.Menu;
import org.example.lesson_2.LessonTwo;
import org.example.lesson_3.LessonThree;

import java.util.Scanner;

public class MenuLessonFour {
    private static final String TASK_MENU = "Выберите нужный пункт меню: "
            + "\n\t1 - Задача 1"
            + "\n\t2 - Задача 2"
            + "\n\t3 - Задача 3"
            + "\n\t4 - Вернуться назад, в главное меню"
            + "\n\t0 - Выход";
    public static void menuLessonFour() {

        while (true) {
            System.out.println(TASK_MENU);
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    LessonFour.taskOne();
                    break;
                case 2:
                    LessonFour.taskTwo();
                    break;
                case 3:
                    LessonFour.taskThree();
                    break;
                case 4:
                    Menu.menustart();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Такого меню не существует!");
                    break;

            }
        }
    }
}
