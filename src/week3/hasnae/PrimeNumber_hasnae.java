package week3.hasnae;

public class PrimeNumber_hasnae {

    //A number is prime  only if it is divisible by 1 and by itself
    //2 is the smallest prime number
    //in the next approach I will use a method with boolean return and a given int as parameter
    public static boolean isPrimeNumber(int num) {

        if (num < 2) {   //2 is the smallest prime number so if num <2 it will never be a prime number
            return false;
        }

        for (int i = 2; i < num; i++) { // if there isn't any number from 2 to the given (num -1) which can divide num, then num number is a prime number

            if (num % i == 0) { // if between 2 to num-1 there is any number i which can divide num, them num isn't a prime number
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(25)); // false  25%5==0
        System.out.println(isPrimeNumber(67)); // true 67 only divide 1 and itself
        System.out.println(isPrimeNumber(89)); //   idem



    }


}

