package test.honor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
* I am a Sut
* */

public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        try {
            solution.solu();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public void  solu() throws Exception{
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String inputString=bufferedReader.readLine();

        StringBuilder stringBuilder=new StringBuilder(inputString);
        List<StringBuilder> ArrString = new ArrayList<>();
        int rightIndex=0;
        StringBuilder newstring=new StringBuilder();
        while (rightIndex<stringBuilder.length()){
            char c=stringBuilder.charAt(rightIndex);
            if (48<=c&&c<=57||65<=c&&c<=90||97<=c&&c<=122){
                newstring.append(c);
                if (rightIndex==stringBuilder.length()-1){
                    ArrString.add(new StringBuilder(newstring));
                }
            }else{
                String cs=Character.toString(c);
                String equel="-";
                if (cs.equals(equel)&&!equel.equals(newstring.charAt(newstring.length()))){
                    newstring.append(c);
                }else if (Character.isSpaceChar(c)){
                    ArrString.add(new StringBuilder(newstring));
                    newstring.delete(0,newstring.length());
                }
            }
            rightIndex++;
        }
        for (int i = ArrString.size()-1; i >=0 ; i--) {

            System.out.print(ArrString.get(i)+" ");

        }
    }
}
