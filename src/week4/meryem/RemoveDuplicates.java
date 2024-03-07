//** created by Maryam 


package src.week4.meryem;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "AAABBBCCC";

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains("" + each)) {
                result += each;
            }

        }

        System.out.println(result);
    }

/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */


}
