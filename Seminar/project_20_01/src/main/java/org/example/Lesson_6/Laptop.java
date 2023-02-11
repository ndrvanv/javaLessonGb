package org.example.Lesson_6;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (ArrayList).
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
Выводить только те ноутбуки, что соответствуют условию
 */
public class Laptop {
    private String brand;
    private final Integer ramSize;
    private String processor;
    private Integer memorySize;
    private Double screenInch;
    private String os;
    private String color;
     private Double price;

     public Laptop (String brand, Integer ramSize, String processor, Integer memorySize, Double screenInch, String os, String color, Double price) {
          this.brand = brand;
          this.ramSize = ramSize;
          this.processor = processor;
          this.memorySize = memorySize;
          this.screenInch = screenInch;
          this.os = os;
          this.color = color;
          this.price = price;
     }

     public String getBrand() {
          return brand;
     }


     public Integer getRamSize() {
          return ramSize;
     }

     public String getProcessor() {
          return processor;
     }

     public Integer getMemorySize() {
          return memorySize;
     }

     public Double getScreenInch() {
          return screenInch;
     }

     public String getOs() {
          return os;
     }

     public String getColor() {
          return color;
     }

     public Double getPrice() {
          return price;
     }

     @Override
     public String toString() {
          return "Brand: " + brand
                  + "\nProcessor: " + processor
                  + "\nMemory size: " + memorySize
                  + "\nScreen inch: " + screenInch
                  + "\nRAM size: " + ramSize
                  + "\nOS: " + os
                  + "\nColor: " + color
                  + "\nPrice: " + price + "\n";
     }
}
