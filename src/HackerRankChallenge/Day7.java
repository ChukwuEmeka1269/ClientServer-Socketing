package HackerRankChallenge;

public class Day7 {
    public static void main(String[] args) {
        int [] num = {23, 34, 56, 78, 89, 90, 67, 78, 99, 65, 77, 99};

        printSpace(num);

    }

    public static void printSpace(int[] numbers){
        System.out.print("[");
        for(int index= numbers.length ; index>0; index--){
            System.out.print(numbers[index -1]);
            if(index <= numbers.length){
                if(index - 1>0){
                    System.out.print(" ");
                }
            }
        }
        System.out.print("]");
    }

    public static void printArray(int[] numbers){
        /*
        I have tried to illustrate the method in two different ways using a for loop and the other using a while loop.
         */
//        System.out.print("[");
//        for(int index=0; index<numbers.length; index++){
//            System.out.print(numbers[index]);
//            if(index< numbers.length - 1){
//                System.out.print(",");
//            }
//        }
//        System.out.print("]");


        int index = 0;
        System.out.print("[");
        while(index < numbers.length){
            System.out.print(numbers[index]);
            if(index< numbers.length - 1)
                System.out.print(",");
            index++;
        }
        System.out.print("]");
    }
}
