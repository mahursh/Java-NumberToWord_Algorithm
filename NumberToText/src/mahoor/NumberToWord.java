package mahoor;

public class NumberToWord {





//    public String numToWord(String  strNum , Integer ... intNum){
//    public String finalAnswer ;

    public static void main(String[] args) {

        String strNum = "215";

//      should it be Char[]?
        String[] numberDigits = strNum.split("");
        int length = numberDigits.length;


        Integer secondDigit=Integer.valueOf( numberDigits[1]);

//         Regex regex = "(\\d{1}\\d)";



//--------------------------------------------------------------------


        if(length==3){
            Integer singleDigit=Integer.valueOf( numberDigits[0]);
            switch (singleDigit){
                    case 1 :
                        System.out.print(NumberLists.hundredsNames[1] +  " و "  );
                        break;

                    case 2 :
                        System.out.print(NumberLists.hundredsNames[2]+  " و " );
                        break;

                    case 3 :
                        System.out.print(NumberLists.hundredsNames[3]+  " و " );
                        break;

                    case 4 :
                        System.out.print(NumberLists.hundredsNames[4]+  " و " );
                        break;

                    case 5 :
                        System.out.print(NumberLists.hundredsNames[5]+  " و " );
                        break;

                    case 6 :
                        System.out.print(NumberLists.hundredsNames[6]+  " و " );
                        break;

                    case 7 :
                        System.out.print(NumberLists.hundredsNames[7]+  " و " );
                        break;

                    case 8 :
                        System.out.print(NumberLists.hundredsNames[8]+  " و " );
                        break;

                    case 9 :
                        System.out.print(NumberLists.hundredsNames[9]+  " و " );
                        break;


                }
        }
        --length;
        //--------------------------------------------------------------------

        if (length==2 && secondDigit==1){

            Integer thirdDigit=Integer.valueOf( numberDigits[2]);
            switch (thirdDigit){


                case 0 :
                    System.out.print(NumberLists.twoDigits[0]);
                    break;

                case 1 :
                    System.out.print(NumberLists.twoDigits[1]);
                    break;

                case 2 :
                    System.out.print(NumberLists.twoDigits[2]);
                    break;

                case 3 :
                    System.out.print(NumberLists.twoDigits[3]);
                    break;

                case 4 :
                    System.out.print(NumberLists.twoDigits[4]);
                    break;

                case 5 :
                    System.out.print(NumberLists.twoDigits[5]);
                    break;

                case 6 :
                    System.out.print(NumberLists.twoDigits[6]);
                    break;

                case 7 :
                    System.out.print(NumberLists.twoDigits[7]);
                    break;

                case 8 :
                    System.out.print(NumberLists.twoDigits[8]);
                    break;

                case 9 :
                    System.out.print(NumberLists.twoDigits[9]);
                    break;




            }

            --length;

        }
        //--------------------------------------------------------------------


        if(length==2){
            Integer singleDigit=Integer.valueOf( numberDigits[1]);

            switch (singleDigit){

                case 2 :
                    System.out.print(NumberLists.tensNames[1]+  " و " );
                    break;

                case 3 :
                    System.out.print(NumberLists.tensNames[2]+  " و " );
                    break;

                case 4 :
                    System.out.print(NumberLists.tensNames[3]+  " و " );
                    break;

                case 5 :
                    System.out.print(NumberLists.tensNames[4]+  " و " );
                    break;

                case 6 :
                    System.out.print(NumberLists.tensNames[5]+  " و " );
                    break;

                case 7 :
                    System.out.print(NumberLists.tensNames[6]+  " و " );
                    break;

                case 8 :
                    System.out.print(NumberLists.tensNames[7]+  " و " );
                    break;

                case 9 :
                    System.out.print(NumberLists.tensNames[8]+  " و " );
                    break;




            }
            --length;
        }
        //--------------------------------------------------------------------


        if (length==1 && secondDigit!=1){
            Integer singleDigit=Integer.valueOf( numberDigits[2]);

            switch (singleDigit){
                case 1 :
                    System.out.print(NumberLists.onesNames[1]);
                    break;

                case 2 :
                    System.out.print(NumberLists.onesNames[2]);

                    break;

                case 3 :
                    System.out.print(NumberLists.onesNames[3]);

                    break;

                case 4 :
                    System.out.print(NumberLists.onesNames[4]);

                    break;

                case 5 :

                    System.out.print(NumberLists.onesNames[5]);

                    break;

                case 6 :

                    System.out.print(NumberLists.onesNames[6]);

                    break;

                case 7 :
                    System.out.print(NumberLists.onesNames[7]);

                    break;

                case 8 :

                    System.out.print(NumberLists.onesNames[8]);

                    break;

                case 9 :

                    System.out.print(NumberLists.onesNames[9]);

                    break;




            }
        }
        //--------------------------------------------------------------------













        //       todo: Validation Before Anything !!!!!!
        if (length==0){

            System.out.print("None");
        }
        if (length>3){
            System.out.print("Sorry! We Can't Handel It Right Now :) ");
        }









//        return finalAnswer;
    }






}
