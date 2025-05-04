package cswassignTWO;

import java.util.*;

class Animal {
    private String name;
    private String color;
    private String type; 

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(name, color, type);
    }

    @Override
    public String toString() {
        return "Animal [Name=" + name + ", Color=" + color + ", Type=" + type + "]";
    }
}

public class Q6 {
    public static void main(String[] args) {
      
        Animal a1 = new Animal("Dog", "Brown", "Pet");
        Animal a2 = new Animal("Tiger", "Orange", "Wild");
        Animal a3 = new Animal("Parrot", "Green", "Pet");
        Animal a4 = new Animal("Elephant", "Grey", "Wild");
        Animal a5 = new Animal("Dog", "Brown", "Pet"); 

        
        System.out.println(a1 + " | HashCode: " + a1.hashCode());
        System.out.println(a2 + " | HashCode: " + a2.hashCode());
        System.out.println(a3 + " | HashCode: " + a3.hashCode());
        System.out.println(a4 + " | HashCode: " + a4.hashCode());
        System.out.println(a5 + " | HashCode: " + a5.hashCode()); 

        
    }
}

