package socialmediavisualization;

import java.util.Iterator;

/**
 * Singly linked list using generic input
 * @author Group 116
 * @version 2023.4.13
 * @param <T> Generic type
 */
public class LinkedList<T> implements Iterator<T> {
    private int size;
    private Node head;
    
    /**
     * Gets if there are no elements in the list
     * @return is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * Removes all elements from the list
     */
    public void clear() {
        head = new Node(null, null);
    }
    
    /**
     * Gets element from the front of the list
     * @return Front element
     */
    public T get() {
        return head.data;
    }
    
    /**
     * Gets the number of elements in the list
     * @return Size 
     */
    public int size() {
        return size;
    }

    /**
     * Searches the list for a given element
     * @param element Element to search for
     * @return If contained in the list
     */
    public boolean contains(T element) {
        Node currentNode = head;
        while (currentNode.next != null) {
            if (currentNode.equals(element)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    /**
     * Adds an element to the back of the list
     * @param element Element to be added
     * @return If successfully added
     */
    public boolean add(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = new Node(element, null);
        size++;
        return true;
    }

    /**
     * Removes an element from the list
     * @param element Element to remove
     * @return If successfully removed
     */
    public boolean remove(T element) {
        if (element == null) {
            throw new IllegalArgumentException();
        }
        if (!contains(element)) {
            return false;
        }
        Node currentNode = head;
        while (!currentNode.next.equals(element)) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        size--;
        return true;
    }

    /**
     * Gets the index of an element
     * @param element Element to find the index of
     * @return Index if found, -1 if not found
     */
    public int indexOf(T element) {
        Node currentNode = head;
        int count = 0;
        while (currentNode.next != null) {
            if (currentNode.equals(element)) {
                return count;
            }
            currentNode = currentNode.next;
            count++;
        }
        return -1;
    }
    
    @Override
    public boolean hasNext() {
        return false;
    }
    
    @Override
    public T next() {
        return null;
    }
    
    /**
     * Class for nodes in the list
     * @author Group 116
     * @version 2023.4.13
     */
    private class Node {
        private T data;
        private Node next;
        
        /**
         * Constructs a new Node object
         * @param data Generic data type
         * @param next Pointer to next object in the list
         */
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}