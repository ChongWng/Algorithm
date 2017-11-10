/**********
 * Solution of Reverse String
 * https://leetcode.com/problems/reverse-string/
 * @author: Chong Wang
 * Date: 10/11/17, 12:32
 */

//Solution 1: Exceed time limitation
class Solution {
    public String reverseString(String s) {
        int n = s.length();
        String newStr = "";
        for(int i=0; i<n; i++){
            newStr+=s.charAt(n-1-i);
        }
        return newStr;
    }
}

//Solution 2: Using Java Library
public class Solution {
    public String reverseString(String s) {
        int length = s.length();
        if (length <= 1) return s;
        String leftStr = s.substring(0, length / 2);
        String rightStr = s.substring(length / 2, length);
        return reverseString(rightStr) + reverseString(leftStr);
    }
}



//Solution 3
public class Solution {
    public String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}