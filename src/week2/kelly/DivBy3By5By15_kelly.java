package week2.kelly;

import java.util.ArrayList;

public class DivBy3By5By15_kelly {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= 100; i++) { //iterate through 100 numbers
            nums.add(i);
        }

        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy5 = new ArrayList<>();
        ArrayList<Integer> divisibleBy15 = new ArrayList<>();


        for (Integer each : nums) {
            //-> All elements divisible by 15

            if (each % 15 == 0 && each % 5 == 0 && each % 3 == 0) {
                divisibleBy15.add(each);
            }

            //-> All elements divisible by 5
            if (each % 5 == 0 && each % 15 != 0) {
                divisibleBy5.add(each);
            }


            // -> All elements into the divisible by 3
            if (each % 3 == 0 && each % 15 != 0) {
                divisibleBy3.add(each);
            }
        }

        System.out.println("Numbers: " + nums);
        System.out.println("Divisible by 15: " + divisibleBy15);
        System.out.println("Divisible by 5: " + divisibleBy5);
        System.out.println("Divisible by 3: " + divisibleBy3);
    }
}
