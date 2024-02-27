package week3.ivan;

public class PrimeNumber_Ivan {
    public static void main(String[] args) {

        System.out.println(isPrime(34455));


    }
    public static boolean isPrime(int number){

        if (number<=0){
            System.out.println("Prime can be less then or 0 "+number);
            System.exit(1);
        }


        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number%i==0)return false;
        }
        return true;



    }
}
