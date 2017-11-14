/**********
 * Solution of Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * @author: Chong Wang
 * Date: 13/11/17, 21:32
 */
 
 class Solution {
    public int removeDuplicates(int nums[]) {
        int n = nums.length;
        if(n < 2) return n;
        int id = 1; 
        for(int i = 1; i < n; i++) 
            if(nums[i] != nums[i-1]) nums[id++] = nums[i];
        return id;
    }
}