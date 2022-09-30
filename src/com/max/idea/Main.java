package com.max.idea;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите курс доллара: ");
        double rate = in.nextDouble();
        System.out.print("Введите количество рублей: ");
        double count = in.nextDouble();
        String result = String.format("%.2f", count * rate);
        System.out.print("Итого: " + result);
    }
}



