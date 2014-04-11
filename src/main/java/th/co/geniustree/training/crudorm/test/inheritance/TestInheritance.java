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
        animalDoing(new Cat(), "Rainy");
        animalDoing(new Dog(), "555");
        animalDoing(new Rabbit(), "Thanthathon");
    }

    private static void animalDoing(Animal animal, String name) {
        animal.eat();
        animal.setName(name);
        System.out.println(animal.getName());
        System.out.println("------------------------------");

    }
}
