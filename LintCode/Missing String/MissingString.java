/**********
 * Solution of Missing String
 * http://www.lintcode.com/en/problem/missing-string/
 * @author: Chong Wang
 * Date: 15/11/17, 16:52
 */
 
 //HashSet creates a collection that uses a hash table for storage.
 //Error: List is an interface, can only be instantiated by ArrayList
 public class Solution {
    /*
     * @param : a given string
     * @param : another given string
     * @return: An array of missing string
     */
    public List<String> missingString(String str1, String str2) {
        //using str2 to store completed string
        if(str1.length() > str2.length()){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        String[] str1parts = str1.split(" ");
        String[] str2parts = str2.split(" ");
        List<String> strs = new ArrayList<String>();
        HashSet<String> hs = new HashSet<String>();
        for(String part1: str1parts){
            hs.add(part1);
        }
        for(String part2: str2parts){
            if(!hs.contains(part2)) strs.add(part2);
        }
        
        return strs;
    }
};