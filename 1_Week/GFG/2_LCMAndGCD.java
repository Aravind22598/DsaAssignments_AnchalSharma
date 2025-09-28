/* 
Given two integers a and b, You have to compute their LCM and GCD and return an array containing their LCM and GCD.

Examples:

Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Input: a = 1 , b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.

link: https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
*/

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        // let us find gcd using iteration
        int []res=new int[2];
        res[1]=gcd(a,b);
        res[0]=lcm(gcd(a,b),a,b);
        return res;
       
    }
    static int gcd(int a,int b){
         while(a!=0){
            int temp=a;
            a=b%a;
            b=temp;
        }
        return b;
    }
    static int lcm(int gcd,int a,int b){
        // lcm*hcf= a*b
        return (a*b)/gcd;
    }
}