package Tree;

public class MaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;
 
    public MaxHeap(int maxsize)
    {

        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    private int parent(int pos) { return (pos - 1) / 2; }

    private int leftChild(int pos) { return (2 * pos); }

    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos)
    {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }
 

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void maxHeapify(int pos)
    {
        if (isLeaf(pos))
            return;
 
        if (Heap[pos] < Heap[leftChild(pos)]
            || Heap[pos] < Heap[rightChild(pos)]) {
 
            if (Heap[leftChild(pos)]
                > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    public void insert(int element)
    {
        Heap[size] = element;

        int current = size;
        while (Heap[current] > Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }
 
    public void print()
    {
       
      for(int i=0;i<size/2;i++){
 
            System.out.print("Parent Node : " + Heap[i] );
             
            if(leftChild(i)<size)
               System.out.print( " Left Child Node: " + Heap[leftChild(i)]);
             
            if(rightChild(i)<size) 
                System.out.print(" Right Child Node: "+ Heap[rightChild(i)]);
             
                System.out.println(); 
             
        }
           
    }
 
    public int extractMax()
    {
        int popped = Heap[1];
        Heap[1] = Heap[size--];
        maxHeapify(1);
        return popped;
    }
 
    public static void main(String[] arg)
    {
        
        System.out.println("The Max Heap is ");
 
        MaxHeap maxHeap = new MaxHeap(15);

        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
 
        maxHeap.print();
 
        System.out.println("The max val is "
                           + maxHeap.extractMax());
    }
}