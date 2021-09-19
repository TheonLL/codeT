package test.honor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.util.*;


public class Main {
    public static void main(String[] args)throws  Exception {
        //BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s="A Famous Saying: Much Ado About Nothing (2012/8).";

        //while((s=bf.readLine())!=null){
            List<Character> arr=new ArrayList<>();
            int len=s.length();
            arr.add(s.charAt(0));
            for(int i=1;i<len-1;i++){
                char c=s.charAt(i);
                for(int j=0;j<arr.size();j++){
                    char ch=arr.get(j);
                    System.out.println(ch);
                    if('A'<=c&&c<='Z'||'a'<=c&&c<='z'){
                        if(c==ch){
                            arr.add(j,c);
                        }else if(ch>c||ch>(c-('a'-'A'))){
                            arr.add(j,c);
                        }
                    }else{
                        arr.add(i,c);
                    }

                }
            }
            for(char c:arr){
                System.out.print(c);
            }
            System.out.println();
        }

   // }

}
