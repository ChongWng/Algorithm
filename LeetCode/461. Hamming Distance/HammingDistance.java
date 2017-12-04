/**********
 * Solution of 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/
 * @author: Chong Wang
 * Date: 3/12/17, 14:19
 */
 
 class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}