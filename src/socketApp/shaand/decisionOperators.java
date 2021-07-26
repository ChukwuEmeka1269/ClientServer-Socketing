package socketApp.shaand;

import java.util.Arrays;
import java.util.List;

public class decisionOperators {
    public static void main(String[] args) {
        int [] numbers = {2,4,7};

        for(int i = 0; i< numbers.length; i++){
            int count = 0;
            for(int j=2; j<numbers[i] -1; j++){
                if(numbers[i]%j==0)
                count = count + 1;
            }
            if(count == 0){
                System.out.println(numbers[i]);
            }
        }

    }
}
