package ivan;

public class DivWithoutOper_Ivan {


    public static void main(String[] args) throws Exception {
        int divide = 15;
        int div = divide;
        int divider = 3;
        if (divider == 0) {
            throw new Exception("divider can not be zero");
        } else {
            int coint;
            for (coint = 0; div >= divider; ++coint) {
                div -= divider;
            }

            System.out.println("" + divide + " / " + divider + " = " + coint);
        }
    }
}



