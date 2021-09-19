package honorzhanglei;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    /* Write Code Here */
    public int solution(int[] arr) {
        //return 13;
        int[] sorted=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        int pos0=0;
        while (pos0<arr.length){
            if(sorted[pos0]>=0){
                break;
            }
            pos0++;

        }
        while (sorted[arr.length-1]>=sorted[pos0-1]*(-1)){
            pos0--;
        }
        int cur=1,cup=pos0,res=0;
        while (cup<arr.length){
            res+=sorted[cup]*cur;
            cur++;
            cup++;

        }
        return  res;


    }
}

public class qu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = new Solution().solution(_arr);
        System.out.println(String.valueOf(res));

    }
}