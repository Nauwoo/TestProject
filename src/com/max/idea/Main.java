package com.max.idea;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Укажите количество строк: ");
        int count = in.nextInt();
        String[] stringArray = new String[count];
        Scanner inLine = new Scanner(System.in);
        for (int i = 1; i <= count; i++){
           System.out.print("Введите строку " + i + ": ");
           stringArray[i-1] = inLine.nextLine();
        }
        int max = 0;
        String temp2 = "";
        for (int i = 0; i < stringArray.length; i++){
            int countOfUniqueChars = stringArray[i].length();
            for (int j = 0; j < stringArray[i].length(); j++){
                if (j != stringArray[i].indexOf(stringArray[i].charAt(j))){
                    countOfUniqueChars--;
                }
            }
           if (countOfUniqueChars > max) {
               max = countOfUniqueChars;
               temp2 = stringArray[i];
           }
        }
        System.out.print("Ответ: " + temp2);
    }
}



