/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ClassList {
    private ArrayList<MotherClass> list = new ArrayList();
    
    public void addClass(MotherClass mc) {
        list.add(mc);
    }
    
    public void displayAll() {
        System.out.printf("%10s | %20s | %s\n", "COUNT", "NAME", "DISPLAY");
        for(int i = 0; i < list.size(); ++i) {
            System.out.printf("%10d | %20s | ", i+1, list.get(i).getName());
            list.get(i).display();
        }
    }
}
