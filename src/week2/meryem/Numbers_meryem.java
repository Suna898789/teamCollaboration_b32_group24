//** created by Maryam 


package src.week2.meryem;

import java.util.HashMap;
import java.util.Map;

public class Numbers_meryem {

    public static void main(String[] args) {
        Num(17);

    }

    public static void Num(int n) {

        Map<Integer, String> temp = new HashMap<>();
        temp.put(2, "Codility");//insert the key + value into the map
        temp.put(3, "Test");
        temp.put(5, "Coders");


        for (int i = 0; i <= n; i++) {
            String out = "";
            for (Integer each : temp.keySet()) {// return all the keys from the map
                if (i % each == 0) {
                    out += temp.get(each);//return the value of the key
                }
            }
            if (out.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(out);
            }
        }
    }

}
/*
Numbers -- print consecutive numbers
        Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.


 */



