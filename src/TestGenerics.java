import java.util.*;

public class TestGenerics {

    public static void main(String[] args) {
        new TestGenerics().go();
    } // method main

    public void go() {
        List<Dog> dogs1 = new ArrayList<Dog>();//ArrayList<Dog> dogs1 = new ArrayList<Animal>(); // 1
        List<? extends Animal> animals1 = new ArrayList<Dog>();//ArrayList<Animal> animals1 = new ArrayList<Dog>(); // 2
        List<Animal> list = new ArrayList<Animal>(); // 3
        ArrayList<Dog> dogs = new ArrayList<Dog>(); // 4
        List<? extends Animal> animals = dogs;//ArrayList<Animal> animals = dogs; // 5
        List<Dog> dogList = dogs; // 6
        ArrayList<Object> objects = new ArrayList<Object>(); // 7
        List<Object> objList = objects; // 8
        List<? extends Object> objs = new ArrayList<Dog>(); //ArrayList<Object> objs = new ArrayList<Dog>(); // 9
    } // method go

    public void takeAnimals(ArrayList<Animal> animals) {
        for(Animal a: animals) {
            a.eat();
        } // for
    } // method takeAnimals
} // class TestGenerics4



