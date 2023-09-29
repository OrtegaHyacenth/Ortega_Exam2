/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ortegaexam2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class OrtegaExam2 {
        private class Name {
            int data;
            Name next;
            String name;
        }
        
private Name head, tail;
private int size;

class Item {
    String name;
    Item next;

    public Item(String name) {
        this.name = name;
        this.next = null;
    }
}

 public OrtegaExam2() {
        head = null;
    }
//

private Name createNewNode(int index) throws Exception {
    Name node = new Name();
    
    node.data = index;
    node.next = null;
    
    return node;
    
}

private void insertion(int index, int position) throws Exception {
    if(position < 0 || position > size){
        throw new Exception("Index Invalid");
    } else if (position == 0){
        insertBeg(index);
    } else if (position == size){
        insertEnd(index);
    }else{
        Name node = createNewNode (index);
        Name prev = getNodeat(index -1);
        node.next = prev.next;
        prev.next = node;
        tail.next = head;
        size++;
    }
    
}
        
private void insertBeg(int index)throws Exception{
    Name node = createNewNode(index);
    
    if (size == 0){
    head = tail = node;
    }else{
        node.next = head;
        head = node;
    }
    
    tail.next = tail;
    
    size++;
}

private void insertEnd (int index) throws Exception{
    Name node = createNewNode(index);
    
    if(size > 0){
        tail.next = node;
        tail = node;
        
    }else if (size == 0){
        head = tail = node;
    }
    tail.next = head;
    size++;
}

   LinkedList<Item> item = new LinkedList<>();
public Name insertItem(String name) {
       Item insertItem = new Item (name);
       item.add(insertItem);
       
       return head;
    }
   
//   
private void display() throws Exception {
    if (size == 0){
        throw new Exception ("List is empty");
    }
    
    Name temporary = head;
    
    while(temporary != tail){
    System.out.println(temporary.data + " , ");
    temporary = temporary.next;
}
    System.out.println(tail.data + " , ");   
}

private Name getNodeat (int position) throws Exception{
    
    if (size == 0){
        throw new Exception ("Linked list is empty");
    }else if (position < 0 || position > size ){
        throw new Exception("Invalid Position");
    }else {
        for (int i = 0; i < position; i++) {
            head = head.next;
            
        }
    }
            return head;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    OrtegaExam2 list = new OrtegaExam2();
    boolean start = true;
    
    while(start){
        System.out.println("1. Insert");
        System.out.println("2. Display");
        System.out.println("3. Sari-Sari Store");
        int choice = scan.nextInt();
        scan.nextLine();
        int name = 0 ,position;
        
        switch(choice){
            case 1:
                System.out.println("Enter Name:");
             String addName= scan.nextLine();
                System.out.println("Enter Position:");
                 position = scan.nextInt();
                
                list.insertion(name, position-1);
                break;
            case 2:
                list.display();
                break;
            case 3:
                
               while(start){
                   System.out.println("1. All Products:");
                   System.out.println("2.Search Product:");
                   System.out.println("3. Return Product:");
                   int choose = scan.nextInt();
                   
                   switch(choice){
                       case 1:
                         
                          break;
                       case 2:
                           
                   }
                   
               }
                
           
        }
    }
    
    }
    
}
