package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }

    public static void main(String[] args) {
        double ab = 4;
        double ac = 5;
        double bc = 6;
        boolean exist = Triangle.exist(ab, ac, bc);
        if (exist) {
            System.out.println("Triangle exist");
        } else {
            System.out.println("Triangle no exist");
        }

    }
}
