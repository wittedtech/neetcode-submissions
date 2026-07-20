class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> twoSum = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int difference = target - nums[i];
            if(twoSum.containsKey(difference)){
                return new int[]{twoSum.get(difference),i};
            } 
            twoSum.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
