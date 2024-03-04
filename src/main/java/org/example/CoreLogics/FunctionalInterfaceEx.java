package org.example.CoreLogics;

@FunctionalInterface
public interface FunctionalInterfaceEx {
    public default void greet() {
        System.out.println("hello");
    }

    public abstract void greeting();
}
