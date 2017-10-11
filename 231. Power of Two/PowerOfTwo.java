/**********
 * Solution of Power of Two
 * https://leetcode.com/problems/power-of-two/
 * @author: Chong Wang
 * Date: 11/10/17, 09:57
 */

/**
 * Analysis:
 * a power of two means a number of the form 2n where n is an integer
 * If a number is power of 2, it's binary form should be 10...0.
 */
 
//Solution 1 - the best solution 
class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n>0) && (n&(n-1))==0);
    }
}

/**
 * Explanation:
 * & is bitwise AND operator comparing bits of each operand
 * int a = 4;
 * int b = 7;
 * System.out.println(a & b); // prints 4
//meaning in an 32 bit system
// 00000000 00000000 00000000 00000100
// 00000000 00000000 00000000 00000111
// ===================================
// 00000000 00000000 00000000 00000100
 */
 
//Solution 2 - Mathematics solution 
class Solution {
    public boolean isPowerOfTwo(int n) {
        return ((n>0) && n == Math.pow(2, Math.round(Math.log(n)/Math.log(2))));
    }
}


//Solution 3 
 
