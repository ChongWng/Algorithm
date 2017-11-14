/**********
 * Solution of Length of Last Word
 * https://leetcode.com/problems/length-of-last-word/
 * @author: Chong Wang
 * Date: 10/11/17, 16:28
 */


class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(' ')-1;
    }
}