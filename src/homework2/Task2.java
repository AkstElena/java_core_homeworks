/*
Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
 */

package homework2;

import java.util.Arrays;

public class Task2 {

    public static int difMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if ((arr[i] < min)) {
                min = arr[i];
            }
        }
        return max - min;

    }


    public static void main(String[] args) {
        int[] array1 = {2, 2, 3, 4, 15};
        System.out.println("Разница между самым большим и самым маленьким элементом массива  "
                + Arrays.toString(array1) + ": " + difMaxMin(array1));
        int[] array2 = {0, 0};
        System.out.println("Разница между самым большим и самым маленьким элементом массива  "
                + Arrays.toString(array2) + ": " + difMaxMin(array2));
        int[] array3 = {-8, 3, 5};
        System.out.println("Разница между самым большим и самым маленьким элементом массива  "
                + Arrays.toString(array3) + ": " + difMaxMin(array3));
    }
}
