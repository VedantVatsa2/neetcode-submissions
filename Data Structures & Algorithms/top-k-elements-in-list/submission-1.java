class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp =  new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i], 1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b) -> mp.get(b) - mp.get(a)
        );
        pq.addAll(mp.keySet());
        int arr[] = new int[k];
        for(int i=0; i<k; i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}
