//** created by Maryam 


package week6.meryem;

public class String_SumOfAllDigits_meryem {


    public static void main(String[] args) {
        String str = "12 java 5 apple 3";
        int sum = sumOfDigits(str);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        String[] parts = str.split("\\D+"); // Split by non-digit characters

        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */