package honor;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    /* Write Code Here */
    List<List<Integer>> res=new LinkedList<>();

    public String solution(int[] d) {

        LinkedList<Integer> tack = new LinkedList<>();
        bk(d,0,tack);
        int max=0;
        String s=""+0;
        for(List<Integer> list:res){
            if (list.size()>max){
                for(Integer integer:list){
                    s+=integer;


                }
                max=Integer.parseInt(s);
            }else {
                for(Integer integer:list){
                    s+=integer;
                }
                if(Integer.parseInt(s)>max){
                    max=Integer.parseInt(s);
                }
            }
        }
        return  String.valueOf(max);

    }
    public void  bk(int[] nums,int start ,LinkedList<Integer> track){
        int sum=0;
        for(Integer integer:track){
            sum+=integer;
        }
        if (sum%3==0){
            res.add(new LinkedList(track));
        }

        for (int i=start;i<nums.length;i++){
            track.add(nums[i]);
            bk(nums,i+1,track);
            track.removeLast();
        }
    }
}

public class  Qu{
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
