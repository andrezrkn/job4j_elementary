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

        System.out.println("Petr Arsentev");
        System.out.println("Andre Tsarukyan");
        System.out.println("Korobeinikov Stas");
        System.out.println("Sergey Mayer");
    }
}
