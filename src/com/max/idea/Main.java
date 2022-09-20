package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        double x = in.nextInt();
        System.out.print("Введите значение y: ");
        double y = in.nextInt();
        System.out.print("Введите значение z: ");
        double z = in.nextInt();
        double a = (x+y+z)/3;
        System.out.println("Среднее арифметическое - " + a);
        a /= 2;
        int b = (int) a;
        if (b > 3)
            System.out.println("Программа выполнена корректно");

       //double num1 = 58.1234;
       //byte num2 = 127;
       //int[] myArray = {1,3,5,7,9};
       //int numArray = myArray[myArray.length - 1];
       //myArray[4]= myArray[0];
       //myArray[0] = numArray;
       //System.out.println("Сумма первого и среднего элементов = " + (myArray[0] + myArray[myArray.length-3]));
       //System.out.println("Hello World!");
    }
}
