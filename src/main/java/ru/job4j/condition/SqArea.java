package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        double heightRectangle = p / (2 * (k + 1));
        double lengthRectangle = heightRectangle * k;
        double rsl = heightRectangle * lengthRectangle;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
