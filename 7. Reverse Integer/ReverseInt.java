class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int tail = x % 10;
            int temp = rev * 10 + tail;
            if((temp-tail)/10 != rev){
                return 0;
            }
            x = x / 10;
			rev = temp;
			
		}
        return rev;
    }
}