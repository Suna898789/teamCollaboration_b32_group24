package week6.hasnae;

import java.util.Arrays;

public class StringSumAllDigit_hasnae {
    public static void main(String[] args) {

        int sum = stringSumAllDigit("12 java 5 apple 3");
        System.out.println("sum = " + sum);
    }

    public static int stringSumAllDigit(String str) {


        String digit = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch) || ch == ' ') {
                digit += "" + ch;
            } else {
                continue;
            }

        }
        int sum = 0;
        String[] array = digit.split(" ");

        for (String each : array) {
            if (!each.isEmpty()) {
                sum += Integer.parseInt(each);
            }
        }
        return sum;


    }

}
/*
1️⃣
String_SumOfAllDigits
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */
