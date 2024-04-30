package week5.shohruh;

public class ReverseString {

    public static void main(String[] args) {


        //2️⃣  String_Reverse
        //Write a return method that can reverse  String
        //Ex: Reverse("ABCD"); ==> DCBA

        String str = "DCBA";
        String input = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            input += str.charAt(i);
        }
        System.out.println("input = " + input);
    }
}
