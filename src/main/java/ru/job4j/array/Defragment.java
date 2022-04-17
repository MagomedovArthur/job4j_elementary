package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[count] = array[i];
                count++;
            }
        }
        for (int i = count; i < array.length; i++) {
            array[i] = null;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();

        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
