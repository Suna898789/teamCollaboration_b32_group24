package week5.atakan;

public class String_ReverseAtakan {

    public static void main(String[] args) {
    String input = "ABCD";
    String reversed = reverse(input);
    System.out.println("Reversed string: " + reversed);
}

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }
}

