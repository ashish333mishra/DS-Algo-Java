//Initial template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function template for Java

class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int zeroes = 0, ones = 0, twos = 0;
        for(int i = 0; i < n; i++) {
            switch(a[i]){
                case 0: zeroes++;
                break;
                case 1: ones++;
                break;
                case 2: twos++;
            }
        }
        int index = 0;
        while( twos > 0){
            if(zeroes > 0){
                zeroes--;
                a[index] = 0;
            }
            else if(ones > 0){
                ones--;
                a[index] = 1;
            }
            else {
                twos--;
                a[index] = 2;
            }
            index++;
        }
    }
}

// { Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}

  // } Driver Code Ends
