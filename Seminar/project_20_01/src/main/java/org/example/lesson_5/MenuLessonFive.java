package org.example.lesson_5;

import org.example.Menu;
import org.example.lesson_4.LessonFour;

import java.util.Scanner;

public class MenuLessonFive {

        private static final String TASK_MENU = "Выберите нужный пункт меню: "
                + "\n\t1 - Задача 1"
                + "\n\t4 - Вернуться назад, в главное меню"
                + "\n\t0 - Выход";

        public static void menuLessonFive() {

            while (true) {
                System.out.println(TASK_MENU);
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        LessonFive.main();
                        break;
                    case 2:
                        Menu.menustart();
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Такого меню не существует!");
                        break;

                }
            }
        }


}
