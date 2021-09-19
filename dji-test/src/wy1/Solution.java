package wy1;

import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.awt.image.SampleModel;
import java.net.Socket;

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] arr1=new int[]{1,2,1,0,6,7,10,1};
        int[] arr2=new int[]{1,0,1,0,1,0,1,0};
       // int[] arr1=new int[]{1,2,1,6,7,10,0,1};
        //int[] arr2=new int[]{1,0,1,1,0,1,0,0};
        System.out.println("============");
        System.out.println(solution.max_score(arr1,arr2,3));
    }
    public int max_score (int[] customers, int[] mistakes, int minutes) {
        // write code here
       // return 24;
        int start=0;
        int smax=0;

        int len=customers.length;
        if(len<=minutes){
            for(int c:customers){
                smax+=c;
            }
            return  smax;
        }else {
            for (int j = 0; j <len-minutes ; j++) {

               // System.out.print("+++++");
               // System.out.println(j);

                int max=0;
                start=j;
                int end=start+minutes;
                for (int i = 0; i <len; i++) {
                    int m=0;
                    if(start<=i&&i<=end-1){
                       // System.out.print(customers[i]+" ");
                        max+=customers[i];
                    }else {
                        if (mistakes[i]==1){
                            m=-1;
                        }else {
                            m=1;
                        }
                        max+=customers[i]*m;
                        //System.out.print(customers[i]*m+" ");
                    }

                }
                //System.out.println("====");

                smax=Math.max(smax,max);
                //System.out.println(max);
                //System.out.println(smax);
            }
            return  smax;
        }


    }
}
