package test;

public class Points {
    public static void main(String[] args) {
        Points points=new Points();
        int[][] arr=new int[][]{{1,1},{2,2},{3,3}};
        System.out.println(points.maxPoints(arr));
    }
    public int maxPoints(int[][] points) {
        //最少为1
        int res = 1;
        for(int i = 0;i < points.length-1;i ++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            //为什么从i + 1算起？ 包括i个点的前面已经算过了，不用重复计算，下面以j+1开始同样的原理
            for (int j = i + 1;j < points.length;j ++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                //此时有两个点了
                int curRes = 2;
                for (int k = j + 1; k < points.length;k ++){
                    int x3 =  points[k][0];
                    int y3 =  points[k][1];
                    if((y2-y1)*(x3-x1) == (y3-y1)*(x2-x1) ){
                        //如果在线段上，+1
                        curRes ++;
                    }
                }
                if (curRes > res){
                    res = curRes;
                }
            }
        }
        return res;
    }
}
