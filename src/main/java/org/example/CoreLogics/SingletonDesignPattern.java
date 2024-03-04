package org.example.CoreLogics;

class Singleton{
    private static Singleton instance;
    private Singleton(){}

    public synchronized static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public  void displayMessage(){
        System.out.println("calling from singleton ");
    }
}
public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();
        singletonInstance.displayMessage();
        System.out.println(singletonInstance.hashCode() +"::"+singletonInstance2.hashCode());
    }
}
