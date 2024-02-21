//** created by Maryam 


package src.week1.meryem;

import java.util.Scanner;

public class FINRA_meryem {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scr.nextInt();

        for (int i = 1; i <= num; i++) {

            String str = "";
            if (i % 3 == 0) {
                str += "FIN";
            }
            if (i % 5 == 0) {
                str += "RA";
            }
            System.out.println(str.isEmpty() ? i : str);
       /*     if (str.isEmpty()){
                System.out.println(i);
            }else{
                System.out.println(str);
            }

        */

            scr.close();
        }
    }
}


/*
FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN" instead of numbers for multiples of 3, "RA" instead of numbers for numbers that are multiples of 5, and a multiple of both 3 and 5 for "FINRA" instead of the number.
 */
//


