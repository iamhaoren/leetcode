package 剑指offer;

public class 二维数组中的查找 extends Base {
    //根据该题中数组的特性
    //可以从数组的最右上方元素开始查找，减少不必要查找次数。
    //启发：类似的题找好出发点很重要
    public boolean Find(int target, int [][] array) {
        if(array.length==0)
            return false;
        int rows=array.length-1;
        int cols=array[0].length-1;
        int row=0;
        int col=cols;
        while(row<=rows&&col>=0){
            int temp=array[row][col];
            if(temp==target)
                return true;
            if(temp<target)
                row++;
            else
                col--;
        }
        return false;
    }
}
