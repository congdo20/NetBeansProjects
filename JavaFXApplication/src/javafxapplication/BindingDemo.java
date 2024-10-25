/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author donct
 */
public class BindingDemo {
    public static void main(String[] args) {
        //binding 1 chieu
        DoubleProperty d1 = new SimpleDoubleProperty(1);
        DoubleProperty d2 = new SimpleDoubleProperty(2);
        d1.bind(d2);
        System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
        d2.setValue(70.2);
        System.out.println("d1 is " + d1.getValue() + " and d2 is " + d2.getValue());
        
        //binding 2 chieu
        DoubleProperty d3 = new SimpleDoubleProperty(3);
        DoubleProperty d4 = new SimpleDoubleProperty(4);
        d3.bindBidirectional(d4);
        System.out.println("d3 is " + d3.getValue() + " and d4 is " + d4.getValue());
        d4.setValue(72.2);
        System.out.println("d3 is " + d3.getValue() + " and d4 is " + d4.getValue());
        d3.setValue(100.2);
        System.out.println("d3 is " + d3.getValue() + " and d4 is " + d4.getValue());
        
    }
}
