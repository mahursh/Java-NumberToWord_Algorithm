package mahoor;




public class SwitchCaseTest {


public static String month = "AUGUST";

    public static void main(String[] args) {
        var result = switch (month) {
            case "JANUARY", "JUNE", "JULY" -> 3;
            case "FEBRUARY", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" -> 1;
            case "MARCH", "MAY", "APRIL", "AUGUST" -> {
                int monthLength = month.length();
                yield monthLength * 4;

            }
            default -> 0;
        };

        System.out.println(result);


//-------------------------------------------------------------------------------------------


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

//-------------------------------------------------------------------------------------------

//    Enum Switch Case:

//     enum Days {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//
//    Days days = Days.SUNDAY;
//
//-------------------------------------------------------------------------------------------

/**
     returning with break
     just work for JDK below
     13. from JDK 13 the word
     "break" was replaced with "yield".
 **/

//        public String day = "SUNDAY";
//        return switch (day) {
//            case "Monday":
//                break "Weekday";
//            case "Tuesday":
//                break "Weekday";
//            case "Wednesday":
//                break "Weekday";
//            case "Thursday":
//                break "Weekday";
//            case "Friday":
//                break "Weekday";
//            case "Saturday":
//                break "Weekend";
//            case "Sunday":
//                break "Weekend";
//            default:
//                break "Unknown";
//        };


//-------------------------------------------------------------------------------------------



//        public String day = "SUNDAY";
//
//        return  switch (day) {
//            case "Monday":
//                yield  "Weekday";
//            case "Tuesday":
//                yield "Weekday";
//            case "Wednesday":
//                yield "Weekday";
//            case "Thursday":
//                yield "Weekday";
//            case "Friday":
//                yield "Weekday";
//            case "Saturday":
//                yield "Weekend";
//            case "Sunday":
//                yield "Weekend";
//            default:
//                yield "Unknown";
//        };

//-------------------------------------------------------------------------------------------


//        Pattern Matching :
//
//        It has introduced a new feature for switch i.e called pattern matching.
//
//        You can match patterns in a case label.
//
//                In other words you can pass objects in switch condition and this object can be checked for different types in switch case labels.

//        Object obj = new Object();
//        return switch (obj) {
//            case Integer i -> "It is an integer";
//            case String s -> "It is a string";
//            case Employee s -> "It is a Employee";
//            default -> "It is none of the known data types";
//        };
//


//-------------------------------------------------------------------------------------------

    }


}
