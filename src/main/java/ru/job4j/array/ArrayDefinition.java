package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Andre Tsarukyan";
        names[2] = "Korobeinikov Stas";
        names[3] = "Sergey Mayer";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println("mass ages size: " + ages.length);
        System.out.println("mass surnames size:" + surnames.length);
        System.out.println("mass prices size:" + prices.length);
    }
}
