package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{23}, {05, 05}, {06, 06, 06}, {95, 95, 95, 95}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: "
                    + numbers[i].length);
        }
    }
}
