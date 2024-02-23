package week1.nesli;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        int dividend = 15;
        int divisor = 3;

        int result = divide(dividend, divisor);

        System.out.println("Division result is: " + result);
    }

    // Below method implementation handles the signs of both the dividend and divisor and
    // repeatedly subtracts the divisor from the dividend until the dividend becomes less than the divisor.
    // The sign variable is used to determine the sign of the result.
    // The method returns the result.

    static int divide(int dividend, int divisor) {
        // Handle division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        // Initialize variables:
        // Below lines prepare the values and signs needed for the division algorithm,
        // ensuring that the algorithm correctly handles cases involving negative numbers and
        // avoids potential overflow issues.
        int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1; // I am using sign variable because I don't use / division sign
        //and I am just subtracting. But when dividing if one of the numbers is negative, the division must be negative.
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        // Initialize result
        int result = 0;

        // Perform division
        while (absDividend >= absDivisor) {
            absDividend -= absDivisor;
            result++;
        }

        // Apply the sign to the quotient
        return sign * result;
    }
}
/*
Note: In Java, the range of the int data type is from Integer.MIN_VALUE to Integer.MAX_VALUE.
The absolute value of Integer.MIN_VALUE is larger than Integer.MAX_VALUE. When we attempt
to represent the absolute value of Integer.MIN_VALUE using an int data type,
it causes an overflow (surplus / excess / remainder).

int minValue = Integer.MIN_VALUE;
int absValue = Math.abs(minValue);

System.out.println("Integer.MIN_VALUE: " + minValue);
System.out.println("Absolute value: " + absValue);

If we run this code, we will encounter unexpected behavior. The absolute value of Integer.MIN_VALUE
cannot be accurately represented as an int because it exceeds the range of representable positive integers.
This overflow leads to wrapping around to a negative value, and we won't get the correct absolute value.

To handle this situation correctly, we casted the dividend
and divisor to long before applying Math.abs(). This way, the absolute values can be correctly
represented within the larger range of long, preventing overflow issues.
 */
