package com.zemoso.debuggerexample;
public class Dog {

    private String name;

    //setter
    public Dog(String name){
        this.name = name;
    }
    //getter
    String getName(){
        return name;
    }

    //each dog speaks his name length times
    void speak(){
        int i;
        for ( i =0; i < name.length(); i ++){
            System.out.print("woof");

            if (i < name.length() - 1 ){
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
