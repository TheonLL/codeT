package sf;

import java.util.*;


public class Main {
    public static void main(String[] args) throws  Exception {
        double t=Math.pow(2,3);
        Long startTime=System.currentTimeMillis();
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i <5 ; i++) {
            arr[i]=scanner.nextInt();
        }
        int num = scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        Integer max=0;
            for (int i=1;i<num+1;i++) {
                Integer sumfen = 0;
                for (int j = 0; j < 5; j++) {
                    sumfen +=arr[j]*scanner.nextInt() ;
                    if (sumfen > max) {
                        max = sumfen;
                        list.clear();
                        list.add(i);
                    } else if (sumfen == max) {
                        list.add(i);
                    }
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
