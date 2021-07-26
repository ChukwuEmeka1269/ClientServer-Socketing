package HackerRankChallenge;

public class Hackerank5 {
    public static void main(String[] args) {
        multiply(3);

    }


    public static void multiply(int n){
        for(int i =1; i<=10; i++){
            int  res = n*i;
            System.out.println(n + "x" + i +"="+ res );
        }
    }
}
