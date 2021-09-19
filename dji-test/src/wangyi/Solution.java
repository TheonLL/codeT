package wangyi;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int[] mealOrders (int[][] orders, int n) {
        // write code here
        Map<Integer, Integer> m=new TreeMap<>();
        int len=orders.length;
        for (int i = 0; i <len; i++) {
            int start=orders[i][0];
            int end=orders[i][1];
            int add=orders[i][2];
            for (int j =start; j <=end; j++) {
                if(m.containsKey(j)){
                    m.put(j,m.get(j)+add);
                }else {
                    m.put(j,add);
                }
            }

        }
        int[] res=new int[m.size()];
        int i=0;
        for(Map.Entry entry:m.entrySet()){
            res[i]= (int) entry.getValue();
            i++;
        }
        return  res;

    }
}
