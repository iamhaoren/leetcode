package 剑指offer;

public class 旋转数组的最小元素 extends Base {
    public int minNumberInRotateArray(int [] array) {
        if(array.length==0)
            return 0;
        for(int i=0;i<array.length-1;i++){
            int temp=array[i+1];
            if(temp<array[i])
                return temp;
        }
        return 0;
    }
}
