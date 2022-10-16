//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int n, int arr[])
    {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        if(sum % 2 == 1) return 0;

        boolean [][] t = new boolean[n+1][sum/2 + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0) {
                    t[i][j] = true;
                }
            }
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum/2 +1; j++) {
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        if(t[n][sum / 2]) return 1;
        else return 0;
    }
}