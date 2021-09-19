/*
package honor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.ForkJoinPool;
import java.util.regex.*;

class Solution3 {
    */
/* Write Code Here *//*

    public int solution3(int[] arr) {
        //return 13;
        int max=arr[0];

        for (int i = 1; i<arr.length ; i++) {
            int temp=arr[i-1];
            int num=2;
            for (int j = i; j <arr.length ; j++) {
                temp=temp+num*arr[j];
                num++;
                if(temp>max){
                    max=temp;
                }
            }

        }

        return max;
    }
}

public class qu3 {
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

        res = new Solution()3.solution3(_arr);
        System.out.println(String.valueOf(res));

    }
}*/
