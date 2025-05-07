/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

public class node1 {
      int data;
  node1 next;
  node1 back;  

    public node1(int data, node1 next, node1 back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    node1(int x) {
        this.data=x;
    }
}
