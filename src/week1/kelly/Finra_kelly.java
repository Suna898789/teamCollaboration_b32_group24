package week1.kelly;

public class Finra_kelly {
    public static void finra(int n){
        for (int i = 0; i <=n; i++) {

        if (i%3==0 && i%5==0){
        System.out.println("FINRA");
        }else if(i%3==0){
        System.out.println("FIN");
        } else if (i%5==0) {
        System.out.println("RA");
        }else{
        System.out.println(i);
        }
        }
       }

public static void main(String[] args) {
        finra(30);
        }


    }


