/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unity0;

/**
 *
 * @author AULA1
 */
public class Test {
    public static void main (String[] arg){
        //testingStack();
        testingQueue();
    }
    public static void testingStack(){
        System.out.println("-----------------Stack Testing--------------------");
        Stack s = new Stack();
        s.add(10);
        s.add(20);
        s.add(30);
        s.remove();
        s.print();       
                
        for(int i=2; i<20;i+=2){
            s.add(i);
        }
        s.print();
    }
    public static void testingQueue(){
        System.out.println("-----------------Queue Testing--------------------");
        Queue q= new Queue();
        for(int i=1;i<20;i++){
            q.add(i);
        }
//        System.out.print("Initial values");
//        q.print();
        int d = q.remove();
        System.out.println("The element remove was: "+d);
        System.out.print("Initial values");
        q.print();
    }
    
    
}
