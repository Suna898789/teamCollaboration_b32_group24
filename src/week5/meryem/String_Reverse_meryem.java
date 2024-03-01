//** created by Maryam 


package src.week5.meryem;

public class String_Reverse_meryem {

    public static void main(String[]args){
        System.out.println(reverse("ABCD"));
    }


    public static String reverse(String str) {

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {

             reverse += str.charAt(i);
        }
        return reverse;
    }

}
/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */