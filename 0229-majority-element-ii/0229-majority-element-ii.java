
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> li = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int a = nums.length / 3;
        
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
     
        for (Integer key : map.keySet()) {
            if (map.get(key) > a) {
                li.add(key);
            }
        }
        
        return li;
    }
}
