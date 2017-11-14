/**********
 * Solution of 268. Missing Number
 * https://leetcode.com/problems/missing-number/
 * @author: Chong Wang
 * Date: 14/11/17, 20:38
 */
 
 //Solution 1, may overflow 
 class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0, length=nums.length;
        for(int num:nums){
            sum+=num;
        }
        
        return (length+1)*length/2-sum;
    }
}

//Solution 2, avoid overflow
class Solution {
    public int missingNumber(int[] nums) {
        int length=nums.length, sum=length;
        for(int i=0;i<length;i++){
            sum-=nums[i];
            sum+=i;
        }
        
        return sum;
    }
}

//Solution 3, XOR
class Solution {
    public int missingNumber(int[] nums) {
        int length=nums.length, missingNum=length;
        for(int i=0;i<length;i++){
            missingNum^=nums[i];
            missingNum^=i;
        }
        
        return missingNum;
    }
}

//Solution 4