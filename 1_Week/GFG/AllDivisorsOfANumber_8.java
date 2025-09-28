/*
Link: https://practice.geeksforgeeks.org/problems/all-divisors-of-a-number/1
 */

import java.util.ArrayList;

public class AllDivisorsOfANumber_8 {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int j=n/i;
                if(i==j){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i+" ");
                    l.add(j);

                }

            }
        }

        // now iterate through array list in reverse
        for(int i=l.size()-1;i>=0;i--){

            System.out.print(l.get(i)+" ");
        }
    }
}
