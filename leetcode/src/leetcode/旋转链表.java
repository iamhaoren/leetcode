package leetcode;

public class 旋转链表 extends Base {

    //解法一：暴力
    public void rotate(int[] nums, int k) {
        //优化
        int len=nums.length;
        k%=len;
        for (int i=0;i<k;i++){
            int last=nums[len-1];
            for (int j=len-2;j>0;j--){
                nums[j+1]=nums[j];
            }
            nums[0]=last;
        }
    }
    //解法二：三次反转
    public void rotate2(int[] nums, int k) {
        k%=nums.length;
       helper(nums,0,nums.length-1);
       helper(nums,0,k-1);
       helper(nums,k,nums.length-1);
    }

    private void helper(int[] nums, int start, int end) {
        while (start<end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }

}
