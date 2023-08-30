package org.testone.arraythreexample;

public class ArrayThree {
    public static void main(String... args) {
        double[][] arrayThree = {
                {12, 71},
                {70, 18, 19},
                {7, 7, 7, 20},
                {7, 8, 9, 8, 5},
                {78, 91, 92, 86, 57, 8}
        };

        System.out.println("Array content:"+arrayThree);
        for (int parent = 0; parent < arrayThree.length; parent++) {
            System.out.print("Parent " + parent + " has kids: ");
            for (int child = 0; child < arrayThree[parent].length; child++) {
                System.out.print(arrayThree[parent][child] + " ");
            }
            System.out.println();
        }
        System.out.println("Length of array is: " + arrayThree.length);
        System.out.println("End of main method");
    }
}
