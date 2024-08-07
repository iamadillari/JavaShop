package ArrayBook;

public class SumOf5FloatElementsInArray {
    public static void main(String[] args) {
        float[] a = {12.4f, 31.5f,10.7f, 11.9f};
        float sum = 0;
        for (float elements:a)
        {
            sum = sum + elements;
        }
        System.out.println("Value of Sum of 5 Float elements in the Array is: "+sum);
    }
}
