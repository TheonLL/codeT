package honor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution1 {
    /* Write Code Here */
    public String solution(int[] d) {
        Arrays.sort(d);
        int len=d.length;
        String s="0";
        for(int i=len-1;i>=0;i--){
            int a=d[i];

            if(a%3==0){
                s+=String.valueOf(a);
            }else{
                continue;
            }
        }
        return s.substring(1);

    }
}

public class qu1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _d_size = 0;
        _d_size = Integer.parseInt(in.nextLine().trim());
        int[] _d = new int[_d_size];
        int _d_item;
        for(int _d_i = 0; _d_i < _d_size; _d_i++) {
            _d_item = Integer.parseInt(in.nextLine().trim());
            _d[_d_i] = _d_item;
        }

        res = new Solution().solution(_d);
        System.out.println(res);
    }
}