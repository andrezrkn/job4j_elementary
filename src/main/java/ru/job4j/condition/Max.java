package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        int left = 5;
        int right = 6;
        int result = Max.max(left, right);
        System.out.println("Of " + left + " and " + right + " max " + result);
    }
}
