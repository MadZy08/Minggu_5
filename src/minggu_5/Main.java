/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu_5;

/**
 *
 * @author asus
 */
class Animal {
    public void makeNoise() {
        System.out.println("Walk");
    }
}

class Dog extends Animal {
    public void makeNoise() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeNoise(); // Output: Walk

        Dog dog = new Dog();
        dog.makeNoise(); // Output: Bark

        Animal animadog = new Dog();
        animadog.makeNoise(); // Output: Bark (karena overriding)

        // Penggunaan instanceof
        if (animal instanceof Animal) {
            System.out.println("Animal is Animal!");
        }

        if (dog instanceof Animal) {
            System.out.println("Dog is Animal!");
        }

        if (animadog instanceof Animal) {
            System.out.println("animadog is Animal!");
        }

        if (animadog instanceof Dog) {
            System.out.println("Animal is Dog!");
        }
    }
}