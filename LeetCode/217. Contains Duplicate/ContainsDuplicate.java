/**********
 * Solution of Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * @author: Chong Wang
 * Date: 15/10/17, 22:22
 */

//Solution 1
//Time complexity: O(N^2), memory: O(1) 
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

//Solution 2
//Time complexity: O(N lg N), memory: O(1) - not counting the memory used by sort
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }          
        }
        return false;
    }
}