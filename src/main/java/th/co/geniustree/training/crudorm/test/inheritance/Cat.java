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
public class Cat extends Animal {

    public Cat() {
        System.out.println("Cat");
        this.setName("Cat");
    }

    @Override
    public void eat() {
        System.out.println("Cat.eat");
    }

}
