/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;


public class node {
  int data;
 node right,left;

    public node(int data, node right, node left) {
        this.data = data;
        this.right = right;
        this.left = left;
    }

    node(int x) {
        this.data=x;
        left=right=null;
        
      
   } 
}
