/*
Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) →
3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */

package homework2;

import java.util.Arrays;

public class Task1 {

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;

    }


    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        System.out.println("Количество четных элементов массива " + Arrays.toString(array1) + ": " + countEvens(array1));
        int[] array2 = {2, 2, 0};
        System.out.println("Количество четных элементов массива " + Arrays.toString(array2) + ": " + countEvens(array2));
        int[] array3 = {1, 3, 5};
        System.out.println("Количество четных элементов массива " + Arrays.toString(array3) + ": " + countEvens(array3));
    }
}
