package com.ch2.as9dll;

public class DLLTest {
    public static void main(String[] args) {
        DLL dll = new DLL();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(50);
        Node n4 = new Node(20);
        Node n5 = new Node(10);
//        Node n6 = new Node(10);
        
        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
//        dll.push(n6);
        
//        dll.printValuesForward();
//        dll.printValuesBackward();
//        System.out.println(dll.pop());
//        System.out.println(dll.contains(0));
//        System.out.println(dll.size());
//        
//        Node newNode = new Node(1);
//        dll.insertAt(newNode, 3);
//        dll.printValuesForward();

//        dll.removeAt(1);
//        dll.printValuesForward();
        
        System.out.println(dll.isPalindrome());
    }
}