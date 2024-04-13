package week9.hasnae;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveSomeValues {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 450; i++) {

            list.add(i);

        }
        System.out.println("list = " + list);
        System.out.println();

        removeValuesGreaterThan100(list);
        System.out.println("list after removing values greater than 100 = " + list);
    }

    public static void removeValuesGreaterThan100(List<Integer> list) {

        list.removeIf(i -> i > 100);
    }


}
