/**********
 * Solution of Judge Route Circle
 * https://leetcode.com/problems/judge-route-circle/
 * @author: Chong Wang
 * Date: 10/11/17, 16:02
 */
 
 class Solution {
    public boolean judgeCircle(String moves) {
        int count = moves.length();
        if(count%2 != 0) return false;
        
        else{
            int right=0, left=0, up=0, down = 0;
            for(int i=0; i<count; i++){
                if(moves.charAt(i)=='R') right++;
                if(moves.charAt(i)=='L') left++;
                if(moves.charAt(i)=='U') up++;
                if(moves.charAt(i)=='D') down++;
            }
            if((right==left)&&(up==down)) return true;
            else return false;
        }
    }
}

//Simple 
class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2 != 0) return false;
        
        else{
            int x=0, y=0;
            for(char c : moves.toCharArray()){
                if(c=='R') x++;
                else if(c=='L') x--;
                else if(c=='U') y++;
                else y--;
            }
            return (x==0)&&(y==0);
        }
    }
}