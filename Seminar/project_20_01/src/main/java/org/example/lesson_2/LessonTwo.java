package org.example.lesson_2;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LessonTwo {


    public static void taskOne() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первой символ ");
        String str1 = scan.next(); //next - считывание до пробела
        System.out.print("Введите второй символ ");
        String str2 = scan.next();
        System.out.print("Введите длину строки ");
        int repeat = scan.nextInt();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; builder.length() < repeat; i++) {
            builder.append(str1);
            builder.append(str2);
        }
        if (repeat % 2 != 0) {
            builder.delete(builder.length() - 1, builder.length()); // StringBuilder delete(int start, int end) Удаляет символы в подстроке этой последовательности.
        }
        System.out.println(builder);

    }

    public static void taskTwoNotWork() { // Полурабочий вариант
//    1. Напишите метод, который принимает на вход строку (String) и определяет
//    является ли строка палиндромом (возвращает boolean значение).
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите палидром ");
        String str = scan.nextLine();
        int count = 0;
        char [] ch = str.toCharArray();
        int reverse = ch.length;

        if (ch.length % 2 == 0) {
            while (reverse / 2 >= count) {

                if (ch[count] == ch[reverse - 1]) {
                    count++;
                    reverse --;
                    if (count == reverse / 2) {
                        boolean bool = count == reverse / 2;
                        System.out.println(bool);
                    }
                }
                else {
                    boolean bool = count == reverse / 2;
                    System.out.println(bool);
                    break;
                }
            }
        }
    }

    public static void taskTwo() { // Рабочий вариант
        //    1. Напишите метод, который принимает на вход строку (String) и определяет
//    является ли строка палиндромом (возвращает boolean значение).
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите палидром ");
        String str = scan.nextLine();
        boolean bool = isPalidrome(str);
        System.out.println(bool);
    }
    static boolean isPalidrome(@NotNull String strs) {
        int length = strs.length();
        for (int i = 0; i < strs.length(); i++) {
            if (strs.charAt(i) != strs.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void taskThree() {
//        2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST
//        и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.
        String str = "TEST ";
        int number = 101;
        StringBuilder sb = fileWriter(str, number);
        System.out.println(sb);
        writerFile(str, number);

    }
    static StringBuilder fileWriter (String words, int num) {

        StringBuilder word = new StringBuilder();
        for (int i = 0; i < num; i++) {
            word.append(words);
        }
        return word;
    }

    static void writerFile(String text, int num){
        File file = new File("src/main/java/lesson_2/textLes2.txt");
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int j = 0; j < num; j ++) {
                writer.println(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }




}

