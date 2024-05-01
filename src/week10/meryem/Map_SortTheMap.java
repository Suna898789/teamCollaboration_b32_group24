//** created by Maryam 


package src.week10.meryem;

import java.util.HashMap;
import java.util.Map;

public class Map_SortTheMap {

    /*
    Write a method that can sort the Map by values.
     */
    public static void main(String[] args) {

        //  Write a method that can sort the Map by values.

        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println();

    }


}
