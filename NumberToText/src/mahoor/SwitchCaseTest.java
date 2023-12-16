package mahoor;



public class SwitchCaseTest {


public static String month = "AUGUST";

    public static void main(String[] args) {
        var result = switch (month){
            case "JANUARY", "JUNE","JULY" ->3;
            case "FEBRUARY", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" -> 1;
            case "MARCH", "MAY", "APRIL", "AUGUST" -> {
                int monthLength = month.length();
                yield monthLength *4;

            }
            default -> 0;
        };

        System.out.println(result);
    }




//        switch (month){
//        case "JANUARY", "JUNE", "JULY" -> {return 3;}
//
//        case "FEBRUARY", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" -> {return 1;}
//
//        case "MARCH", "MAY", "APRIL", "AUGUST" -> {
//            int monthLength = month.length();
//            return monthLength;
//        }
//        default -> 0;
//    };

}
