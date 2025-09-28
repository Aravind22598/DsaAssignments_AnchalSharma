/*
 Link : https://www.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n4404/1
 */

import java.util.Arrays;

public class SumOfAllPrimeNumbersBetween1AndN_10 {
    public int prime_Sum(int n) {
        // code here
        // using Sieve of eratosthenes algorithm
        // Time complexity :  O(log(log n))

        boolean arr[]=new boolean[n+1];
        createSieveArray(arr);
        int sum=0;
        for(int i=2;i<=n;i++){
            if(arr[i]){
                sum+=i;
            }
        }
        return sum;
    }
    static void createSieveArray(boolean[]arr){
        // first of all fill all the values with true
        Arrays.fill(arr,true);

        for(int i=2;i*i<=arr.length;i++){
            if(arr[i]==true){
                for(int j=i;j<=(arr.length-1)/i;j++){
                    if(arr[j*i]==true){
                        arr[i*j]=false;
                    }
                }
            }
        }
    }
}
