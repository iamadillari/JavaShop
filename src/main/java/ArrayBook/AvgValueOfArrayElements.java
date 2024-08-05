package ArrayBook;

//Calculate the average value of array elements
public class AvgValueOfArrayElements {
    static int[] array = {1, 2, -13, 141, 251};
    static int sum = 0;
    static int noOfElements = array.length;

    public static void main(String[] args) {
        for (int i : array) {
            sum = sum + i;
        }
        double avg = sum/noOfElements;
        System.out.println("Average value of Array Elements is-> "+avg);
    }

}
