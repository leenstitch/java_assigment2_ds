
package com.mycompany.doublylinkerlist;

import com.sun.net.httpserver.Headers;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class DoublyLinkerList {
node head;
node tail;
static int size=0;

    public DoublyLinkerList(node head) {
        this.head = head;
    }

    private DoublyLinkerList() {
    }
public void add(int x){
  node n=new node(x);
    if(size==0){
       head=tail=n;
        size++;
        
    }
    if(!search(x)){
 if(size==1){
     if(x>head.data){
     tail.next=n;
     n.back=tail;
     tail=n;
     size++;
 }
     else{
          tail.back=n;
         n.next=tail;
         head=n;
         size++;
     }
  }

 else if(size>1){
         if(head.data>x){
           head.back=n;
           n.next=head;
           head=n;
           size++;
       }
         else if(x>tail.data){
          
             tail.next=n;
             n.back=tail;
             tail=n;
             size++;
                     
         }
         else{
       node curr=head;
       while(curr.next!=null){
           if(x>curr.data&&x<curr.next.data){   
               n.next=curr.next;
               curr.next.back=n;
               curr.next=n;
               n.back=curr;
               size++;
               break;
           }
           curr=curr.next;
       } 
         }
    
    
} 
}
}
public String print(){
    node curr=head;
    String s="";
    for (int i = 0; i <size; i++) {
       System.out.print(curr.data+" ");
       s=s+curr.data+" ";
        curr=curr.next;
    }
    return s;
}
public void delete(int x){
   if(head.data==x){
        head=head.next;
        size--;
    }
    else if(tail.data==x){
       node b=tail.back;
        b.next=null;
        tail.back=null;
        tail=b;
        size--;
    }
    else{
       node curr=head; 
       while(curr.next!=null){
       if(curr.data==x){
           curr.back.next=curr.next;
           curr.next.back=curr.back;
           size--;
           break;
       }
       else{
         curr=curr.next;
       }
    }
    }
}
public boolean search(int x){
   if(size==0){
        return false;
    }
    else{
       node curr1=head;
     for(int i=0;i<size;i++){
           if(curr1.data==x){
                return true;
            }
            curr1=curr1.next;
        }
    }
    return false;
}
public void update(int x,int y){
    if(!search(y)){
       
        node curr=head;
        for(int i=0;i<size;i++){
            if(curr.data==x){
               delete(x);
               add(y);//to print the elemnt in ascending order ;
            }
            else{
                curr=curr.next;
            }
        }
    }
}
    public static void main(String[] args) {
        DoublyLinkerList list=new DoublyLinkerList();
        list.add(5);
        list.add(54);
        list.add(53);
        list.add(55);
        System.out.println(list.print());  
//    Scanner n=new Scanner(System.in);
//    int num=n.nextInt();
//    for(int i=0;i<num;i++){
//      //  int nn=n.nextInt();
//        list.add(n.nextInt());
//    }
//    node max=list.head.next;
//    node min=list.head.next;
//    boolean b=true;
//    for(int i=0;i<num;i++){
//        while(max.next!=null||min.next!=null){
//            if(min.back.data>min.data){
//                
//            }
//        }
//    }
    }
}
