package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 存在重复元素 {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1])
                return true;
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for (int i:nums){
            if (set.contains(i))
                return true;
            else
                set.add(i);
        }
        return false;
    }
}
