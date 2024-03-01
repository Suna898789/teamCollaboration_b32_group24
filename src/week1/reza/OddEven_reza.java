package week1.reza;

public class OddEven_reza {

    public static void main(String[] args) {
        identify(7);
    }

    public static void identify(int number) {
        if (number < 0) {
            System.err.println("Negative number!!!!!");
            System.exit(1);
        }
        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}

