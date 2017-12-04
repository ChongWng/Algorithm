/**********
 * Solution of 389. Find the Difference
 * https://leetcode.com/problems/find-the-difference/
 * @author: Chong Wang
 * Date: 5/12/17, 11:41
 */
 
 
 class Solution {
    public char findTheDifference(String s, String t) {
        int[] letters = new int[26];
        for(char c:s.toCharArray()){
            letters[c-'a']++;
        }
        for(char c:t.toCharArray()){
            letters[c-'a']--;
            if(letters[c-'a']<0) return c;
        }
        
        return 'a';
    }
}