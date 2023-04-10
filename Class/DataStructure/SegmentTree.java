package DataStructure;

/**
 * SegmentTree
 */
public class SegmentTree {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int n = arr.length;
         int[] seg = new int[4 * n];
        build(0, 0, n - 1, arr, seg);
        System.out.println(query(0, 0, n - 1, 0, 4, seg));
    }

    public static void build(int idx, int low, int high, int arr[], int seg[]) {
        if (low == high) {
            seg[idx] = arr[idx];
            return;
        }
        int mid = (low + high) / 2;
        build(2 * idx + 1, low, mid, arr, seg);
        build(2 * idx + 2, mid + 1, high, arr, seg);
        seg[idx] = Math.min(seg[2 * idx + 1], seg[2 * idx + 2]);
    }
    


 public static int query(int idx, int low, int high, int l, int r, int seg[]) {
    if (low > r || l > high) {
        return Integer.MAX_VALUE;
        }
        // OverLap
        else if(l>=low && high<=r){
            return seg[idx];
        } else {
            int mid = low + high / 2;
            int left = query(2*idx+1, low, mid, l, r,  seg);
            int right = query(2 * idx + 2, mid+1, high, l, r,  seg);
            return Math.min(left, right);
        }
    }
}
import java.util.*;
import java.io.*;

class Solution {
    
    private static int buildSegmentTree (int[] arr, int[] segment, int index, int start, int end) {
        
        if (start == end) {
            return arr[start];
        }
        
        int mid = (start + end) / 2;
        segment[2 * index + 1] = buildSegmentTree (arr, segment, 2 * index + 1, start, mid);
        segment[2 * index + 2] = buildSegmentTree (arr, segment, 2 * index + 2, mid + 1, end);
        
        return segment[index] = segment[2 * index + 1] + segment[2 * index + 2];
    }
    
    private static int update (int index, int val, int idx, int start, int end) {
        
        if (index < start || index > end) {
            return segment[idx];
        }
        else if (start == index && end == index) {
            return val;
        }
        
        int mid = (start + end) / 2;
        segment[2 * idx + 1] = update (index, val, 2 * idx + 1, start, mid);
        segment[2 * idx + 2] = update (index, val, 2 * idx + 2, mid + 1, end);
        
        return segment[idx] = segment[2 * idx + 1] + segment[2 * idx + 2];
    }
    
    private static int findMinimumFromRange (int[] segment, int index, int leftIndex, int rightIndex, int start, int end) {
        
        if (leftIndex > end || rightIndex < start) {
            return 0;
        }
        else if (leftIndex <= start && rightIndex >= end) {
            return segment[index];
        }
        
        int mid = (start + end) / 2;
        int x = findMinimumFromRange (segment, 2 * index + 1, leftIndex, rightIndex, start, mid);
        int y = findMinimumFromRange (segment, 2 * index + 2, leftIndex, rightIndex, mid + 1, end);
        
        return x + y;
    }
    
    public static void main (String[] args) throws IOException {
        
        try (BufferedReader reader = new BufferedReader (new InputStreamReader (System.in))) {
            
            int testCases = Integer.parseInt (reader.readLine ());
            
            for (int testCase = 1; testCase <= testCases; testCase++) {
                reader.readLine ();
            
            	String[] s = reader.readLine ().split (" ");
                int n = Integer.parseInt (s[0]);
                int q = Integer.parseInt (s[1]);

                s = reader.readLine ().split (" ");
                int[] arr = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt (s[i]);
                }

                int[] segment = new int[4 * n];
                segment[0] = buildSegmentTree (arr, segment, 0, 0, n - 1);
                
                System.out.println ("Case " + testCase + ":");

                while (q-- != 0) {
                    s = reader.readLine ().split (" ");
                    int leftIndex = Integer.parseInt (s[0]) - 1;
                    int rightIndex = Integer.parseInt (s[1]) - 1;
                    System.out.println (findMinimumFromRange (segment, 0, leftIndex, rightIndex, 0, n - 1)); 
                }
            }
        }
    }
}