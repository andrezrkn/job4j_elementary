package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return rsl;
    }

    public static void main(String[] args) {
        double a = 3;
        double b = 3;
        double c = 3;
        double rsl = TrgArea.area(a, b, c);
        System.out.println("area (" + a + ", " + b + ", " + c + ") = " + rsl);
    }
}
