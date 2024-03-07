package week4.kelly;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        frequencyOfCharacters("AAAABBCDDDDAHJKLJKLIOUOIU");
    }


    public static String frequencyOfCharacters(String str) {

        int[] freq = new int[str.length()];
        char[] string = str.toCharArray();
        String freqChar = "";

        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    // Set string[j] to '0' to avoid printing visited character
                    string[j] = '0';
                }
            }
        }

        System.out.println("Characters and their corresponding frequencies:");
        for (int i = 0; i < freq.length; i++) {
            if (string[i] != ' ' && string[i] != '0') {
                freqChar = string[i] + "" + freq[i];
                System.out.print(freqChar);

            }
        }
        return freqChar;

    }
}
