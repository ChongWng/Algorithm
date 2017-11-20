/**********
 * Solution of 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * @author: Chong Wang
 * Date: 19/11/17, 11:29
 */
 
 class Solution {
    public boolean isAnagram(String s, String t) {
        int[] words = new int[26]; 
        for(int i:words){
            i = 0;
        }
        for(int i=0;i<s.length();i++) words[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++) words[t.charAt(i)-'a']--;               
        for(int i:words){
            if(i!=0) return false;
        }
        return true;
    }
}