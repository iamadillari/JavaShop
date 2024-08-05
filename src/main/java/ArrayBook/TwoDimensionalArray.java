package ArrayBook;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        //declaring array
        //Appraoch 1 , this is useful data is fixed
        int[][] a = new int[3][2];
        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;


        //approach 2, this is useful when size is not fixed
        int[][] b = {{101, 202}, {303, 404}, {505, 606}};

        //find size of an array.
        System.out.println("Length of Rows->"+a.length);
        System.out.println("Length of Columns->"+a[0].length);

        //read a single value from a particular cell
        System.out.println(b[2][0]);

        //read all the rows and columns, then we need to use Loops (we will use nested loop)

        //using normal for loop
        for(int r=0;r< a.length; r++)//0
        {
            for(int c=0; c<a[r].length ; c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }

        //using enhanced for Loop
        for(int[] row:b)
        {
            for(int cell:row)
            {
                System.out.print(cell+" ");
            }
            System.out.println();
        }

    }

}
