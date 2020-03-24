package leetcode;

import java.util.*;

public class 前k个高频元素 {

    //最小堆
    //时间复杂度：建堆的nlogk
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> result=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Integer> minHeap=new PriorityQueue<>((key1,key2)->map.get(key1)-map.get(key2));
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (int i:map.keySet()){
            minHeap.add(i);
            if (minHeap.size()>k)
                minHeap.poll();
        }
        while (!minHeap.isEmpty()){
            result.add(minHeap.poll());
        }
        return result;
    }
}
