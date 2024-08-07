package ArrayBook;


public class ArrayElementsSumUsingMethod {

    public static int[] a = {1, 2, 3, 4, 5};
    public static int[] b = {101, 103, 104, 105, 110, 111};

    public static void main(String[] args) {
        System.out.println("Sum of the Array 'a' is-> " + sum(a));
        System.out.println("Sum of the Array 'b' is-> " + sum(b));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        return sum;
    }
}

