/**********
 * Solution of Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * @author: Chong Wang
 * Date: 15/10/17, 22:22
 */
 
class Solution {
    public boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
            
        }
        return false;
    }
}