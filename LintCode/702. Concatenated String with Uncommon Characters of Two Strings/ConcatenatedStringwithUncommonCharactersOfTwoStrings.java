/**********
 * Solution of Concatenated String with Uncommon Characters of Two Strings
 * http://www.lintcode.com/en/problem/concatenated-string-with-uncommon-characters-of-two-strings/
 * @author: Chong Wang
 * Date: 18/11/17, 23:57
 */

public class Solution {
    /*
     * @param : the 1st string
     * @param : the 2nd string
     * @return: uncommon characters of given strings
     */
    public String concatenetedString(String s1, String s2) {
        // write your code here
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i))) {
                map.put(s2.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < s1.length(); i++) {
            if (!map.containsKey(s1.charAt(i))) {
                sb.append(s1.charAt(i));
            } else {
                map.put(s1.charAt(i), 2);
            }
        }
        
        for (int i = 0; i < s2.length(); i++) {
            if (map.get(s2.charAt(i)) == 1) {
                sb.append(s2.charAt(i));
            }
        }
        
        return sb.toString();
    }
};