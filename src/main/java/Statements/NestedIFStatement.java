package Statements;

public class NestedIFStatement {
    public static int age = 17;
    public static boolean nationality = true;

    public static void main(String[] args) {
        vote(age, nationality);
        vote(28, true);
    }

    public static void vote(int age, boolean nationality) {
        if (age >= 18) {
            if (nationality == true) {
                System.out.println("You are Indian, you are eligible for the Voting!!");
            } else {
                System.out.println("Sorry!! You are not an Indian, you are not eligible for the Voting!!");
            }
        } else {
            System.out.println("Sorry!! You are under 18, you are not eligible for the Voting!!");
        }
    }

}
