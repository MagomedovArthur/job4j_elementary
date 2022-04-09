package ru.job4j.calculator;

public class Max {
    public static void main(String[] args) {
        int num1 = 12, num2 = 15, num3 = 7;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("max: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("max: " + num2);
        } else {
            System.out.println("max: " + num3);
        }
    }
}
