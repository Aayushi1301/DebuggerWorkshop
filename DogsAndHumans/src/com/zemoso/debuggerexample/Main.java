package com.zemoso.debuggerexample;

public class Main {

      public static void main(String[] args) {
          // Let's create three dogs
        Dog sparky=new Dog("sparky");
        Dog fido=new Dog("fido");
        Dog pluto=new Dog("pluto");

        // fakeDog is not a real dog because it doesn't
        // point to a real dog but rather the pluto dog object.
        Dog fakeDog = pluto;
        System.out.println("  ");
        System.out.println("Printing the fake dog's name  ");
        System.out.println("My name is: " + fakeDog.getName());

        // fakeDog now points to fido.
        // Remember fakeDog is not a real dog.
        fakeDog = fido;

        System.out.println("My name is: " + fakeDog.getName());

        // We might as well make a human because someone should feed the dogs, right?
        Human john = new Human("john");

        // John adopts two dogs
        john.adoptDog(sparky);
        john.adoptDog(fido);
        john.adoptDog(new Dog("charlie"));

        // Check how many dogs John currently has
        john.listmydogs();

        //John adopts another dog
        john.adoptDog(pluto);

        // John commands all of his dogs to speak.
        john.OrderDogsTospeak();


        //Let's ask the fakeDog to speak and reveal it's name
        System.out.println(fakeDog.getName());
        fakeDog.speak();

    }
}
