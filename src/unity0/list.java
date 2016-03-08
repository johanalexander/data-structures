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
public class list {
    private int data[];
    private int top;

    public list() {

        data = new int[100];
        top = 0;

    }

    public void add(int d, int p) {

        data[p] = d;
        top++;

    }

    public int remove(int p) {

        int d = data[p];
        
        for (int i = p; i < top; i++) {

            data[i] = data[i + 1];

        }
        
        top--;
        return data[d];

    }

    public void print() {

        for (int i = 0; i < top-1; i++) {

            System.out.print(" " + data[i]);

        }
        
        System.out.println();

    }
    
}
