package week2.elmehdi;

import java.util.ArrayList;

public class DivBy3By5By15_elmehdi {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();



        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }





        ArrayList<Integer> divBy15 = new ArrayList<>();
        ArrayList<Integer> divBy3 = new ArrayList<>();
        ArrayList<Integer> divBy5 = new ArrayList<>();




        for (Integer number : numbers) {

            if (number % 15 == 0 && number % 5 == 0 && number % 3 == 0) {
                divBy15.add(number);
            }



            if (number % 5 == 0 && number % 15 != 0) {
                divBy5.add(number);
            }



            if (number % 3 == 0 && number % 15 != 0) {
                divBy3.add(number);

            }
        }


        System.out.println("numbers = " + numbers);
        System.out.println("divBy15 = " + divBy15);
        System.out.println("divBy5 = " + divBy5);
        System.out.println("divBy3 = " + divBy3);
    }


}
