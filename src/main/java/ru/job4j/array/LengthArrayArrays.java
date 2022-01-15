package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{4}, {3, 4}, {2, 3, 4}, {1, 2, 3, 4}};
        for (int[] length: numbers) {
            System.out.println(length.length);
        }
    }
}
