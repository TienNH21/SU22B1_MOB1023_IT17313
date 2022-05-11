/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_interface;

/**
 *
 * @author tiennh
 */
public class Dog implements Animal {
    @Override
    public void an()
    {
        System.out.println("Cơm");
    }
    
    @Override
    public void diChuyen()
    {
        System.out.println("Chạy");
    }
    
    @Override
    public void tiengKeu()
    {
        System.out.println("Gâu gâu");
    }
}
