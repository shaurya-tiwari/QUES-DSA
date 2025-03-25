//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class RemoveConsecutiveCharacters {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {

            String S = read.readLine().trim();

            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);

            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

// User function Template for Java

class Solution {
    public String removeConsecutiveCharacter(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) { // last character should be add becouse fo index
                                                                        // bound
                continue;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Test the solution
        Solution obj = new Solution();
        String s = "aabcccccaaa";
        System.out.println(obj.removeConsecutiveCharacter(s)); // Output: abc
    }
}