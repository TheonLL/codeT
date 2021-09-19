package futu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 11983
 * @date: 21/09/16 19:22
 * @description:
 */

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr=new int[]{5,4,1,1,5,1,5};

        System.out.println(solution.findtheNumber(arr,3));
    }
    public int findtheNumber (int[] arr, int k) {
        // write code here
        Map<Integer, Integer> m = new HashMap<>();
        for (int integer : arr) {
            if (m.containsKey(integer)) {
                m.put(integer, m.get(integer) + 1);
            } else {
                m.put(integer, 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();

            }
        }

        return 0;
    }
}
