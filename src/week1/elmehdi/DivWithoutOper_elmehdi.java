package week1.elmehdi;

public class DivWithoutOper_elmehdi {
    public static String divideWithoutOperator(int num1, int num2) {
        if (num2 == 0) {
            return "Error: Cannot divide by zero";
        }

        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }

        String result = num1 + "/" + num2 + " = " + count;
        String remainder = num1 + "%" + num2 + " = " + num1;

        return result + "\n" + remainder;
    }

    public static void main(String[] args) {
        // Example usage:
        String result = divideWithoutOperator(25, 5);
        System.out.println(result);
    }
}
