package com.ch2.as9dll;

import java.math.*;

public class DLL {
    public Node head;
    public Node tail;
    
    public DLL() {
        this.head = null;
        this.tail = null;
    }
    
    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }
    
    public void printValuesForward() {
        Node current = this.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }
    
    public void printValuesBackward() {
    	Node runner = this.tail;
    	while(runner != null) {
    		System.out.println(runner.value);
    		runner = runner.previous;
    	}
    }
    
    public Node pop() {
    	if (this.head == null) {
    		return null;
    	}
    	Node lastNode = this.tail;
    	Node secondLast = this.tail.previous;
    	secondLast.next = null;
    	return lastNode;
    }
    
    public boolean contains(Integer value) {
    	if (this.head == null) {
    		return false;
    	}
    	Node runner = this.head;
    	while (runner != null) {
    		if(runner.value == value) {
    			return true;
    		}
    		runner = runner.next;
    	}
    	return false;
    }
    
    public int size() {
    	if (this.head == null) {
    		return 0;
    	}
    	int counter = 0;
    	Node runner = this.head;
    	while (runner != null) {
    		counter ++;
    		runner = runner.next;
    	}
    	return counter;
    }
    
    public void insertAt(Node newNode, int index) {
    	if (this.size() >= index) {
    		Node runner = this.head;
    		int counter = 0;
    		while (index - 1 > counter) {
    			runner = runner.next;
    			counter ++;
    		}
    		newNode.next = runner.next;
    		runner.next = newNode;
    	}
    }
    
    public void removeAt(int index) {
    	if (this.size() >= index) {
    		Node runner = this.head;
    		int counter = 0;
    		while (index - 1 > counter) {
    			runner = runner.next;
    			counter++;
    		}
    		runner.next = runner.next.next;
    	}
    }
    
    public boolean isPalindrome() {
    	int midpoint = (int)Math.floor(this.size()/2);
    	int counter = 0;
    	Node frontRunner = this.head;
    	Node backRunner = this.tail;
    	while (counter <= midpoint) {
    		if(frontRunner.value != backRunner.value) {
    			return false;
    		} else {
    			frontRunner = frontRunner.next;
    			backRunner = backRunner.previous;
    			counter ++;
    		}
    	}
    	return true;
    }
}
