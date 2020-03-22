package leetcode;

public class 旋转图像 extends Base {
    //解法一：先转置，再翻转。
    public void rotate(int[][] matrix) {
       int n=matrix.length;
       for (int row=0;row<n;row++){
           for (int col=row;col<n;col++){
               int temp=matrix[row][col];
               matrix[row][col]=matrix[col][row];
               matrix[col][row]=temp;
           }
       }

       for (int i=0;i<n;i++){
           int start=0,end=n-1;
           while (start<end){
               int temp=matrix[i][end];
               matrix[i][end]=matrix[i][start];
               matrix[i][start]=temp;
               start++;
               end--;
           }
       }
    }

    //揭发二：一层一层的交换元素
    public void rotate2(int[][] matrix) {
       int TR=0;
       int TC=0;
       int DR=matrix.length-1;
       int DC=matrix[0].length-1;
       while (TR<DR){
           helper(matrix,TR++,TC++,DR--,DC--);
       }
    }

    private void helper(int[][] matrix, int TR, int TC, int DR, int DC) {
        int times=DR-TR;
        //time<times是一个难点
        //刚开始想，有几个元素，就应该旋转几次
        //但其实第一个元素旋转的时候，也把最后一个元素给旋转了，所以要少一次
        for (int time=0;time<times;time++){
            //坐标移动是一个难点，刚开始用的是++，比如TC++
            //但发现第一个用了，第二个就变了
            //解决方案：坐标移动和次数time挂钩
            int temp=matrix[TR][TC+time];
            matrix[TR][TC+time]=matrix[DR-time][TC];
            matrix[DR-time][TC]=matrix[DR][DC-time];
            matrix[DR][DC-time]=matrix[TR+time][DC];
            matrix[TR+time][DC]=temp;
        }
    }
}
