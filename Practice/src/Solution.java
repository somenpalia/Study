import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
     // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {        
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        SinglyLinkedListNode fina=null;
         SinglyLinkedListNode finalhead=null;
    if(temp1==null){
        return temp2;
    }if(temp2==null){
        return temp1;
    }if(temp1==null && temp2==null){
        return null;
    }  
        if(temp1!=null && temp2!=null){
        while(temp1 !=null && temp2 !=null ){
        if(temp1.data<=temp2.data){
            if(temp1==head1 && fina==null){
                fina=temp1;
                finalhead=fina;
                temp1=temp1.next;
            }else{
                fina.next=temp1;
                temp1=temp1.next;
                
            }
            
        }else{
            if(temp2==head2 && fina==null){
                fina=temp2;
                finalhead=fina;
                temp2=temp2.next;
            }else{
                fina.next=temp2;
                temp2=temp2.next;
            }
            
        }  //else
    }  //while
        }  //if
        if(temp2!=null && temp1==null){
            while(temp2!=null){
                
            
            fina.next=temp2;
            temp2=temp2.next;
                }
        }else{
            while(temp1!=null){
                
         
            fina.next=temp1;
            temp1=temp1.next;
                   }
        }
    
       return finalhead;
    }
}