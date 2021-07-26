package socketApp.shaand;

import java.util.ArrayList;
import java.util.List;

public class StudyEasy {
    public static void main(String[] args) {
//        System.out.print("[");
//        for(int index=1; index<=10; index++){
//            if(index%2!=0){
//                System.out.print(index);
//               if(index<9){
//                   System.out.print(",");
//               }
//            }
//        }
//        System.out.print("]");

        List<Integer> primeNumbers = new ArrayList<>();
        System.out.print("[");
        for(int number2Check = 2; number2Check<=100; number2Check++){
            boolean isprime = true;
            for(int factor= 2; factor<=number2Check/2; factor++){
                if(number2Check%factor==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                primeNumbers.add(number2Check);
            }

        }

        for(int index=1; index<=primeNumbers.size(); index++){
            System.out.print(primeNumbers.get(index-1));
            if(index<primeNumbers.size()){
                System.out.print(",");
            }
        }
        System.out.print("]");


    }




}
