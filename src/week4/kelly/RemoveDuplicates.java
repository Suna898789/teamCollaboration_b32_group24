package week4.kelly;

public class RemoveDuplicates {
    public static void main(String[] args) {

        removeDuplicate("AAAAAABBBBBCCCCCDDDDEERGTHKKKK");


    }

    public static String removeDuplicate(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            char each = str.charAt(i);
            if (result.contains("" + each)) {
                continue;
            } else {
                result += each;
            }

        }
        System.out.println(result);
        return result;
    }

}
