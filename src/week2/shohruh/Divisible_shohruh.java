package week2.shohruh;

public class Divisible_shohruh {
    public static void main(String[] args) {

        int num = 100;

        String divisibleBy15 = " ",divisibleBy5 = " ",divisibleBy3 = " ";

        for (int i = 1; i <= 100; i++) {

            if(i % 15 == 0){
                divisibleBy15 += i + ",";
            } else if (i % 5 == 0) {
                divisibleBy5 += i + ",";
            } else if (i % 3 == 0) {
                divisibleBy3 = divisibleBy3 + i + ",";
            }
        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);
    }
}

