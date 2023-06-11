//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            String arr[] = in.readLine().trim().split("\\s+");
            int S = Integer.parseInt(arr[0]);
            int N = Integer.parseInt(arr[1]);
            int M = Integer.parseInt(arr[2]);
            
            Solution ob = new Solution();
            System.out.println(ob.minimumDays(S, N, M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumDays(int S, int N, int M){
        // code here
        
        if(N < M) return -1;
        
        if(N == M) {
            if(S >= 7) return -1;
            else{
                return S;
            }
        }
        
        else{
            int sundays = S / 7;
            
            int food_can_bought = (S - sundays) * N;
            int food_required = S * M;
            
            if(food_can_bought < food_required) return -1;
            
            int temp = S * M;
            
            if(temp % N == 0) return temp / N;
            else return ((temp / N) + 1);
            
        }
        
    }
}