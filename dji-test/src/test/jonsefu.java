package test;


import java.util.ArrayList;
import java.util.List;

public class jonsefu {
    public static void main(String[] args) {
        jonsefu jonsefu=new jonsefu();
        jonsefu.lastPeople(3,3);
    }
    private static void lastPeople(int n, int m) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int target = 0;
        while (!list.isEmpty()) {
            target = (target + m)%list.size();
            if (target != 0) {
                arr.add(list.get(target-1));
                list.remove(target-1);
                target--;
            }else {
                arr.add(list.get(list.size()-1));
                list.remove(list.size()-1);
            }
        }
        int len = arr.size();
        System.out.println(arr.get(len-1));

    }

}
