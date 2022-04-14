package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        while (amount > 0) {
            percent = percent / 100;
            double credit = amount + amount * percent;
            amount = credit - salary;
            year++;
        }

        return year;
    }
}
