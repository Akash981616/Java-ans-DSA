package Tree;

package Tree;

import java.util.*;

class Main {

  static class LRUCache {
    private class Node {
      int key, value;
      Node prev, next;

      Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.prev = null;
        this.next = null;
      }
    }

    private HashMap<Integer, Node> map = new HashMap<>();

    private Node head = null;
    private Node tail = null;
    private int capacity = 0;
    private int size = 0;

    public LRUCache(int capacity) {
      this.capacity = capacity;
      this.size = 0;
      this.head = null;
      this.tail = null;
    }

    private void removeNode(Node node) {
      if (this.size == 1)
        this.head = this.tail = null;
      else {
        Node prev = node.prev;
        Node forw = node.next;

        if (prev == null) {
          this.head = forw;
          forw.prev = null;
        } else if (forw == null) {
          this.tail = prev;
          prev.next = null;
        } else {
          forw.prev = prev;
          prev.next = forw;

        }

        node.next = node.prev = null;
      }

      this.size--;
    }

    private void addLast(Node node) {
      if (this.size == 0)
        this.tail = this.head = node;
      else {
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
      }

      this.size++;
    }

    private void makeRecent(Node node) {
      if (node == tail)
        return;

      removeNode(node);
      addLast(node);
    }

    public int get(int key) {
      if (!map.containsKey(key))
        return -1;

      Node node = map.get(key);
      makeRecent(node);

      return node.value;
    }

    public void put(int key, int value) {
      if (map.containsKey(key)) {
        Node node = map.get(key);
        node.value = value;
        makeRecent(node);
      } else {
        if (this.size == this.capacity) {
          int rKey = this.head.key;
          removeNode(this.head);
          map.remove(rKey);
        }
        Node node = new Node(key, value);
        addLast(node);
        map.put(key, node);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt(); // no of operations
    // 0 stand for put, 1 stand for get
    int size = scn.nextInt();
    LRUCache lru = new LRUCache(size);

    while (n-- > 0) {
      int op = scn.nextInt();
      if (op == 0)
        lru.put(scn.nextInt(), scn.nextInt());
      else
        System.out.println(lru.get(scn.nextInt()));
    }
  }
}

                                
class LRUCache {
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();
    int cap;
    public LRUCache(int capacity) {
        this.cap = capacity;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        moveRecently(key);
        return cache.get(key);
    }
    
    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            moveRecently(key);
            return;
        }
        if (cache.size() >= this.cap) {
            int oldKey = cache.keySet().iterator().next();
            cache.remove(oldKey);
        }
        cache.put(key, value);
    }
    public void moveRecently(int key) {
        int val = cache.get(key);
        cache.remove(key);
        cache.put(key, val);
    }
}
class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

// only need addToFront and Delete
class LRUCache {

    Map<Integer, Node> map;
    Node head;
    Node tail;
    int capacity;

    // initializ a <capacity> size data sctructure with two empty nodes pointing to each other (head and tail)
    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    // move the current node to head, O(1)
    public void moveToHead(Node curr) {
        curr.next = head.next;
        curr.prev = head;
        head.next = curr;
        curr.next.prev = curr;
    }

    // delete the current node, O(1)
    public void delete(Node curr) {
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
    }

    // when getting this node, delete it and move it to head because it is recently used, O(1)
    public int get(int key) {
        if(map.containsKey(key)) {
            Node curr = map.get(key);
            delete(curr);
            moveToHead(curr);
            return curr.val;
        }
        return -1;
    }

    // puts a new node if it doesn't already exist. Regardless of if it already exists, this node is brough to head
    // because it is recently used. If capacity exceeds, remove the tail because it is the least used, O(1)
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node curr = map.get(key);
            curr.val = value;
            delete(curr);
            moveToHead(curr);
        }
        else if(map.size()<capacity) {
            map.put(key, new Node(key, value));
            moveToHead(map.get(key));
        }
        else {
            map.put(key, new Node(key, value));
            map.remove(tail.prev.key);
            delete(tail.prev);
            moveToHead(map.get(key));
        }
    }