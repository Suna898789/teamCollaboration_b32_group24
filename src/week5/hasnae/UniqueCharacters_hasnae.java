package week5.hasnae;

public class UniqueCharacters_hasnae {
    public static void main(String[] args) {
        String Unique = uniqueCharacters("AAABCCCDEEEFCDDD");
        System.out.println("Unique = " + Unique);
    }


    public static String uniqueCharacters(String str) {


        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;
            }

        }
        return unique;


    }
}



/*
 String_UniqueCharacters
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */