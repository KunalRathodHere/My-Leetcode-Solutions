//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        // code here
        if(N == 0) return -1;
        
        if( (N & (N-1)) != 0) return -1;
        
        int cnt = 1;
        
        while((N >> 1) != 0) {
            cnt++;
            N = N >> 1;
        }
        
        return cnt;
        
        
    }
};