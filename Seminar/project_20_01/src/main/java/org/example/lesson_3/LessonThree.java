package org.example.lesson_3;

import java.util.*;

import static java.lang.Math.min;

public class LessonThree {


    public static void taskOne() {
        List<String> planets = List.of("Меркурий", "Земля", "Сатурн", "Юпитер", "Марс", "Нептун", "Уран", "Плутон");
        System.out.println(planets);
        int arrSize = 20;
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arrSize; i++) {
            Random random = new Random();
            arrayList.add(planets.get(random.nextInt(planets.size())));
        }
        System.out.println(arrayList);
        int count;
        Collections.sort(arrayList);
//        arrayList.sort(Comparator.naturalOrder());
//        arrayList.sort(String::compareTo);


        for(String planet : planets) {
            count = Collections.frequency(arrayList, planet);    //Считывает количество вхождений в списке
            System.out.println(planet + count);
        }
        Set<String> newSet = new HashSet<>(arrayList);  //Уникальные значения
        System.out.println(newSet);
    }
    public static void taskTwo() {
//        1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        System.out.print("Ведите длину списка: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            arrayList.add(random.nextInt(10 - 1) + 1);
        }
        System.out.println("Созданный список");
        System.out.println(arrayList);

        arrayList.removeIf(x -> (x % 2 == 0));

        System.out.println("Новый список после удаления четных чисел");
        System.out.println(arrayList);
    }
    public static void taskThree() {
//        2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        ArrayList <Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        System.out.print("Ведите длину списка: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            arrayList.add(random.nextInt(11 - 1) + 1);
        }
        System.out.println(arrayList);
        System.out.println("Минимальное значение элемента: " + Collections.min(arrayList));
        System.out.println("Максимальное значение элемента: " + Collections.max(arrayList));
        for (int j = 0; j < arrayList.size(); j++) {
            count += arrayList.get(j);
        }
        System.out.println("Среденее арифметическое: " + (double) count / num);
        }
    }


