/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unity1.Simplestructures;

/**
 *
 * @author AULA1
 */
public class List {
    private Node head;
    
    
    public void add(int d){
        Node n = new Node (d);
        if(head==null){
            head=n;
        }else{
            Node aux=head;
            while(aux.Next!=null){
                aux=aux.Next;
            }
            aux.Next=n;
        }
    }
    public void print(){
        Node aux = head;
        while(aux!=null){
            System.out.println(""+aux.data);
            aux=aux.Next;
        }
        System.out.println();
    }
    public int remove(int p){
        return 0;
    }
    public List(){
        head = null;
        
    }
    public int count(){
       Node aux = head;
       int counter=0;
       while(aux!=null){
           counter++;
           aux=aux.Next;
       }
       return counter;
    }
    public void printFirstElement(){
        if(head==null){
            System.out.println("-1");
        }else{
            System.out.println(head.data);
        }
     
    }
    public void PrintLastElement(){
        Node aux = head;
        if(aux!=null){
            while(aux.Next != null){
                aux = aux.Next;
            }
            System.out.println(aux.data);
        }else{
            System.out.println("-1");
        }
        
    }
    
    public void duplicate(){
     if (head==null)return;
     Node last = head, aux = head;
     while(last.Next != null){
         last = last.Next;
     }
     int c = count();
     for(int i= 0; i < c; i++){
            last.Next = new Node(aux.data);
            aux= aux.Next;
            last= last.Next;
        }
    }
    public void reversPrint(){
        Node aux=head;
        Node last;
        
        if(aux != null){
            aux = aux.Next;
            last = aux;            
        }
        while(aux!=null){
            int c=count();
            
        }
        
    }
    public void invert(){
        if(head==null)return;
        Node aux= head, head2=null;
        while(head!=null){
            aux= head;
            head= head.Next;
            aux.Next=head.Next;
            head2=aux;
        }
        head=head2;
    }
            
    public void insertZeros(){
            Node aux =head;
            if(head == null)return;
            while(aux != null){
                
            }
        }
    public void removeMiddle(){
        Node aux=head, last=head;
        while(last.Next != null){
            last = last.Next;
        }
        int c= count();
        int a;
        a= c/2;
        for(int i=0;i<a;i++){
            if(aux!=null){
                aux=aux.Next;
                System.out.println(aux.data);
            }            
        }
    }
    public int countOdds(){
        Node aux= head;
        int counter=0;
        while(aux != null){
            aux=aux.Next;
        }
        System.out.println(aux.data);
        String a= String.valueOf(aux.data);
        int c= Integer.parseInt(a),b;
        b=c%2;
        while(b!=0){
            counter++;
        }
        return counter;
        
    }
    
    
}
