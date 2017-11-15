
public class Solution {
    /*
     * @param A: an integer array
     * @return: 
     */
    public void sortIntegers(int[] A) {
        // write your code here
        int temp = 0;
        for(int i=0; i<A.length-1; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i]>A[j]){
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
    }
}