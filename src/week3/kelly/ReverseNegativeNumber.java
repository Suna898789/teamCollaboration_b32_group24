package week3.kelly;

public class ReverseNegativeNumber {
    public static int reverseNegativeNumber(int num) {
        if (num < 0) {
            return -num; // ->assign negative value if num<0

        } else {
            return num; // ->num remains positive
        }
    }

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-15));
    }
}


