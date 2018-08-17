package com.zemoso.debuggerexample;

import java.util.ArrayList;
import java.util.Iterator;

public class Human {
    private String name;
    private ArrayList<Dog> myDogs = new ArrayList<Dog>();

    public Human(String name){
        this.name = name;
    }

    //assigns the dog to human
    void adoptDog(Dog dog){
        myDogs.add(dog);
    }

    //return the dogs owned by a human
    void listmydogs(){
        Iterator it = myDogs.iterator();
        while (it.hasNext()){
            Dog currentDog = (Dog)it.next();
            System.out.println(currentDog.getName());
        }
    }

    //makes all the dogs owned by the human to speak
    void OrderDogsTospeak(){
        Iterator it = myDogs.iterator();
        while (it.hasNext()){
            Dog currentDog = (Dog)it.next();
            System.out.println(currentDog.getName() + ": " );
            currentDog.speak();
        }
    }
}
