package org.example.Lesson_6;

import java.util.*;

public class MenuLessonSix {

    public static void main(String[] args) {
        Map<Integer, String> manuFiltter = ask(menufilter());
        laptops(laptopList(), manuFiltter);
    }

    public static Integer number(int num) {
        Random r = new Random();
        return r.nextInt((num) + 1);
    }

    public static List<String> nameLaptop() {
        List<String> laptopList = new ArrayList<>();
        Collections.addAll(laptopList, "Acer", "Bq", "Msi", "Apple", "Microsoft", "Hp", "Asus", "Sony");
        return laptopList;
    }

    public static List<Integer> ramSize() {
        List<Integer> ramList = new ArrayList<>();
        Collections.addAll(ramList, 4, 6, 8, 16, 32, 64);
        return ramList;
    }

    private static Map<Integer, String> menufilter() {
        Map<Integer, String> menu = new HashMap<>();
        menu.put(1, "Brand");
        menu.put(2, "Processor");
        menu.put(3, "Memory size");
        menu.put(4, "Screen inch");
        menu.put(5, "RAM size");
        menu.put(6, "OS");
        menu.put(7, "Color");
        menu.put(8, "Price");
        return menu;
    }

    private static Map<Integer, String> ask (Map<Integer, String> menu) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, String> result = new HashMap<>();
        while (true) {
            System.out.println("Enter if you would like to find laptops by parameters:(yes/no) ");
            String answer = scan.next();
            if (answer.equals("no")) {
                break;
            }
            else if (answer.equals("yes")) {
//                System.out.println(menu);
                for (int i: menu.keySet())  {
                    System.out.println(i + " " + menu.get(i));
                }
                int intKey = scan.nextInt();
                System.out.println("Enter any parameters for find ");
                String param = scan.next();
                result.put(intKey, param);
            }
            else {
                System.out.println("Repeat if you enter nothing! ");
            }
        }
        return result;
    }
    public static void laptops(ArrayList<Laptop> laptopsList, Map<Integer, String> menufitter) {
        Set<Laptop> listSet = new HashSet<>(laptopsList);
        for (Laptop lap : laptopsList) {
            for (int i : menufitter.keySet()) {
                if (i == 1 && !lap.getBrand().equals(menufitter.get(i))) {
                    listSet.remove(lap);
                }
                for (int i2 : menufitter.keySet()) {
                    if (i2 == 2 && !lap.getProcessor().equals((menufitter.get(i2)))) {
                        listSet.remove(lap);
                    }
                    for (int i3 : menufitter.keySet()) {
                        String memorySize = Integer.toString(lap.getMemorySize());
                        if (i3 == 3 && !memorySize.equals((menufitter.get(i3)))) {
                            listSet.remove(lap);
                        }
                        for (int i4 : menufitter.keySet()) {
                            String screenInch = Double.toString(lap.getScreenInch());
                            if (i4 == 4 && !screenInch.equals((menufitter.get(i4)))) {
                                listSet.remove(lap);
                            }
                            for (int i5 : menufitter.keySet()) {
                                String ramSize = Integer.toString(lap.getRamSize());
                                if (i5 == 5 && !ramSize.equals((menufitter.get(i5)))) {
                                    listSet.remove(lap);
                                }
                                for (int i6 : menufitter.keySet()) {
                                    if (i6 == 6 && !lap.getOs().equals((menufitter.get(i6)))) {
                                        listSet.remove(lap);
                                    }
                                    for (int i7 : menufitter.keySet()) {
                                        if (i7 == 7 && !lap.getColor().equals((menufitter.get(i7)))) {
                                            listSet.remove(lap);
                                        }
                                        for (int i8 : menufitter.keySet()) {
                                            String price = Double.toString(lap.getPrice());
                                            if (i8 == 8 && !price.equals((menufitter.get(i8)))) {
                                                listSet.remove(lap);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (listSet.isEmpty()) {
            System.out.println("Sorry is not result!");
        }
        else {
            System.out.println("Found " + listSet);
        }
    }

    public static ArrayList<Laptop> laptopList() {
        Laptop id1 = new Laptop("Acer", 16, "Intel", 1024, 17.5, "Windows",
                "Black", 899.00);
        Laptop id2 = new Laptop(nameLaptop().get(number(nameLaptop().size() - 1)), ramSize().get(number(ramSize().size() - 1)), "Intel",
                256, 15.6, "Linux", "Silver", 549.99);
        Laptop id3 = new Laptop("\nAsus", 32, "Amd", 512, 17.5, "Windows",
                "White", 799.00);
        Laptop id4 = new Laptop("\n" +  nameLaptop().get(number(nameLaptop().size() - 1)), ramSize().get(number(ramSize().size() - 1)), "Intel",
                1024, 15.6, "Windows", "Dark", 649.99);
        Laptop id5 = new Laptop("\nSony", 4, "Intel", 1024, 17.5, "Windows",
                "Black", 999.00);
        Laptop id6 = new Laptop("\nApple", 16, "M2", 1024, 15.6, "MacOs",
                "Dark Silver", 1599.00);
        Laptop id7 = new Laptop("\nMsi", 6, "Amd", 512, 17.5, "None",
                "Black", 899.00);
        Laptop id8 = new Laptop("\nMicrosoft", 16, "Intel", 256, 15.6, "Windows",
                "White", 899.00);
        Laptop id9 = new Laptop("\nDell", 8, "Amd", 128, 14.5, "Windows",
                "Black", 499.00);
        Laptop id10 = new Laptop("\nHp", 6, "Intel", 512, 15.6, "Linux",
                "Black", 899.00);
        Laptop id11 = new Laptop("\nBq", 8, "Snapdragon", 512, 15.6, "None",
                "White", 499.00);
        ArrayList<Laptop> laptops = new ArrayList<>();
        Collections.addAll(laptops, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11);
        return laptops;
    }
}