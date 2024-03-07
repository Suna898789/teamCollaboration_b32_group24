package week2.hasnae;

public class Swap {

    public static void main(String[] args) {
        int x = 1, y = 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);


        x = x + y;                      // x = 1 + 2 ---> x=3
        y = x - y;                     //  y = 3 - 2 ---> y=1
        x = x - y;                    //   x = 3 - 1 ---> x=2

        System.out.println("x = " + x);   //output x = 2
        System.out.println("y = " + y);   //output y = 1
    }


}
