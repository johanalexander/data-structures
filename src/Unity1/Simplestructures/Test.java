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
public class Test {
    public static void main(String[] arg){
        List l = new List();
        l.add(5);
        l.add(10);
        l.add(15);
        System.out.println("Initial values");
        l.print();
        int c = l.count();
        System.out.println("Total Node "+c);
        
        System.out.println("duplica");
        l.duplicate();
        
        System.out.println("valores duolicado ");
        l.print();
        
        
        
    
}
    
}
