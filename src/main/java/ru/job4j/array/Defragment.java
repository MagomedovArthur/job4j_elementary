package ru.job4j.array;

public class Defragment {

    public static String[] compress(String[] array) {
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[count1] = array[i];
                count1++;
            }
        }
        for (int i = count1; i < array.length; i++) {
            array[i] = null;
        }

        for (int index = 0; index < array.length; index++) {
            int count = index;
            if (array[index] == null) {
                for (int i = index + 1; i < array.length; i++) {
                    String temp = array[index];
                    array[index] = array[i];
                    array[index] = temp;
                    break;
                }
            }
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
