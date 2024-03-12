package week5.kelly;

public class ReverseString_kelly {
    public static String reverse(String str){
        String reverse ="";
        for(int i=str.length()-1; i>=0; i--) {
            // --> Formula for last character str.length()-1 <--

            reverse += str.charAt(i);
        }

        return reverse;

    }

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));

    }
}
