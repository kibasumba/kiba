interface Animal {
 public void animalcolor();
 public void walk(); 
}

class hen implements Animal {
  public void animalcolor() {
    System.out.println("hen color: yellow");
  }
  public void walk() {
    System.out.println("is walking");
  }
}

public class mam {
  public static void main(String[] args) {
    hen myhen = new hen();
    myhen.animalcolor();
    myhen.walk();
  }
}