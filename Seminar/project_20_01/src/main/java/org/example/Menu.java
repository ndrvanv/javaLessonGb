package org.example;

import org.example.lesson_1.MenuLessonOne;
import org.example.lesson_2.MenuLessonTwo;
import org.example.lesson_3.MenuLessonThree;

import java.util.Scanner;

public class Menu {
    private static final String MAIN_MENU = "Выберите нужный пункт меню: "
            + "\n\t1 - Урок 1. Знакомство с языком программирования Java"
            + "\n\t2 - Урок 2 Почему вы не можете не использовать API"
            + "\n\t3 - Урок 3 Коллекции JAVA: Введение"
            + "\n\t4 - Урок 4 Хранение и обработка данных ч1: приоритетные коллекции"
            + "\n\t5 - Урок 5 Хранение и обработка данных ч2: множество коллекций Map"
            + "\n\t6 - Урок 6 Хранение и обработка данных ч3: множество коллекций Set"
            + "\n\t0 - Выход";
    public static void menustart() {

        while (true) {
            System.out.println(MAIN_MENU);
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    MenuLessonOne.menuLessonOne();
                    break;
                case 2:
                    MenuLessonTwo.menuLessonTwo();
                    break;
                case 3:
                    MenuLessonThree.menuLessonThree();
                    break;
            }
        }
    }
}
