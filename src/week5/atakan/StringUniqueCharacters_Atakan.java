package week5.atakan;

public class StringUniqueCharacters_Atakan {

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String uniqueChars = unique(input);
        System.out.println("Unique characters: " + uniqueChars);
    }


    //----------------------------------------------------------------
    public static String unique(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}