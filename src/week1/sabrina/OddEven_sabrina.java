package sabrina;

public class OddEven_sabrina {

    public static void OddOrEven(int n) {

        if (n % 2 == 0) {
            System.out.println(n + "is an EVEN number.");
        } else {
            System.out.println(n + "is an ODD number.");
        }

        if (n < 0) {
            throw new RuntimeException("INVALID INPUT " + n + " is a negative number.");
        }

    }

}


