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
public abstract class MotherClass {
    private int value;
    private String name;

    public MotherClass() {
    }

    public MotherClass(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public abstract void display();

    @Override
    public String toString() {
        return "MotherClass{" + "value=" + value + ", name=" + name + '}';
    }
    
    
}
