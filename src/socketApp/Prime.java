package socketApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prime {
    static boolean isPrime =true;
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> listOfPrimeNumbers = new ArrayList<>();
    public static void main(String[] args) {

        primeNumbers();

        if(primeNumber(11)){
            System.out.println( "Passes as a prime number");
        }
        else{
            System.out.println( " not a prime number");
        }

    }

    public static boolean primeNumber(int number){
        int temp;
        for(int i =2; i<= number/2; i++){
            temp = number % i;
            if(temp ==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean primeNumber(float number){
        float temp;
        for(int i =2; i<= number/2; i++){
            temp = number / i;
            if(temp ==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void primeNumbers(){
        System.out.println("Please enter a number: ");
        int range = scanner.nextInt();
        for(int number2Check = 2; number2Check<range; number2Check++){
            boolean isPrime = true;
            for(int factor=2; factor<number2Check/2; factor++){
                if(number2Check%factor ==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                listOfPrimeNumbers.add(number2Check);
//                System.out.println(Arrays.toString(listOfPrimeNumbers.toArray()));
            }
        }

        for(int number: listOfPrimeNumbers){
            System.out.println(number);
        }
    }

}
