package ArrayBook;

public class SumOfElements {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6,8};
        int sum = 0;
        for(int x:a)
        {
            sum = sum+x;
        }
        System.out.println(sum);
    }
}
