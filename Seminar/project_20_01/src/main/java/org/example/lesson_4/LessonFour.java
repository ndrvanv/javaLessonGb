package org.example.lesson_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LessonFour {
    private static LinkedList<Integer> linkedNumber;
    private static LinkedList<Integer> linkedNumberOne;

//    public static void main(String[] args) {
//
//        taskNull();
//        taskOne();
//        taskTwo();
//        taskThree();
//    }

    public static void taskNull() {
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//         2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        final int SIZE = 1_000_000;
        ArrayList<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0);  //0 начало 1 конец
        }
        System.out.println("Array List " + (System.currentTimeMillis() - start));

        LinkedList<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0);
        }
        System.out.println("Linked List " + (System.currentTimeMillis() - start));
    }

    public static void taskOne() {
//          Реализовать консольное приложение, которое:
//          Принимает от пользователя строку вида
//          text~num
//          Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//          Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        LinkedList<String> words = new LinkedList<>();

        Scanner input = new Scanner(System.in);
        while(true) {

            System.out.print("Input a string: ");
            String[] str = input.nextLine().split("~");

            if (str[0].equals("print")){
                try {
                    System.out.println(words.get(Integer.parseInt(str[1])));
                    continue;
                } catch (IndexOutOfBoundsException e)  {
                    System.out.println("Несуществующий индекс");
                    continue;
                }
            }

            if (str[0].equals("printall")){
                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));
                }
                continue;
            }

            if (str[0].equals("exit")){
                break;
            }

            if (str.length == 1 || Integer.parseInt(str[1]) < 0) {
                System.out.println("Некорректный ввод");
                continue;
            }


            if (str[0].equals("print")) {
                try {
                    System.out.println(words.get(Integer.parseInt(str[1])));
                } catch (IndexOutOfBoundsException e)  {
                    System.out.println("Несуществующий индекс");
                }
            } else if (str[0].equals("printall")) {
                for (int i = 0; i < words.size(); i++) {
                    System.out.println(words.get(i));
                }

            } else if (str[0].equals("exit") ){
                break;
            } else{
                try {
                    words.remove(Integer.parseInt(str[1]));
                    words.add(Integer.parseInt(str[1]), str[0]);
                } catch (IndexOutOfBoundsException e) {
                    for (int i = words.size(); i < Integer.parseInt(str[1]) ; i++) {
                        words.add(null);
                    }
                    words.add(Integer.parseInt(str[1]), str[0]);
                }
            }


        }
    }


    public static void taskTwo() {
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
        LinkedList<String> words = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите слово: ");
            String word = scanner.nextLine();

            if (word.length() == 0) {
                System.out.println("Строка должна быть заполнена!");
                continue;
            }

            if (!word.contains("print") && !word.contains("revert") && !word.contains("exit")) {
                words.add(0, word);
            }
            if (word.contains("print")) {
                System.out.println(words);
            }
            if (word.contains("exit")) {
                break;
            }
            if (words.size() >= 1 && word.equals("revert")) {
                words.remove();
            }

        }
    }

    public static void taskThree() {
//        Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        LinkedList<Integer>linkedNumberOne = new LinkedList<>();
        LinkedList<Integer>linkedListTwo = new LinkedList<>();

        System.out.print("Введите размерность списка: ");

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        Random rand = new Random();

        for (int i = 0; i < value; i++) {
            int randomNum = rand.nextInt((10 - 1) + 1) + 1;
            linkedNumberOne.add(randomNum);
        }
        System.out.println(linkedNumberOne);
        for (int j = linkedNumberOne.size() - 1; j >= 0; j--) {
            linkedListTwo.add(linkedNumberOne.get(j));
        }
        System.out.println(linkedListTwo);
    }
}
