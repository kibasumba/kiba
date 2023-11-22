class Animal {
    void go() {
        System.out.println("Animal is going");
    }
}

class Cow extends Animal {
    void moo() {
        System.out.println("Mooo");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class hierarchical2 {
    public static void main(String[] args) {
        Cow myCow = new Cow();
       Dog myDog = new Dog();

      
        myCow.go();
        myCow.moo();

        myDog.go();
        myDog.bark();
    }
}
