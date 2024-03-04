package org.example.Strings;

final class Immutable{
    final String name;

    public Immutable(String name, String address) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
public class ImmutableClass {
    public static void main(String[] args) {
        Immutable imt = new Immutable("Danish","Delhi");
        String name = imt.getName();
        System.out.println(name+"");

    }
}
