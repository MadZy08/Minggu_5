/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu_5;

/**
 *
 * @author asus
 */
class A {
    void callThis() {
        System.out.println("Inside Class A's Method!");
    }
}

class B extends A {
    void callThis() {
        System.out.println("Inside Class B's Method!");
    }
}

class C extends A {
    void callThis() {
        System.out.println("Inside Class C's Method!");
    }
}

public class DynamicDispatch {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;

        ref = b;
        ref.callThis(); // Output: Inside Class B's Method!

        ref = c;
        ref.callThis(); // Output: Inside Class C's Method!

        ref = a;
        ref.callThis(); // Output: Inside Class A's Method!
    }
}