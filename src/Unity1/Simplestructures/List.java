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
        Node aux =head;
        int a=0;
        if(aux != null ){
            aux= aux;
        }else{
            
        }
    }
    public void PrintLastElement(){
        
    }
    
    
}
