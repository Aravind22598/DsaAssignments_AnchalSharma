
/*
 Problem link: https://www.geeksforgeeks.org/problems/count-digits5716/1
 Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.

A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.

Examples :

Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
 */

// User function Template for Java

class CountDigits_4 {
    static int evenlyDivides(int n) {
        // code here

        int temp=n;
        int count=0;
        while(n>0){
            int digit=n%10;

            if(digit!=0  && temp%digit==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}