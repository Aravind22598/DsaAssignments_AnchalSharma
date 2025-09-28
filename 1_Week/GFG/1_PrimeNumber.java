/*
Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

Examples :

Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
Input: n = 1

Leranings:
*/

class Solution {
    static boolean isPrime(int n) {
        // code here
        // handling special case 1
        if(n==1){
            return false;
        }
        int count=0;
        for(int i=1;i*i<=n;i++){
            int j=n/i;
            
            // check if i is a factor
            if(n%i==0){
                // check if i and j are equal
                if(i==j){
                    count+=1;
                }
                else{
                    count+=2;
                }
            }
            // break here only if the count is greater than 2
            if(count>2){
                return false;
            }
        }
        // now since its count didnt exceeded 2 then it is a prime
        return true;
    }
}
