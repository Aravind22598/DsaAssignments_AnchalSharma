/*
Link : https://leetcode.com/problems/number-of-common-factors/
 */
public class NumberOfCommonFactors_3 {
    public int commonFactors(int a, int b) {
        int max=Math.max(a,b);
        int count=0;
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        return count;
    }
}
