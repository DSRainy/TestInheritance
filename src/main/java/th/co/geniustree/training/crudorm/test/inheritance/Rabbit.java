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
public class Rabbit extends Animal {

    public Rabbit() {
        System.out.println("Rabbit");
        this.setName("Rabbit");
    }

    @Override
    public void eat() {
        System.out.println("Rabbit.eat");
    }
}
