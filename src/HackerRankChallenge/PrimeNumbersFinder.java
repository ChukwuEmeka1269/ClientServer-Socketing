package HackerRankChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersFinder {
    public static void main(String[] args) {
        primeNumberFinder();
    }

    public static void primeNumberFinder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the numbers of prime numbers you want: ");
        int numberOfDesiredPrimeNumbers = scanner.nextInt();
        int number2Check=2;
        int count = 0;

        List<Integer> primeNumbers = new ArrayList<>();
        System.out.print("[");
        while(true){
            boolean isPrime = true;
            for(int factor =2; factor<number2Check/2; factor++){
                if(number2Check%factor==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeNumbers.add(number2Check);
                count++;
            }
            if(count>=numberOfDesiredPrimeNumbers){
                break;
            }
            number2Check++;
        }
        for(int index = 1; index<=primeNumbers.size(); index++){
            System.out.print(primeNumbers.get(index-1));
            if(index<primeNumbers.size()){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }


}
