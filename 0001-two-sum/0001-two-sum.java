class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int a=0 ; a<nums.length ; a++){

            int temp = target - nums[a];

            if(hm.containsKey(temp)){
                return new int[]{hm.get(temp),a};
            }

            hm.put(nums[a],a);
        }
        return new int[]{};
    }
}