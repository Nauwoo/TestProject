package com.max.idea;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.print("Сумма нечетных чисел до введенного: " + sum);
    }
}








 /*       int[] arrayConst = new int[]{1, 3, 5};
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        int len = in.nextInt();
        int[] array = new int[len];
        for (int i = 1; i <= array.length; i++) {
            System.out.print("Введите " + i + "-й элемент массива: ");
            int element = in.nextInt();
            array[i - 1] = element;
        };
        boolean check = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < array.length; j++) {
                if (arrayConst[i] == array[j]) check = true;
            }
            if (check == true) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
            else continue;
        }
    }
}






        Scanner in = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int x = in.nextInt();
        if (x == 1)
            System.out.println("Выберите единицу измерения: 1 - тонна, 2 - килограмм, 3 - грамм");
        else
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
        int y = in.nextInt();
        System.out.println("Введите число: ");
        double z = in.nextDouble();
        if (x == 1) {
            switch (y) {
                case 1 :
                    System.out.println("Результат: ");
                    System.out.println("Тонны: " + z);
                    System.out.println("Килограммы: " + (z * 1000));
                    System.out.println("Граммы: " + (z * 1000000));
                    break;
                case 2 :
                    System.out.println("Результат: ");
                    System.out.println("Килограммы: " + z);
                    System.out.println("Тонны: " + (z * 0.001));
                    System.out.println("Граммы: " + (z * 1000));
                    break;
                case 3 :
                    System.out.println("Результат: ");
                    System.out.println("Граммы: " + z);
                    System.out.println("Тонны: " + (z * 0.000001));
                    System.out.println("Килограммы: " + (z * 0.001));
                    break;
            }
        }
        else {
            switch (y) {
                case 1:
                    System.out.println("Результат: ");
                    System.out.println("Метры: " + z);
                    System.out.println("Мили: " + (z * 0.00062));
                    System.out.println("Ярды: " + (z * 1.09));
                    System.out.println("Футы: " + (z * 3.28));
                    break;
                case 2:
                    System.out.println("Результат: ");
                    System.out.println("Мили: " + z);
                    System.out.println("Метры: " + (z * 1609.34));
                    System.out.println("Ярды: " + (z * 1760));
                    System.out.println("Футы: " + (z * 5280));
                    break;
                case 3:
                    System.out.println("Результат: ");
                    System.out.println("Ярды: " + z);
                    System.out.println("Мили: " + (z * 0.00057));
                    System.out.println("Метры: " + (z * 0.91));
                    System.out.println("Футы: " + (z * 3));
                    break;
                case 4:
                    System.out.println("Результат: ");
                    System.out.println("Футы: " + z);
                    System.out.println("Мили: " + (z * 0.00019));
                    System.out.println("Ярды: " + (z * 0.33));
                    System.out.println("Метры: " + (z * 0.3));
                    break;
            }
        }




        Scanner inDouble = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double x = inDouble.nextInt();
        System.out.print("Введите второе число: ");
        double y = inDouble.nextInt();
        Scanner inText = new Scanner(System.in);
        System.out.print("Выберите арифметическую операцию (+,-,/,*): ");
        String z = inText.nextLine();
        switch (z) {
            case "+" : System.out.println("Результат: " + (x + y));
                break;
            case "-" : System.out.println("Результат: " + (x - y));
                break;
            case "*" : System.out.println("Результат: " + (x * y));
                break;
            case "/" : System.out.println("Результат: " + (x / y));
                break;
            default :  System.out.println("Некорректная операция");
        }





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





       double num1 = 58.1234;
       byte num2 = 127;
       int[] myArray = {1,3,5,7,9};
       int numArray = myArray[myArray.length - 1];
       myArray[4]= myArray[0];
       myArray[0] = numArray;
       System.out.println("Сумма первого и среднего элементов = " + (myArray[0] + myArray[myArray.length-3]));
       System.out.println("Hello World!"); */

