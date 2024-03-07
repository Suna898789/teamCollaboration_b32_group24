package week2.sabrina;

public class swap_sabrina {

    public static void main(String[] args) {
        int x = 1, y = 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }


}


