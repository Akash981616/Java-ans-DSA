package RangeQuery .java;


public class SegmentTree {
    class Node {
        int data;
        int ss;
        int se;
        Node right;
        Node left;

    }
 
    Node root;

    public void build(int arr[]) {
        root = buildTree(arr, 0, arr.length - 1);
    }


    public Node buildTree(int arr[],int ss,int se){
        if (ss == se) {
            Node root = new Node();
            root.ss = ss;
            root.se = se;
            root.data = arr[ss];
            return root;
        }
        Node root = new Node();
        root.ss=ss;
        root.se = se;
        int mid = (ss + se) / 2;
        root.left = buildTree(arr,ss,mid);
        root.right =buildTree(arr,mid+1,se);
        root.data = root.left.data + root.right.data;
        return root;

    }


    public void update(int idx, int val) {
        updateHelper(root, idx, val);
    }

    public void updateHelper(Node root, int idx, int val) {
        if (root.ss == root.se) {
            root.data = val;
            return;
        }
        int mid = root.ss + root.se / 2;
        if (idx <= mid) {
            updateHelper(root.left, idx, val);
        } else {
            updateHelper(root.right, idx, val);
        }
        root.data = root.left.data + root.right.data;
    }

    public int query(int qs,int qe) {
        return queryHelper(root,qs,qe);
    }

    public int queryHelper(Node root, int qs, int qe) {
        if (root.ss >= qs && root.se <= qe) {
            return root.data;
        } else if (root.ss > qe || root.se < qs) {
            return 0;
        } else {
            int lv = queryHelper(root.left, qs, qe);
            int rv = queryHelper(root.right, qs, qe);
            return lv + rv;
        }
    }
     
    private static int buildSegmentTree (int[] arr, int[] segment, int index, int start, int end) {
        
        if (start == end) {
            return arr[start];
        }
        
        int mid = (start + end) / 2;
        segment[2 * index + 1] = buildSegmentTree (arr, segment, 2 * index + 1, start, mid);
        segment[2 * index + 2] = buildSegmentTree (arr, segment, 2 * index + 2, mid + 1, end);
        
        return Math.min(segment[idx] = segment[2 * idx + 1] , segment[2 * idx + 2]); 
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
        
        return Math.min(segment[idx] = segment[2 * idx + 1] , segment[2 * idx + 2]); 
    }
    
    private static int findMinimumFromRange (int[] segment, int index, int leftIndex, int rightIndex, int start, int end) {
        
        if (leftIndex > end || rightIndex < start) {
            return Integer.MAX_VALUE;
        }
        else if (leftIndex <= start && rightIndex >= end) {
            return segment[index];
        }
        
        int mid = (start + end) / 2;
        int x = findMinimumFromRange (segment, 2 * index + 1, leftIndex, rightIndex, start, mid);
        int y = findMinimumFromRange (segment, 2 * index + 2, leftIndex, rightIndex, mid + 1, end);
        
        return Math.min(x,y);
    }
    
}

