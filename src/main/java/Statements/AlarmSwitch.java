package Statements;

public class AlarmSwitch {
    public static void main(String[] args) {
        String day = "Friday";

        switch (day)
        {

            case "Friday": {
                System.out.println("Set an Alarm at 7 am");
                break;
     }
            case "Saturday": {
                System.out.println("Set an Alarm at 6:30 am");
                break;
            }
            case "Sunday":
            {
                System.out.println("Set an Alarm at 8 am");
                break;
            }
            default:
            {
                System.out.println("Invalid Day entered!!");
            }

        }
    }
}
