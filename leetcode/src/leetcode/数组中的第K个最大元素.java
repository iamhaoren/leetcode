package leetcode;

import java.util.PriorityQueue;

public class 数组中的第K个最大元素 extends Base {

    //解法一：最小堆
    //思想优化：题目要求第k个最大元素，我最先想到的是最大堆
    //然后再找第k个元素
    //但是其实可以直接用最小堆，并限制堆大小
    //这样堆内的元素，就是前k个最大元素，堆顶元素就是第k个最大元素
    //时间复杂度O（nlogk）
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i:nums){
            pq.add(i);
            if (pq.size()>k)
                pq.poll();
        }
        return pq.poll();
    }
}
