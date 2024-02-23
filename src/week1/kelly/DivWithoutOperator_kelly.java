package week1.kelly;

public class DivWithoutOperator_kelly {

    public static void main(String[] args) {

        divideWithoutOperator(26, 4);
   }

    public static void divideWithoutOperator(int n1, int n2) {
        if (n2 == 0) {
            System.err.println("Can NOT divide by ZERO");
            return;
        }

        int count = 0;
        String result = n1 + "/" + n2 + "=";
        String remainder = n1 + "%" + n2 + "=";

        while (n1 >= n2) {
            n1 -= n2;
            count++;
        }

        System.out.println(result + count + "\n" + remainder + n1);

    }
}