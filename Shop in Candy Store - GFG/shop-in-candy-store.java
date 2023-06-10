//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int K = Integer.parseInt(input_line[1]);
            input_line = read.readLine().trim().split("\\s+");
            int candies[]= new int[N];
            for(int i = 0; i < N; i++)
                candies[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            ArrayList<Integer> cost = ob.candyStore(candies,N,K);
            System.out.println(cost.get(0)+" "+cost.get(1));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    static ArrayList<Integer> candyStore(int candies[],int N,int K){
        // code here
        Arrays.sort(candies);
        
        int i =0,  j = N-1;
        int min_amount = 0;
        while(i <= j){
            
            min_amount += candies[i];
            i++;
            j-=K;
            
        }
        
        i = 0; j = N-1;
        int max_amount =0;
        
        while(i <= j){
            max_amount += candies[j];
            i+=K;
            j--;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(min_amount);
        arr.add(max_amount);
        
        return arr;
        
    }
}