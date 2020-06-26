package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / ( 2 * ( k + 1 ));
        double rsl = h * h * k;
        return rsl;
    }

    public static void main(String[] args) {
        int p = 6;
        int k = 2;
        double result1 = SqArea.square(p, k);
        System.out.println(" p = " + p + ", k = " + k + ", square = " + result1);
    }
}
