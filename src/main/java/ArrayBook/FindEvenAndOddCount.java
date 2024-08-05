package ArrayBook;

public class FindEvenAndOddCount {
    public static void main(String[] args) {
        int[] a = {1,12,23,31,44,62,19,22};
        int even = 0;
        int odd = 0;
        for(int x:a)
        {
            if(x%2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Total no of Even elements are->"+even);
        System.out.println("Total no of Even elements are->"+odd);
    }
}
