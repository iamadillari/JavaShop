package ArrayBook;

import java.util.Arrays;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 13, 423478, 234, 4324};
        System.out.println("Original Array is: " + Arrays.toString(a));
        int l = a.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = a[i];
            a[i] = a[l - 1 - i];
            a[l - 1 - i] = temp;
        }
        System.out.println("Reverse Array is: " + Arrays.toString(a));
    }
}
