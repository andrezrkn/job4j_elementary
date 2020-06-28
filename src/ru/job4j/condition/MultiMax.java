package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first > second ? first : second;
        result = third > result ? third : result;
        return result;
    }

    public static void main(String[] args) {
        int first = 1;
        int second = 2;
        int third = 3;
        int max = MultiMax.max(first, second, third);
        System.out.println("Of " + first + " and " + second + " and " + third + " max " + max);
    }
}
