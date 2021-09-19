package haojing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws  Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String  s=null;
        while ((s=bf.readLine())!=null){
           // System.out.println(s);
            if(!s.contains(":")){
                String[] sarr=s.split(" ");
                double m=Double.parseDouble(sarr[0]);
                int num=Integer.parseInt(sarr[1]);
                if(num==0){
                    break;
                }
                List<Double> arr = new ArrayList<>();
               // System.out.println(m);
                //System.out.println(num);
                for (int i = 0; i <num ; i++) {
                   String[] s1=bf.readLine().split(" ");
                   double npM=0;
                   for(int j=1;j<s1.length;j++){
                       char c=s1[j].charAt(0);
                       if(c=='A'||c=='B'||c=='C'){
                           npM+=Double.parseDouble(s1[j].substring(2));
                       }else {
                           npM=0;
                       }
                   }
                   arr.add(npM);

                }
                Collections.sort(arr);
                for (int i = 0; i <arr.size() ; i++) {
                    if(arr.get(i)>m){
                        System.out.print(arr.get(i-1)+" ");
                        break;
                    }else if(arr.get(i)==m){
                        System.out.print(arr.get(i)+" ");
                        break;

                    }
                }
                System.out.print(arr.get(arr.size()-1)+" ");
                //System.out.println("00000");
            }

        }

    }
}
