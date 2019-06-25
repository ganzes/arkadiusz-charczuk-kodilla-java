package Exercises;

//Napisz metodę, która przyjmuje
//liczbę całkowitą i zwraca "odwróconą" liczbę.
//
//
//
//Dane wejściowe: 17 86 8
//
//Dane wyjściowe: 86 87 1


import com.sun.org.apache.regexp.internal.RE;

public class ReverseNumber {

    public static void main(String[] args) {

        ReverseNumber reverseNumber = new ReverseNumber();
        int reverseNumberReturnMethod = reverseNumber.reverseNumber(123);//a na byc 321

        System.out.println(reverseNumberReturnMethod);

        String reverseStringFinal = reverseNumber.reverseString("ABC");

        System.out.println(reverseStringFinal);
    }

    public int reverseNumber(int entryNumber){
        int result = entryNumber;
        /*for(int i = 0; result > 0; i++){
            int rex = i + 1;
            System.out.println(rex);
        }*/

        String a = String.valueOf(entryNumber);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a);
        stringBuilder.reverse();



        return result;
    }

    public String reverseString (String enterString){
        String result = enterString;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(result);
        stringBuilder = stringBuilder.reverse();

        System.out.println(stringBuilder);

        return result;
    }



}
