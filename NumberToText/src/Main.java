public class Main {

    public static String FINAL_ANSWER="";

    private static final String[] onesNames = {
            "صفر",
            "یک",
            "دو",
            "سه",
            "چهار",
            "پنج",
            "شش",
            "هفت",
            "هشت",
            "نه"
    };

    private static final String[] tensNames = {

            "ده",
            "بیست",
            "سی",
            "چهل",
            "پنجاه",
            "شصت",
            "هفتاد",
            "هشتاد",
            "نود"
    };



    private static final String [] twoDigits = {
            "یازده",
            "دوازده",
            "سیزده",
            "چهارده",
            "پانزده",
            "شانزده",
            "هفده",
            "هجده",
            "نوزده"
    };

    private static final String [] threeDigit = {
            "",
            "صد",
            "دویست",
            "سی صد",
            "چهار صد",
            "پانصد",
            "ششصد",
            "هفتصد",
            "هشتصد",
            "نهصد"
    };

//    public String convertNumberToWord(int number){
//        String sNumber = String.valueOf(number);
//        String[] a = new String[sNumber.length()];
//        System.out.println(a[0]);
//
//
//    }

    public static void main(String[] args) {
        String sNumber = String.valueOf(453);
//        String[] a = new String[sNumber.length()];
        String[] splitNumber = sNumber.split("");
        int answer = 0;
        for (int i = 0; i < splitNumber.length; i++) {
            answer = Integer.valueOf(splitNumber[0]);
        }
//        System.out.println(answer);
        for (int i = 1; i < splitNumber.length; i++) {
            splitNumber[i]="0";
        }
        String number = "";
        for (int i = 0; i < splitNumber.length; i++) {
            System.out.println("x000 : " +splitNumber[i]);
            number += splitNumber[i];
        }
        System.out.println("real number : "+sNumber);
        System.out.println("number : "+number);
        System.out.println("firstDigit : "+answer);

        if (Integer.valueOf(number) % 100 == 0){
            switch (answer){
                case 1:
                    FINAL_ANSWER = threeDigit[1]+"و";
                    break;
                case 2:
                    FINAL_ANSWER = threeDigit[2]+"و";
                    break;
                case 3:
                    FINAL_ANSWER = threeDigit[3]+"و";
                    break;
                case 4:
                    FINAL_ANSWER = threeDigit[4]+"و";
                    break;
                case 5:
                    FINAL_ANSWER = threeDigit[5]+"و";
                    break;
                case 6:
                    FINAL_ANSWER = threeDigit[6]+"و";
                    break;
                case 7:
                    FINAL_ANSWER = threeDigit[7]+"و";
                    break;
                case 8:
                    FINAL_ANSWER = threeDigit[8]+"و";
                    break;
                case 9:
                    FINAL_ANSWER = threeDigit[9]+"و";
                    break;
            }
        }
        splitNumber = sNumber.split("");
        for (int i = 2; i < splitNumber.length; i++) {
            splitNumber[i]="0";
        }
        for (int i = 0; i < splitNumber.length; i++) {
            System.out.println(splitNumber[i]);
        }
    }
}