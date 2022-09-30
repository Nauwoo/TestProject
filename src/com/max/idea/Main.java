package com.max.idea;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ввод: ");
        String text = in.nextLine();
        char[] test = text.toCharArray();
        int result = 0;
        for (int i = 0; i < test.length; i++) {
            if (Character.isLetter(test[i])) {
                if (test[1] == '+') {
                    switch (i) {
                        case 0:
                            result += Character.getNumericValue(test[4]) - Character.getNumericValue(test[2]); break;
                        case 2:
                            result += Character.getNumericValue(test[4]) - Character.getNumericValue(test[0]); break;
                        case 4:
                            result += Character.getNumericValue(test[0]) + Character.getNumericValue(test[2]); break;
                        default:
                            System.out.print("Что-то не так"); break;
                    }
                } else if (test[1] == '-') {
                    switch (i) {
                        case 0:
                            result += Character.getNumericValue(test[4]) + Character.getNumericValue(test[2]); break;
                        case 2:
                            result += Character.getNumericValue(test[0]) - Character.getNumericValue(test[4]); break;
                        case 4:
                            result += Character.getNumericValue(test[0]) - Character.getNumericValue(test[2]); break;
                        default:
                            System.out.print("Что-то не так"); break;
                    }
                }
            }
        }
        System.out.print("Вывод: " + result);
    }
}



