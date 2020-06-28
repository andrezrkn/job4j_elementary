package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {

        boolean ext = (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac) ? true : false;
        return ext;
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
