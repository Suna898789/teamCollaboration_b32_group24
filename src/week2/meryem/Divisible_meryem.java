//** created by Maryam 


package src.week2.meryem;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Divisible_meryem {

    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> divisible = new LinkedHashMap<>();

        divisible.put("Divisible by 15", new ArrayList<>());// insert the given key and value to the map as a pair
        divisible.put("Divisible by 5", new ArrayList<>());
        divisible.put("Divisible by 3", new ArrayList<>());


        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisible.get("Divisible by 15").add(i);
            } else if (i % 5 == 0) {
                divisible.get("Divisible by 5").add(i);

            } else if (i % 3 == 0) {
                divisible.get("Divisible by 3").add(i);

            }
        }

        for (String each : divisible.keySet()) { // return all the keys of the map
            System.out.println(each + ": " + divisible.get(each));//return the value of the map
        }

    }

}
/*
Numbers -- Divisible by 3, 5, 15
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
    -if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15 section
    -if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3 section
    -if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5 section
    ex:
    OutPut:
    Divisible By 15 15 30 45 60 75 90
    Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
    Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */


