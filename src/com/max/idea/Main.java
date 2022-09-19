package com.max.idea;

public class Main {
    public static void main(String[] args) {
        double num1 = 58.1234;
        byte num2 = 127;
        int[] myArray = {1,3,5,7,9};
        int numArray = myArray[myArray.length - 1];
        myArray[4]= myArray[0];
        myArray[0] = numArray;
        System.out.println("Сумма первого и среднего элементов = " + (myArray[0] + myArray[myArray.length-3]));
        System.out.println("Hello World!");
    }
}
