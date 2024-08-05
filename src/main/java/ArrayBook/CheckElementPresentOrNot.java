package ArrayBook;

public class CheckElementPresentOrNot {

    public static void main(String[] args) {
        int[] a = {123, 211, 200, 312, 716, 321, 123, 321, 8721, 4324, 534, 321, 343, 312, 321, 871, 321};
        int check = 321;
        int count = 0;
        boolean foundOrNot = false;
        for(int x:a)
        {
            if(x==check)
            {
                foundOrNot = true;
                count++;
            }
        }
        if (foundOrNot == false)
        {
            System.out.println("Sorry! Element not found in the Array");
        }
        else
        {
            System.out.println("Yes! Element Found and total count is->"+count);
        }
    }

}
