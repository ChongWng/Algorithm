/**********
 * Solution of 136. Single Number
 * https://leetcode.com/problems/single-number/
 * @author: Chong Wang
 * Date: 14/11/17, 21:18
 */
 
 class Solution {
    public int singleNumber(int[] nums) {
        int theOne = 0;
        for(int num:nums){
            theOne^=num;
        }
        return theOne;
    }
}