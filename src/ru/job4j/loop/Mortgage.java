package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double amt = amount;
        double slr = salary;
        percent = percent / 100;

        while (amt > 0) {
            amt  = amt + amt * percent;
            amt = amt - salary;
            year++;
        }
        return year;
    }
}
