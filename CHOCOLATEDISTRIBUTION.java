// sliding window concept
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class CHOCOLATEDISTRIBUTION {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> arr = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                arr.add(Integer.parseInt(token));
            }

            int m = Integer.parseInt(br.readLine());
            Solution ob = new Solution();

            System.out.println(ob.findMinDiff(arr, m));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends

// User function Template for Java
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {

        Collections.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < arr.size(); i++) {
            // calculate the diffrence of current window
            int diff = arr.get(i + m - 1) - arr.get(i); // means minimmumelement - maximum element in itrated numb
            if (diff < mindiff) {
                mindiff = diff;
            }

        }
        return mindiff;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 1, 9, 56, 7, 9, 12));
        System.out.println(ob.findMinDiff(arr, 5));
    }
}