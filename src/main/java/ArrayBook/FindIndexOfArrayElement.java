package ArrayBook;

public class FindIndexOfArrayElement {
    public static void main(String[] args) {
        int[] a = {12, 25, 26, 213, 71, 91};
        int element = 112;
        boolean flag = false;

        for (int i = 0; i < a.length; i++) {
            if(element == a[i])
            {
                System.out.println("Element is present and index of the element is: "+i);
                flag = true;
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("Sorry! Element is not present in the Array.");
        }
    }
}
