/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassList list = new ClassList();
        
        list.addClass(new ChildA());
        list.addClass(new ChildB());
        list.addClass(new ChildA());
        list.addClass(new ChildA());
        list.addClass(new ChildA());
        list.addClass(new ChildB());
        
        list.displayAll();
        
    }
    
}
