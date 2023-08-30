package org.testone.arrayfourexample;

public class ArrayFour {
    public static void main(String... args) {
        boolean[][] arrayFour = {
                {true, false, true},
                {true, false, false, true},
                {true}
        };

        System.out.println("Array content:"+arrayFour);
        for (int parent = 0; parent < arrayFour.length; parent++) {
            System.out.print("Parent " + parent + " has kids: ");
            for (int child = 0; child < arrayFour[parent].length; child++) {
                System.out.print(arrayFour[parent][child] + " ");
            }
            System.out.println();
        }
        System.out.println("Length of array is: " + arrayFour.length);
        System.out.println("End of main method");
    }
}
