import java.util.*;

import org.jcp.xml.dsig.internal.SignerOutputStream;

class LRUCache {

    private class Node {
        int key = 0;
        int value = 0;

        Node prev = null, next = null;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashMap<Integer, Node> map;
    private Node head = null, tail = null;
    private int capacity = 0;

    private void addFirst(Node node) {
        if (head == null) {
            head = node;
        } else {
            head.next = node;
            node.prev = head;
            head = node;
        }
    }

    private void removeNode(Node node) {
        if (capacity == 1 || capacity == 0) {
            head = tail = null;
            return;
        }

        Node p = node.prev;
        Node f = node.next;

        node.next = null;
        node.prev = null;
    }

    private void makeRecentApp(Node node) {
        if (node == this.head)
            return;

        removeNode(node);
        addFirst(node);
    }

    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        this.capacity = capacity;
    }

    private Node fetchNode(int key) {
        Node node = map.get(key);
        makeRecentApp(node);
        return node;
    }

    // make it recent app and return its state
    public int get(int key) {
        if (!map.containsKey(key))
            return -1;

        return fetchNode(key).value;
    }

    // key : appName, value : stateOfApp
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = fetchNode(key);
            node.value = value;
        } else {
            Node node = new Node(key, value);
            addFirst(node);
            map.put(key, node);
            if (map.size() > this.capacity) {
                Node tail = this.tail;
                removeNode(tail);
                map.remove(tail.key);
            }
        }
    }
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */