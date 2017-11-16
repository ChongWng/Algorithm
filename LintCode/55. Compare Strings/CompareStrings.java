/**********
 * Solution of Compare Strings
 * http://www.lintcode.com/en/problem/compare-strings/
 * @author: Chong Wang
 * Date: 16/11/17, 14:33
 */

public class Solution {
    /*
     * @param A: A string
     * @param B: A string
     * @return: if string A contains all of the characters in B return true else return false
     */
    public boolean compareStrings(String A, String B) {
        // write your code here
        int[] chars = new int[26];
        for(int c:chars){
            c = 0;
        }
        for(int i=0;i<A.length();i++){
            chars[A.charAt(i)-'A']++;
        }
        for(int i=0;i<B.length();i++){
            chars[B.charAt(i)-'A']--;
            if(chars[B.charAt(i)-'A']<0) return false;
        }
        return true;
    }
}

