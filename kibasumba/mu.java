interface animal {
 void sound();
}

interface reptile {
 void walk();
}

class snake implements animal, reptile {
 public void sound() {
 System.out.println("snake sound : siii");
}
 public void walk() {
 System.out.println("snake is walking");
}
}

class mu {
 public static void main(String[] args) {
 snake mysnake= new snake();
 mysnake.sound();
 mysnake.walk();
}
}