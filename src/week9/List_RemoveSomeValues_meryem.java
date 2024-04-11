//** created by Maryam 


package src.week9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_RemoveSomeValues_meryem {

    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(101);
        numbers.add(200);
        numbers.add(300);

        // Remove all values greater than 100
        removeGreaterThan100(numbers);

        // Print the updated list
        System.out.println("Numbers after removing values greater than 100:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void removeGreaterThan100(List<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number > 100) {
                iterator.remove();
            }
        }
    }


}
/*

Given a list of Integers 1, 2, 3, 4, 5, 6, 101, 200, 300....etc. remove all values greater than 100.
 */