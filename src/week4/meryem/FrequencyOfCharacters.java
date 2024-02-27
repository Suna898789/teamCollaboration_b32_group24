//** created by Maryam 


package src.week4.meryem;

public class FrequencyOfCharacters {


    public static void main(String[] args) {

        String str = "AAABBCDD";
        String result = ""; //a2b1c3d1


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;
        }


        System.out.println(result);

    }


}
/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */