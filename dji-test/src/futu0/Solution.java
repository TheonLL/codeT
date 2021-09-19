package futu0;

import java.util.*;

/**
 * @author: 11983
 * @date: 21/09/16 19:46
 * @description:
 */

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[]{3,5,7,9,11};
        int[] a=solution.findTopKinTwoSortedArray(arr1,arr2,4);
        for(int i:a){
            System.out.println(i);
        }
    }
    public int[] findTopKinTwoSortedArray (int[] arr1, int[] arr2, int k) {

     int[] res=new int[k];
     Arrays.sort(arr1);
     Arrays.sort(arr2);
     int index=0;
     int len1=arr2.length-1;
        for (int i = arr1.length-1 ; i >0; i--) {
                if(index<k){
                    res[index]=arr1[i]+arr2[len1-index];
                    index++;

                }else {
                    break;
                }


        }

        return  res;
    }
}
