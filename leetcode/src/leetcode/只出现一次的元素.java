package leetcode;

public class 只出现一次的元素 extends Base   {
    //暴力和hashmap很容易想到
    //但是异或的方式最优雅
    //异或：相同为0，不同为1
    //这道题刚好其他数都出现两次，且异或满是结合和交换律
    //所以其他数的异或都会为0
    public int singleNumber(int[] nums) {
        int result=0;
        for (int i:nums){
            result^=i;
        }
        return result;
    }
}
