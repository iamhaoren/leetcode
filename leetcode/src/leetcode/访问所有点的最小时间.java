package leetcode;

public class 访问所有点的最小时间 extends Base {

    public int minTimeToVisitAllPoints(int[][] points) {
        int result=0;
        for (int i=0;i<points.length-1;i++){
            int x=Math.abs(points[i+1][0]-points[i][0]);
            int y=Math.abs(points[i+1][1]-points[i][1]);
            result+=Math.max(x,y);
        }
        return result;
    }
}
