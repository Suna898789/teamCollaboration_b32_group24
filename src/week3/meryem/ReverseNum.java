//** created by Maryam 


package src.week3.meryem;

public class ReverseNum {

    public static void main(String[] args) {
        int number = -123445;
        reverseNegativeNum(number);
    }


    public static int reverseNegativeNum(int num) {

        // Convert the integer number to a string representation
        StringBuilder numStr = new StringBuilder(Integer.toString(num));

        boolean isNegative = num < 0;// if is negative

        numStr.reverse();//reverse the string represent the actual a number

        // If the number was negative, remove the negative sign from the reversed string
        if (isNegative) {
            numStr.deleteCharAt(numStr.length() - 1);
        }

        int reversed = Integer.parseInt(numStr.toString());// Convert the reversed string back to an integer

        // If the original number was negative, return the negative of the reversed number

        if (isNegative) {
            System.out.println(-reversed);
        } else {
            System.out.println(reversed);
        }

        return reversed;

    }


}
