/* 
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
 Link :https://leetcode.com/problems/add-digits/

*/

class AddDigits_1 {
    public int addDigits(int n) {
        
        while(noOfDigits(sum(n))>1){
            n=sum(n);
        }
       return sum(n);
    }
    static int sum(int n){
         int sum=0;
        while(n>0){
             sum=sum+(n%10);
            n=n/10;
            
        }
        return sum;
    }
    static int noOfDigits(int n){
         int digCount=0;
        while(n>0){
             digCount++;
            n=n/10;
            
        }
        return digCount;
    }
}
