package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        input += " ";
        String result = "";
        int counter = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                counter++;
            } else {
                result += input.charAt(i);
                result += counter == 1 ? "" : counter;
                counter = 1;
            }
        }
        return result;
    }
}