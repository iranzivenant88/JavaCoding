package org.testone.arraytwoexample;

public class ArrayTwo {
    public static void main(String... args) {
        int[][] arrayTwo = {
                {7, 67, 3},
                {77, 78, 79, 80},
                {11, 12},
                {12, 1, 3}
        };

        System.out.println("Array content:"+arrayTwo);
        for (int parent = 0; parent < arrayTwo.length; parent++) {
            System.out.print("Parent " + parent + " has kids: ");
            for (int child = 0; child < arrayTwo[parent].length; child++) {
                System.out.print(arrayTwo[parent][child] + " ");
            }
            System.out.println();
        }
        System.out.println("Length of array is: " + arrayTwo.length);
        System.out.println("End of main method");
    }
}
