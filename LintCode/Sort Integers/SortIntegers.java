/**********
 * Solution of 463. Sort Integers
 * http://www.lintcode.com/en/problem/sort-integers/
 * @author: Chong Wang
 * Date: 19/11/17, 00:01
 */
 
 
//Solution 1
//Total Runtime: 3096 ms
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


//Solution 2 Bubble Sort
//Total Runtime: 2286 ms
public class Solution {
    /*
     * @param A: an integer array
     * @return: 
     */
    public void sortIntegers(int[] A) {
        for(int i=0; i<A.length-1; i++){
            for(int j=1; j<A.length-i; j++){
                if(A[j-1]>A[j]){
                    int temp=A[j-1];
                    A[j-1]=A[j];
                    A[j]=temp;
                }
            }
        }
    }
}