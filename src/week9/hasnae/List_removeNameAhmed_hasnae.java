package week9.hasnae;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_removeNameAhmed_hasnae {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Aaron"));

        removeString(list, "Ahmed");
        System.out.println("list after remove Ahmed name = " + list);
    }


    public static void removeString(List<String> list, String stringToRemove) {

        list.removeIf(P -> P.equalsIgnoreCase(stringToRemove));

    }
}
