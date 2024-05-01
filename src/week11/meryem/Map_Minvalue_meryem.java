//** created by Maryam 


package src.week11.meryem;

import java.util.HashMap;
import java.util.Map;

public class Map_Minvalue_meryem {


    public static void main(String[] args) {

        //  Write a method that can return the minimum value from a map (DO NOT use sort method).

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);

        int min = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
            }
        }

        System.out.println(min);
    }


}