package honorzhanglei;

import sun.applet.resources.MsgAppletViewer_ko;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main1 {
    public static void main(String[] args)throws Exception {
        int $dfas=0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String  s=null;
        List<int[]> allarr=new ArrayList<>();
        String[] strings=bf.readLine().split(",");
        String[] strings1=bf.readLine().split(",");
        String[] strings2=bf.readLine().split(",");
        String[] strings3=bf.readLine().split(",");



            int num = strings.length;
            for (int i = 0; i <num; i++) {
                int[] arr=new int[4];
                arr[0]=Integer.parseInt(strings[i]);
                arr[1]=Integer.parseInt(strings1[i]);
                arr[2]=Integer.parseInt(strings2[i]);
                arr[3]=Integer.parseInt(strings3[i]);
                allarr.add(arr);
            }

        Map<Double,Double> m=new TreeMap<>();
            int index=1;
        for(int[] arr:allarr){

            double time=(arr[0]-arr[1])/10+arr[1]/2+arr[2]*0.5*15;
            m.put(time,arr[3]+index*0.001);
            index++;
        }
        int i=0;
        Double ek0=0.0;
        Double vk0=0.0;
        for(Map.Entry<Double,Double> entry:m.entrySet()){
            if(i==0){
                ek0=entry.getKey();
                vk0=entry.getValue();
            }else if (i==1){
                if (entry.getKey()>=ek0+60){
                    System.out.println((int)(vk0%1*1000)+","+ek0.intValue());
                }else {
                    if (entry.getValue()>vk0){
                        System.out.println(entry.getKey().intValue()+","+(int)(entry.getValue()%1*1000));
                    }else {
                        System.out.println((int)(vk0%1*1000)+","+ek0.intValue());
                    }

                }
            }else {
                break;
            }
            i++;
        }



    }
}
