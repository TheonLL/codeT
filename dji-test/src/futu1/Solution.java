package futu1;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.jar.JarEntry;

/**
 * @author: 11983
 * @date: 21/09/16 19:42
 * @description:
 */

public class Solution {
    public int[] LIS (int[] arr) {
        // write code here
        int N=arr.length;
        int[] dp=new int[N];
        Arrays.fill(dp,1);
        TreeSet<Integer> set =new TreeSet<>();
        set.add(arr[0]);
        for (int i = 1; i <dp.length ; i++) {
            if(arr[i]>set.last()){
                set.add(arr[i]);
                dp[i] =set.size();
            }else {
                int first=set.ceiling(arr[i]);
                set.remove(first);
                set.add(arr[i]);
                dp[i]=set.headSet(arr[i]).size()+1;
            }

        }
        int[] res=new int[set.size()];
        for (int i = arr.length-1,j=set.size(); i >=0; i--) {
            if(dp[i]== j){
                res[--j]=arr[i];
            }
        }
        return res;
    }
}
