package ArrayBook;

//Test if an array contains a specific value
public class ArrayContainsSpecificValue {
    public static void main(String[] args) {

        int[] array = {1, 4, 5, 2, 7, 10};
        int specificValue = 9;
        boolean isPresent = false;
        for (int i : array) {
            if (i == specificValue) {
                isPresent = true;
            }

        }
        if (isPresent == true) {
            System.out.println("Yes Value is found in the above Array");
        } else {
            System.out.println("Sorry!! Value is not fount is the above Array");
        }
    }

}