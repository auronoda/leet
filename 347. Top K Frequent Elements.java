public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num,1);
            }
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(new entryComparator());
        for (Map.Entry<Integer, Integer> entry: map.entrySet()){
            heap.offer(entry);
        }
        for (int i = 1; i <= k; i++){
            list.add(heap.poll().getKey());
        }
        return list;
    }
}

class entryComparator implements Comparator{
    public int compare(Object o1, Object o2) {
        return ((Map.Entry<Integer, Integer>)o2).getValue() - ((Map.Entry<Integer, Integer>)o1).getValue();
    }
}