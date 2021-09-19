package xiaomi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)throws  Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        List<String> arr = new ArrayList<>();
        while ((s=bf.readLine())!=null){
            arr.add(s);
        }
        String s1=arr.get(0);
        String s2=arr.get(1);
        int len1=arr.get(0).length();
        int len2=arr.get(1).length();
        int[][] dparr=new int[len1+1][len2+1];
        for (int i = 1; i <=len1; i++) {
            for (int j = 1; j <=len2 ; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dparr[i][j]=dparr[i-1][j-1]+1;
                }else {
                    dparr[i][j]=Math.max(dparr[i-1][j],dparr[i][j-1]);
                }

            }

        }
        if (dparr[len1][len2]==0){
            System.out.println(0);
        }else {
            System.out.println(dparr[len1][len2]);
        }

    }

}
