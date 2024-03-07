package week3.ivan;

public class RevertInteger_Ivan {
    public static void main(String[] args) {

        System.out.println(reverseNegNam(-3));
    }

    public static int reverseNegNam(int neg){
        if (neg>=0){
            System.err.println("Number can be negativ "+neg);
            System.exit(1);
        }
        return -neg;
    }
}
