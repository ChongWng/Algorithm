import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private WeightedQuickUnionUF uf;
    private WeightedQuickUnionUF ufBackwash;
    private int[] sites;
    
    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        for(int i=0; i<n; i++){
            
        }
    }       
    
    // open site (row, col) if it is not open already
    public void open(int row, int col) {
    
    }   
    
    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
    
    
    } 
    public boolean isFull(int row, int col)  // is site (row, col) full?
   public int numberOfOpenSites()       // number of open sites
   public boolean percolates()              // does the system percolate?

   public static void main(String[] args){   // test client (optional)
       
   }
}