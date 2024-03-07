package sabrina;

public class DivWithOutOperator_sabrina {

    public static void DivideWithoutOperator(int num1, int num2) {

        if (num2 == 0) {
            System.err.println("INVALID INPUT - UNABLE TO DIVIDE BY ZERO.");
            return;
        }

        int number = 0;
        String result = num1 + "/" + num2 + " = ";
        String remainder = num1 + "%" + num2 + " = ";

        while (num1 >= num2) {
            num1 -= num2;
            number++;
        }

        System.out.println(result + number + remainder + num1);

    }

}

