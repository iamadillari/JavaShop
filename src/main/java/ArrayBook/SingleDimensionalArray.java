package ArrayBook;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        //approach 1: when we are aware with size...like size is fixed
        int[] a = new int[5]; //declaration of array
        //initialization of values...
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        //approach 2: this is useful when size is not sure, like it's more dynamic
        int[] b = {1, 2, 3, 4, 5, 6, 7}; //declaration and initialization both
        //find length of an array
        int sizeOfArray = b.length;
        System.out.println("Length of Array->" + sizeOfArray);

        //print all values from the array
        for (int i : a) {
            System.out.println(i);
        }

    }
}
