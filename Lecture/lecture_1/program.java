package Lecture.lecture_1;
/*commet */
// commet

// public class program {
//     public static void main(String[] args) {
//         System.out.println("bye world");
//     }
// }

// Типы данных - ссылочные 
// примитивные: boolin, int, short, long, float, double, Char и тд

// Создание переменной 
// <тип> <идентификатор>;
//<идентификатор>=<значение>

// public class program {
//     public static void main(String[] args) {
//         String s = "world";
//         float f = 123.344f;
//         double d = 233.33D;
//         double d2 = 445.44;
//         System.out.println(s);
//         System.out.println(f);
//         System.out.println(d);
//         System.out.println(d2);
//     }
// }
//******************************************** */

// public class program {
//     public static void main(String[] args) {
//         boolean s = true && false;
//         boolean f = true ^ true; // false или разделительная дизьюнкция
//         var d = 233.33; // неявный тип
//         double d2 = 445.44; 
//         System.out.println(s);
//         System.out.println(f);
//         System.out.println(d);
//         System.out.println(d2); //можно ++d2 or d2++
//         System.out.println(getType(d));
//         int i = 23_123_34;
//         System.out.println(Integer.MIN_VALUE);  //для вызова используется обертка от примитива 
//         String s2 = "qwer";
//         s2.charAt(1);
//         boolean f2 = 123 < 234;
//         System.out.println(f2);

//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }
//******************************************************** */
//Тип данных Char

public class program {
    public static void main(String[] argss) {
        char ch = '1';
        System.out.println(Character.isDigit(ch));  //true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); //false
        ch = '{';
        System.out.println(ch);
    }
}





// Побитовые операции 
// public class program {
//     public static void main(String[] args){
//         int a = 8;
//         // 1000
//         //a = a << 1;
//         System.out.println(a << 1);  //16
//         //10000
//         int b = 18;
//         //10010
//         System.out.println(b >> 1);  //9
//         //1001

//         int a1 = 5;
//         int b1 = 2;
//         System.out.println(a1 | b1);  // 7
//         // 101
//         // 010
//         // 111

//         int a2 = 5;
//         int b2 = 2;
//         System.out.println(a2 & b2);  // 0
//         // 101
//         // 010
//         // 000

//         int a3 = 5;
//         int b3 = 2;
//         System.out.println(a3 ^ b3);  // 7
//         // 101
//         // 010
//         // 111
//         String s = "qwer"; // 4, 0..3
//         boolean b4 = s.length() >= 5 && s.charAt(4) == '1';
//         System.out.println(b4);  //false

//     }
// }
//* Примечание && проверка одного условия, & - проверка двух условий
// || проверка одного условия, | - проверка двух условий

//// Массивы
// public class program {
//     public static void main(String[] args){
//         int[] arr = new int[10];
//         arr[3] = 13;
//         System.out.println(arr[3]);

//         int[] arr2 = new int[] {1,2,3};
//         //arr2[2] = 13;
//         System.out.println(arr2[2]);

//         //Многомерные массивы 
//         int[] arr3[] = new int[3] [5];
//         for (int[] line : arr3) {
//             for (int item : line) {
//                 System.out.printf("%d", item);  //использование printf
//             }
//             System.out.println();
//         }

//     }
// }
//***************************** */
//Преоброзования

// public class program {
//     public static void main(String[] args){
//      int i = 123; double d = i;
//      System.out.println(i);  // 123
//      System.out.println(d);  //123.0
//      d = 3.1415; i = (int)d;
//      System.out.println(d); // 3.1415
//      System.out.println(i); //3
//      byte b = Byte.parseByte("123"); // можно преоброзовать значения не более 255
//      System.out.println(b); //123
//     }
// }

//Получение данных от пользователя

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args){
//     Scanner iScanner = new Scanner(System.in);
//     System.out.printf("name: ");
//     String name = iScanner.nextLine();
//     System.out.printf("Привет, %s!", name);  //%s! - особенность vsc
//     System.out.printf("int a: ");
//     int x = iScanner.nextInt();
//     System.out.printf("int b: ");
//     double y = iScanner.nextDouble();
//     System.out.printf("%d + %f = %f", x, y, x + y);

//     //Проверка введенных данных
//     System.out.printf("int a: ");
//     boolean flag = iScanner.hasNextInt(); //проверка на тип введенных данных
//     System.out.println(flag);
//     int i = iScanner.nextInt();
//     System.out.println(i);
//     iScanner.close();
//     }
// }

//****************************************** */
//Форматированный вывод

// public class program {
//     public static void main(String[] args){
//         int a = 1, b = 2;
//         int c = a + b;
//         String res1 = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);  //см. ввиды спецификаторов %d интернете для языка java и вывод чисел после запятой по спецификаторам
//         System.out.println(res1);
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);

//     }
// }

//*************************** */

//Функция и методы
// public class program {
//     public static void main(String[] args){
//         lib.sayHi();
//     }

// }
// Посмотреть управляющие конструкции -- тернарный оператор
/******************************************* */

// Операторы выбора

// public class program {
// public static void main(String[] args){
// int a = 213;

// switch (a) {
// case 1: System.out.println("a");

// break;

// case 2: System.out.println('b');
// break;
// }
// }

// }
// ********************************* */

// Циклы

// public class program {
// public static void main(String[] args){
// int value = 321;
// int count = 0;
// // while
// while (value != 0) {
// value /=10;
// count++;
// }
// System.out.println(count);
// // do while
// do {
// value /=10;
// count++;
// } while (value !=0);
// System.out.println(count);

// // Циклы continue; break
// for (int i = 0; i < 10; i++) {
// if (i % 2 == 0) {
// continue;
// }
// System.out.println(i);
// }

// for (int k = 0; k < 10; k++) {
// for (int j = 0; j < 5; j++) {
// break;
// }
// }
// }

// }

// ************************** */

// Цикл for

// public class program {
//     public static void main(String[] args) {
//         int arr[] = new int[] { 1, 2, 3, 4, 5, 66 };
//         for (int item : arr) {
//             System.out.println(item);
//         }

//     }
// }

//******************************** */

//Работа с файлами *************************************
// Создание и запись \ дозапись 
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append("\n");
//             fw.write('2');
//             fw.append('\n');
//             fw.write('3');
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }

//     }
// }

//************************************ */
//Чтение вариант посимвольно 
// import java.io.*;

// public class program {

//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.println(ch);
//             } else {
//                 System.out.println(ch); 
//             }
//         }
//     }
// }

//************************************** */
// Вариант построчно 
// import java.io.*;

// public class program {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while ((str = br.readLine()) != null) {
//             System.out.printf("== %s == \n", str);
//         }
//         br.close();
//     }
// }