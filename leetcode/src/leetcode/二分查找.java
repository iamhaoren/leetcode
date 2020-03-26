package leetcode;

public class 二分查找 extends Base {

    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length;
        int mid=0;
        while (start<end){
            mid=(start+end)/2;
            if (nums[mid]==target)
                return mid;
            else if(nums[mid]>target){
                end=mid;
            }
            else{
                start=mid;
            }
        }
        return -1;
    }
}
