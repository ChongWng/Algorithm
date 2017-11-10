/**********
 * Solution of Fizz Buzz
 * https://leetcode.com/problems/fizz-buzz/
 * @author: Chong Wang
 * Date: 10/11/17, 10:50
 */
 

 class Solution {
    public List<String> fizzBuzz(int n) { 
        List<String> str = new ArrayList<String>(n);
        for(int i=1; i<=n; i++){
            if(i%15 == 0) str.add("FizzBuzz");
            else if(i%3 == 0) str.add("Fizz");
            else if(i%5 == 0) str.add("Buzz");
            else str.add(""+i);
        }

        return str;
    }
}


