/**********
 * Solution of 561. Array Partition I
 * https://leetcode.com/problems/array-partition-i/
 * @author: Chong Wang
 * Date: 19/11/17, 00:19
 */
 

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
}