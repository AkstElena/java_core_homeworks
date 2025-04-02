/*
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
 */

package homework2;

import java.util.Arrays;

public class Task3 {

    public static boolean zeroNeighbors(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == 0) && (arr[i + 1]) == 0) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] array1 = {2, 0, 3, 4, 15};
        System.out.println("В массиве " + Arrays.toString(array1) + " есть рядом два нуля: " + zeroNeighbors(array1));
        int[] array2 = {0, 0};
        System.out.println("В массиве " + Arrays.toString(array2) + " есть рядом два нуля: " + zeroNeighbors(array2));
        int[] array3 = {0, 3, 0};
        System.out.println("В массиве " + Arrays.toString(array3) + " есть рядом два нуля: " + zeroNeighbors(array3));
        int[] array4 = {2, 0, 0, 3, 4, 15};
        System.out.println("В массиве " + Arrays.toString(array4) + " есть рядом два нуля: " + zeroNeighbors(array4));
    }
}
