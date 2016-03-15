/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.Simplestructures.doublelist;

/**
 *
 * @author AULA1
 */
public class list {
    
    private Node head;
    
    public list(){
        
        head = null;
        
    }
    
    public void add(int d){
        
        Node n = new Node(0);
        if(head == null){
            head = n;
        }else{
            Node aux = head;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = n;
            n.back = aux;
        }
    }
    
    public void print(){
        
        Node aux = head;
        while (aux != null) {

            System.out.println("  " + aux.data);
            aux = aux.next;

        }
        System.out.println();
        
    }
    
    public void reversePrint(){
        
        if(head == null) return;
        Node aux = head;
        while(aux != null){
            aux = aux.next;
        }
        while(aux != null){
            System.out.println(" " + aux.data);
            aux = aux.back;
        }
        
    }
    
    public void Push(int d){
        
        Node n = new Node(d);
        if(head == null){
            head = n;
        }else{
            n.next = head;
            head.back = head;
            head = n;
        }
    }
    
    
    public void removeLast(){
        
        Node aux = head;
        if(head==null)return;
        head = head.next;
        aux.back=null;
        
        
        
    }
    
    public void removeFirst(){
        
        
        
    }
    
   public void invert(){
       
       
       
   }
    
}
