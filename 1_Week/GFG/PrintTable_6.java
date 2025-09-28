/*
  Link : https://practice.geeksforgeeks.org/problems/print-table0303/1
 */

import java.util.ArrayList;

public class PrintTable_6 {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=10;i++){
            l.add(n*i);
        }
        return l;
    }
}
