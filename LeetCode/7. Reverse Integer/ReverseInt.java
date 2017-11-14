/**********
 * Solution of Reverse Integer
 * https://leetcode.com/problems/reverse-integer/
 * @author: Chong Wang
 * Date: 10/10/17, 21:38
 */

/**
 * Int for 32 bits, Long for 64 bits
 * Alternatively, convert the integer to a string and then reverse
 */


class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int tail = x % 10;
            int temp = rev * 10 + tail;
            if((temp-tail)/10 != rev){
                return 0;
            }
            x = x / 10;
			rev = temp;
			
		}
        return rev;
    }
}