package Statements;

public class SwitchDays {
    public static void main(String[] args) {
        int n = 8;
        switch (n)
        {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("Wow!! It's Sunday");
                break;
            default:
                System.out.println("Oops!! Enter a valid number");
                break;
        }
    }
}
