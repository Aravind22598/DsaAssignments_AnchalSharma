/*
  Link : https://practice.geeksforgeeks.org/problems/reversing-the-equation2205/1
 */

public class ReversingTheEquation_7 {

    String reverseEqn(String S) {
        // your code here
        StringBuilder res=new StringBuilder();

        for(int i=S.length()-1;i>=0;i--){
            char c=S.charAt(i);

            //check if it is a digit or a character
            // if it is a digit traverse through left to extract complet number

            if(Character.isDigit(c)){
                StringBuilder dig=new StringBuilder();
                while(i>=0 && Character.isDigit(S.charAt(i))){
                    dig.append(S.charAt(i));
                    i--;
                }
                i++;
                res.append(dig.reverse());
            }
            else{
                // if it is a character just add it
                res.append(c);
            }

        }
        return res.toString();
    }
}
