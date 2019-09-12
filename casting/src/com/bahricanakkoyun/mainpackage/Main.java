package com.bahricanakkoyun.mainpackage;

class Animal {
  int health = 100;
}

class Mammal extends Animal {
  void eat() {
    System.out.println("Eating...");
  }
}

// Animal -> Mammal -> Cat
class Cat extends Mammal {
  @Override
  void eat() {
    System.out.println("Cat is eating...");
  }
}

// Animal -> Mammal -> Dog
class Dog extends Mammal {
}

public class Main {
  public static void main(String[] args) {
    Cat c = new Cat();
    System.out.println(c); // com.bahricanakkoyun.mainpackage.Cat@6e0be858

    // upcasting doesn't need to be done manually (it's automatic)
    Mammal m = c;
    System.out.println(m); // com.bahricanakkoyun.mainpackage.Cat@6e0be858

     /* as you can see, Cat is still exactly the same Cat after upcasting,
       it didn't change to Mammal, it's just being labeled Mammal right now */
    m.eat(); // Cat is eating...

    /* if you upcast an object, it will lose all its properties, which were inherited from below of its current position
       for example, if you cast Cat to Animal, it will lose properties inherited from Mammal and Cat */
    Animal a = c; // automatic upcasting Cat to Animal
    // a.eat() // compile error

    // but downcasting must always be done manually
    c = (Cat) a; // manual downcasting Animal back to Cat

    // unlike upcasting, downcasting can fail if the starting object type is not the target object type
    a = new Animal();
    // c = (Cat) a; // compile error

    /* also it is not possible to casting Cat to Dog using super classes Mammal or Animal
       because Cat is not Dog after all */
    m = c;
    // Dog d = (Dog) m; // compile error

    // if you really need to make Dog out of Cat, write conversion method inside Cat like this

    /* public Dog toDog(int barkVolume){
      Dog d = new Dog(furColor, speed, barkVolume);
      d.puppies = kittens;
      return d;
    } */
  }
}
