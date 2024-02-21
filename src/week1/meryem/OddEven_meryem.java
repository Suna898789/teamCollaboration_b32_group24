//** created by Maryam 


package src.week1.meryem;

public class OddEven_meryem {

    public static void main(String[] args) {

        System.out.println(OddEven(6));
        System.out.println(OddEven(9));
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a num");
        int num = input.nextInt();

        boolean isEven = num % 2 == 0;
        boolean isOdd = !isEven;//num % 2 != 0

        System.out.println("The number is Even = " + isEven);
        System.out.println("The number is Odd = " + isOdd);
        System.out.println("=================================");

 */
    }


    public static String OddEven(int n) {

        if (n < 0){// negative number
            throw new RuntimeException("Invalid number");
        }
        if (n % 2 == 0 ){
            return "Even";
        }else {
            return "Odd";
        }

    }

}
/*
1. Numbers -- odd & even
Write a method which can identify given number is even or odd


 */

