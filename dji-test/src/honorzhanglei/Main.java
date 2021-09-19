package honorzhanglei;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int  num=Integer.parseInt(bf.readLine());
        String s=null;
        for (int i = 0; i <num ; i++) {
            int len=Integer.parseInt(bf.readLine());
            String str=bf.readLine();
            int[] arr=new int[len];
            List<Character> carr = new ArrayList<>();
            List<Character> iarr = new ArrayList<>();
            for (int j = 0; j <len ; j++) {
                char c=str.charAt(j);
                if ('a'<=c&&c<='z'){
                    arr[j]=1;
                    carr.add(c);
                }else if ('0'<=c&&c<='9'){
                    arr[j]=0;
                    iarr.add(c);
                }
            }
            Collections.sort(iarr);
            Collections.sort(carr);
            List<Character> resarr = new ArrayList<>();
            for (int j = 0; j <len ; j++) {
                if(arr[j]==1){
                    resarr.add(carr.get(0));
                    carr.remove(0);
                }else {
                    resarr.add(iarr.get(0));
                    iarr.remove(0);
                }
            }
            for(Character c:resarr){
                System.out.print(c);
            }
            System.out.println();
        }
        }
}
