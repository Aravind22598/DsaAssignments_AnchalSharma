/*
 link : https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1

 */

public class ArmstrongNumber_5 {
    static boolean armstrongNumber(int n) {
        // code here

        int temp=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(sum==temp){
            return true;
        }
        return false;
    }
}
