/**********
 * Solution of 133. Longest Words 
 * http://www.lintcode.com/en/problem/longest-words/
 * @author: Chong Wang
 * Date: 16/11/17, 12:17
 */

public class Solution {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public ArrayList<String> longestWords(String[] dictionary) {
        // write your code here
        ArrayList<String> strs = new ArrayList<String>();
        int length = 0;
        for(String str: dictionary){
            if(str.length()>length) {
                length = str.length();
                strs.clear();
                strs.add(str);
            }
            else if(str.length()==length) strs.add(str);
        }
        
        return strs;
    }
}