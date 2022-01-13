package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
       return sum(first, second)
               + multiply(first, second);
    }

    public static double substractAndSeparation(double first, double second) {
        return substraction(10, 20)
                - separation(10, 20);
    }

    public static double fourInOne(double first, double second) {
        return substraction(10, 20)
                + separation(10, 20)
                + sumAndMultiply(10, 20);
    }

    public static void main(String[] args) {
        System.out.println("Сумма умножения и сложения: "
                + sumAndMultiply(10, 20));
        System.out.println("Разность вычитания и деления: "
                + substractAndSeparation(10, 20));
        System.out.println("сумма 4 арифметических операций: "
                + fourInOne(10, 20));
    }
}
