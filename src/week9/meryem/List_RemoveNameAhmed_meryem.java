//** created by Maryam 


package week9.meryem;

import java.util.ArrayList;
import java.util.List;

public class List_RemoveNameAhmed_meryem {

    public static void main(String[] args) {
        // List of people's names
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Aaron");

        // Remove all occurrences of "Ahmed"
        removeName(names, "Ahmed");

        // Print the updated list
        System.out.println("Names after removing Ahmed:");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void removeName(List<String> names, String target) {
        names.removeIf(name -> name.equals(target));
    }



}
/*
Given a list of people names: "Ahmed", "John", Eric", "Ahmed", "Aaron".....
Write a java operation to remove all the names named Ahmed
 */