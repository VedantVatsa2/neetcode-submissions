class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int n = nums.length;
        HashMap <Integer, Integer> mp = new HashMap<>();
        //int k = nums[0] - target;
        for(int i=0; i<n; i++){
            mp.put(nums[i], i);
        }
        for(int i=0; i<n; i++){
            int k = target-nums[i];
            if(mp.containsKey(k) && i!=mp.get(k)){
                arr[0] = mp.get(target-nums[i]);
                arr[1] = i;
            }
            mp.put(nums[i], i);

        }
        return arr;
    }
}
