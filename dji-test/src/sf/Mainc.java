package sf;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;



public class Mainc {
    public static void main(String[] args) throws  Exception {
        Long startTime=System.currentTimeMillis();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String[] perematerS=bf.readLine().split(" ");
        List<Integer> list=new ArrayList<>();

        Integer num=Integer.parseInt(bf.readLine());
        Integer max=0;
        for (int i=1;i<num+1;i++){
            String[] herd=bf.readLine().split(" ");
            Integer sumfen=0;
            for (int j = 0; j <perematerS.length ; j++) {
                sumfen+=Integer.parseInt(herd[j])*Integer.parseInt(perematerS[j]);
            }
            if (sumfen>max){
                max=sumfen;
                list.clear();
                list.add(i);
            }else if (sumfen==max){
                list.add(i);
            }
        }
        Long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(max);
        System.out.println(list.size());
        for(Integer integer:list){
            System.out.println(integer);
        }
    }
}
