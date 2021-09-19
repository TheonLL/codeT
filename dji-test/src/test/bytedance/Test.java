package test.bytedance;

import java.util.Scanner;

/**
 * @author: 11983
 * @date: 21/08/29 19:55
 * @description:
 */

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            int sum =0;
            System.out.println("1");
            sum+=scanner.nextInt();
            if (scanner.hasNextLine()){
                System.out.println("true");
                System.out.println(sum);
                sum=0;
            }
        }
    }
}
