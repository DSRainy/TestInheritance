/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.training.crudorm.test.inheritance;

/**
 *
 * @author Rain
 */
public class Dog extends Animal {

    public Dog() {
        System.out.println("Dog");
        this.setName("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat");
    }
}
