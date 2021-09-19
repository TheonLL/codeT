package xiaomi;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args)throws  Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        int len=s.length();
        char[] carr=new char[]{'1','2','3'};
        for (char c:carr) {
            for (int j = 0; j <len; j++) {
                char c1=s.charAt(j);
                if (c1==c){
                    System.out.print(c+" ");
                }
            }
        }
    }
}
