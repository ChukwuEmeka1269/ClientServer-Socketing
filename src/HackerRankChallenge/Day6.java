package HackerRankChallenge;



/**
 * This program splits a string into strings of even and odd indices.
 * Then it prints the string of even and odd indices on a single seperated by a space.
 */
public class Day6 {
    public static void main(String[] args) {
        String string = "Welcome";
        StringBuilder ans = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for(int index =0; index<string.length(); index++){
            if(index%2==0){
                ans.append(string.charAt(index));

            }
            if(index%2==1){
                ans2.append(string.charAt(index));

            }
        }
        System.out.println(ans +" " +ans2 );

    }
}
