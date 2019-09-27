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

import java.util.TreeSet;

public class ReverseNumber {

    public static void main(String[] args) {

        ReverseNumber reverseNumber = new ReverseNumber();
        int reverseNumberReturnMethod = reverseNumber.reverseNumber(123);//a na byc 321

        System.out.println(reverseNumberReturnMethod);

        String reverseStringFinal = reverseNumber.reverseString("ABC");

        System.out.println(reverseStringFinal);


        reverseNumber.reverseNumbe2r(1,2,3);

        reverseNumber33(556699);
    }

    public int reverseNumber(int entryNumber){
        int result = entryNumber;
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

    public void reverseNumbe2r (int x, int z, int c){
        TreeSet<Integer> reve = new TreeSet<Integer>();
        reve.add(x);
        reve.add(z);
        reve.add(c);

        System.out.println(reve.descendingSet());

    }

    public static void reverseNumber33(int number) {
        int reverse = 0;
        while (number >= 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
            if (number <= 0) {
                break;
            }
        }
        System.out.println("Reverse number is " + reverse);
    }

    public static int reverseNumberSKYPE(int number){
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);//modulo z 10 to zawsze ostatnia cyfra
            number = number/10;
        }
        return reverse;
    }
}
