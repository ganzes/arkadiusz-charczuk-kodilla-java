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
    }



    public int reverseNumber(int entryNumber){
        int result = entryNumber;

        for(int i = 0; result > 0; i++){
            System.out.println(i);
        }

        return result;
    }


}
