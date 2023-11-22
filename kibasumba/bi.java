class animal {
public void drink() {
 System.out.println("Animal is drinking");
}
public void feed() {
 System.out.println("Animal is feeding");
}
}

class bird extends animal {
 void sing() {
 System.out.println("bird is singing..");
}
}
public class bi {
public static void main(String[] args) {
 bird mybird = new bird();
 mybird.drink();
 mybird.feed();
 mybird.sing();
}
}
