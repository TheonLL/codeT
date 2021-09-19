package honor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args)throws Exception{
        InputStream in;
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=bf.readLine().split(" ");
        String[] sarr2=bf.readLine().split(" ");
        int olen = sarr.length;
        int ind=Integer.parseInt(sarr2[0])-1;
        int num=Integer.parseInt(sarr2[1]);
        int recored=0;
        for (int start = ind; start <num+ind; start+=20) {
            if (recored>olen-ind-1||recored>=num){
                break;
            }
            for (int j = start; j < 20+start-1; j++) {
                if (recored>olen-ind-1||recored>num){
                    break;
                }else if(recored==olen-ind-1||recored==num){
                    System.out.print(sarr[j]);
                    recored++;
                    break;
                }
                    System.out.print(sarr[j]);
                    recored++;
                    if (recored<num){
                        System.out.print(";");
                    }else if (recored==num){
                        break;
                    }
            }
            if (recored>olen-ind-1||recored>=num){
                break;
            }else {
                System.out.println(sarr[20+start-1]);
                recored++;
            }
        }
    }
}
