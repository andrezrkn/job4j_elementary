package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result.append(symbol);
                symbol = input.charAt(i);
                if (counter != 1) {
                    result.append(counter);
                    counter = 1;
                }
            }
        }
        result = counter > 1 ? result.append(symbol).append(counter)
                : (counter == 1 ? result.append(symbol) : result);
        return result.toString();
    }
}
