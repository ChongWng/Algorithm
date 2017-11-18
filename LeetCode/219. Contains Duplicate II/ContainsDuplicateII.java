/**********
 * Solution of 219. Contains Duplicate II
 * https://leetcode.com/problems/contains-duplicate-ii/
 * @author: Chong Wang
 * Date: 14/11/17, 20:38
 */




//Solution1 HashMap
//Each key has an only value, if the key is duplicate, then the value will be updated
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k) return true;
            }
            map.put(nums[i],i);
        }
        return false;       
    }
}