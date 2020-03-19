package leetcode;

import java.util.Arrays;

public class 多数元素 {

    //解法一：
    //既然多数元素大于总数的1/2
    //那么排序后，位于1/2的元素为多数元素
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //解法二：摩尔投票
    //纯属神仙解法
    public int majorityElement2(int[] nums) {
        int itsme=0;
        int cnt=0;
        for (int i:nums){
            if (cnt==0)
                itsme=i;
            if (i==itsme)
                cnt++;
            else
                cnt--;
        }
        return itsme;
    }
}
