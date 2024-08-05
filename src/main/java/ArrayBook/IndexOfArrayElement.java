package ArrayBook;

public class IndexOfArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 21, 9};
        int number = 1;
        boolean isPresent = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                isPresent = true;
                System.out.println("Yes, Number is present at index->" + i);
            }
        }
        if(isPresent==false)
        System.out.println("Sorry! Value is not present in above array.");
    }
}
