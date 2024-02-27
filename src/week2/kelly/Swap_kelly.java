package week2.kelly;

public class Swap_kelly {
    public static void main(String[] args) {

        int a = 3;
        int b = 1;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        a = a + b;           // -> 4
        b = a - b;          // ->  3
        a = a - b;         // -> 1

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
