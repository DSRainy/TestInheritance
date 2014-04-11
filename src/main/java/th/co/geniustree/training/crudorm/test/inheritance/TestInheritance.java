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
public class TestInheritance {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.setName("Rainy");
        System.out.println(dog.getName());
        System.out.println("------------------------------");

        Cat cat = new Cat();
        cat.eat();
        cat.setName("5555");
        System.out.println(cat.getName());
        System.out.println("------------------------------");

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.setName("Thanthathon");
        System.out.println(rabbit.getName());
    }
}
