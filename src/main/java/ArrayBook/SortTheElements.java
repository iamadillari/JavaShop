package ArrayBook;

public class SortTheElements {
    public static void main(String[] args) {
        int[] a = {13, 89, 43, 66, 10, 94};
        int temp=0;
        for(int x:a)
        {
            for(int y:a)
            {
                if(temp<x)
                {
                    temp=x;
                }
            }
        }
    }
}
