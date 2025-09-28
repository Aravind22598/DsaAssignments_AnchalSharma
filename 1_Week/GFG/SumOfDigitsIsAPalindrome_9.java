/*
 Link : https://practice.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1
 */

public class SumOfDigitsIsAPalindrome_9 {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=sumOfDigits(n);
        return isPalindrome(sum);

    }

    static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
    boolean isPalindrome(int n){
        if(reverse(n)==n){
            return true;
        }
        return false;
    }

    static int reverse(int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        return rev;
    }
}
