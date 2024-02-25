package week2.hasnae;

import java.util.ArrayList;

public class DivBy3By5By15_hasnae {
    public static void main(String[] args) {

//Instantiation of ArrayList named numbers
        ArrayList<Integer> numbers = new ArrayList<>();


// I Used for loop to add elements from 1 to 100 into the numbers Arraylist
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }




// I instantiated 3 new ArrayList to store my data
        ArrayList<Integer> divBy15 = new ArrayList<>();
        ArrayList<Integer> divBy3 = new ArrayList<>();
        ArrayList<Integer> divBy5 = new ArrayList<>();



//I used foreach loop to iterate each element of numbers ArrayList
        for (Integer number : numbers) {
//used the condition to add elements into the divBy15 ArrayList
            if (number % 15 == 0 && number % 5 == 0 && number % 3 == 0) {
                divBy15.add(number);
            }


//used the condition to add elements into the divBy5 ArrayList
            if (number % 5 == 0 && number % 15 != 0) {
                divBy5.add(number);
            }


//used the condition to add elements into the divBy3 ArrayList
            if (number % 3 == 0 && number % 15 != 0) {
                divBy3.add(number);

            }
        }

//print statements for the 4 ArrayLists
        System.out.println("numbers = " + numbers); //numbers ArrayList print statement
        System.out.println("divBy15 = " + divBy15); //divBy15 ArrayList print statement
        System.out.println("divBy5 = " + divBy5);   //divBy5 ArrayList print statement
        System.out.println("divBy3 = " + divBy3);   //divBy3 ArrayList print statement
    }
}

