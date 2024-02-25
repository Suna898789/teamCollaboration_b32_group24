package week2.elmehdi;

public class Swap_elmehdi {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("swap: a = " + a + ", b = " + b);
    }
}
