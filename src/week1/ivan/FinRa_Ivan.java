package ivan;

public class FinRa_Ivan {


    public static void main(String[] args) {
        finra(30);
    }

    public static void finra(int number){
        for(int i = 1; i <=number; ++i) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FI");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }

    }
}

