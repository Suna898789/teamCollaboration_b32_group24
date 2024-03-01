package week5.hasnae;

public class ReverseString_hasnae {
    public static void main(String[] args) {
        String reverse = reverseString("I will reverse my String");
        System.out.println("reverse = " + reverse);

    }


    public static String reverseString(String str) {


        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char each = str.charAt(i);
            reverse += each;
        }

        return reverse;

    }

}


/*
String_Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */