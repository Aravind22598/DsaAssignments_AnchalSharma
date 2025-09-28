import java.util.Arrays;

/*
Link : https://leetcode.com/problems/count-primes/
 */
public class CountPrimes_4 {
    public int countPrimes(int n) {
        // if we will do this problem with the normal approach
        // then it will give the time limit exceeded error so
        // do this problem with sieve of eratosthenes algorithm

        boolean arr[]=new boolean[n+1];
        createSieveArray(arr);
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]){
                count++;
            }
        }
        return count;
    }

    static void createSieveArray(boolean[]arr){
        Arrays.fill(arr,true);
        for(int i=2;i*i<=arr.length;i++){
            if(arr[i]==true){
                for(int j=i;j<=(arr.length-1)/i;j++){
                    if(arr[i*j]==true){
                        arr[i*j]=false;
                    }
                }
            }
        }
    }

}
