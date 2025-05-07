
package com.mycompany.doublylinkerlist;

public class node {
    int data;
  node next;
  node back;  

    public node(int data, node next, node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    node(int x) {
        this.data=x;
    }
  
}
