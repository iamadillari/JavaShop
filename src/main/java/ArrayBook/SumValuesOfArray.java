package ArrayBook;

//Write a Java program to sum values of an array.
public class SumValuesOfArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 3, 6, 10, 4};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of the values of Array-> " + sum);
    }
}
