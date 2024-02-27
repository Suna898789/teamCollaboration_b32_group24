package week4.hasnae;

import java.util.ArrayList;
import java.util.Collections;

public class SameLetters_hasnae {
    public static void main(String[] args) {

        sameLetters("camelcase", "casecalem");


    }

    public static boolean sameLetters(String str1, String str2) {

        boolean isSame = true;

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= str1.length() - 1; i++) {
            char each = str1.charAt(i);
            list.add(String.valueOf(each));
        }

        ArrayList<String> list2 = new ArrayList<>() {
        };

        for (int j = 0; j <= str2.length() - 1; j++) {
            char each2 = str2.charAt(j);
            list2.add(String.valueOf(each2));
        }
        Collections.sort(list);
        Collections.sort(list2);
        System.out.println(list);
        System.out.println(list2);

        if (list.equals(list2)) {
            System.out.println(isSame);
        } else {
            System.out.println(!isSame);
        }

        return isSame;


    }


}

