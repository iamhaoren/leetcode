package leetcode;

public class 转置矩阵 extends Base{

    public int[][] transpose(int[][] A) {
        int row=A.length;
        int col=A[0].length;
        //注意新数组行列数应该和原数组是反的
        int[][] result=new int[col][row];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                result[j][i]=A[i][j];
            }
        }
        return result;
    }
}
