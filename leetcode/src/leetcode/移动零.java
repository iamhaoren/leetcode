package leetcode;

public class 移动零 extends Base {

    //解法一：双指针
    //p1指向从左到右第一个0元素
    //p2用来遍历每个元素
    //p2为0时，直接下一个
    //p2非零时，与p1交换。
    public void moveZeroes(int[] nums) {
        for (int p1=0,p2=0;p2<nums.length;p2++){
            if (nums[p2]!=0){
                int temp=nums[p2];
                nums[p2]=nums[p1];
                nums[p1]=temp;
                p1++;
            }
        }
    }

    //解法二：根据规律挪动非零元素
    //非零元素移动的位置，其实就是它前面0的个数
    //可以先移动非零元素，然后再填充0的元素
    public void moveZeroes2(int[] nums) {
        int cnt=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0)
                cnt++;
            else {
                nums[i-cnt]=nums[i];
            }
        }
        for (int i=nums.length-cnt;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
