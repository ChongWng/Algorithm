/**********
 * Solution of 27. Remove Element
 * https://leetcode.com/problems/remove-element/description/
 * @author: Chong Wang
 * Date: 31/01/18, 17:15
 */
 
 
class Solution {
    public int removeElement(int[] nums, int val) {
        int begin=0;
        for(int i=0;i<nums.length;i++) if(nums[i]!=val) nums[begin++]=nums[i];
        return begin;
    }
}

