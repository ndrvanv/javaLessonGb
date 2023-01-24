package lesson_1;

import java.security.KeyStore;
import java.util.Arrays;
import java.util.Scanner;

//lowerCamelCase - methods, vars
//UpperCamelCase - classes
public class Main {
    public static void main(String[] args) {
//        task01();
//        task02();
//        task03();
        task04();
    }

    static void task01() {
        System.out.println("Как вас зовут? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Привет " + name);
    }

    static void task02() {
//        1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int min_num = 0;
        int max_num = 0;
        int[] arr = {4, 8, -7, 33, 9, 110};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_num) {
                max_num = arr[i];
            } else if (arr[i] < min_num) {
                min_num = arr[i];
            }
        }
        System.out.println("Минимальное число: " + min_num);
        System.out.println("Максимальное число: " + max_num);
    }

    static void task03() {
//        2. Написать метод, который определяет, является ли введенный пользователем год високосным,
//        и возвращает в консоль boolean (високосный - true, не високосный - false). Каждый 4-й год
//        является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        boolean ifInputError = true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год чтобы узнанать вискосный или нет: ");
        int num = 0;
        while (ifInputError) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                ifInputError = false;
                boolean isLeapYear = num % 400 == 0 || num % 100 != 0 && num % 4 == 0;
                System.out.println(isLeapYear ? "високосный " + isLeapYear : "не високосный " + isLeapYear);
            }
            else {
                System.out.println("Ошибка введите год в числах!");
                scanner.next();
            }
        }



    }

    static void task04(){
//        3. Дан массив nums = [3,2,2,3] и число val = 3.
//          Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//          Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        int [] arr = {2, 1, 3, 2, 1, 3, 2, 1};
        int left = 0;
        int val = 3;
        int temp = 0;
        int right = arr.length - 1;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        System.out.println(Arrays.toString(arr));
        while (left < right) {
            if (arr[left] == val && arr[right] != val) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
            else if (arr[left] != val ) {
                left ++;

            }
            else if (arr[right] == val) {
                right --;
            }

        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.printf("%d ", arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
    }

}
