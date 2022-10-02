package com.max.idea;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        Scanner in = new Scanner(System.in);
        boolean tip = false;
        for (int i = 1; i < 4; i++){
            System.out.print("Попытка " + i + ": ");
            String answer = in.nextLine();
            if (answer.toLowerCase().equals("заархивированный вирус")) {
                System.out.print("Правильно!");
                break;
            }
            else if ((answer.toLowerCase().equals("подсказка")) && (i == 1)) {
                System.out.println("Это не лук.");
                tip = true;
                i--;
            }
            else if ((answer.toLowerCase().equals("подсказка")) && (i != 1)) {
                System.out.println("Подсказка уже недоступна.");
                i--;
            }
            else if ((tip) && (i >= 1)) {
                System.out.print("Обидно, приходи в другой раз");
                break;
            }
            else if (i == 3)  System.out.print("Обидно, приходи в другой раз");
            else  System.out.println("Подумай еще!");
        }
    }
}



