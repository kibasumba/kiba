class Vehicle {
public void Name() {
 System.out.println("toyota");
}
public void Model() {
 System.out.println("Model : toyo778");
}
}

class Car extends Vehicle {
 public void color() {
 System.out.println("color is : black");
}
}
public class to {
public static void main(String[] args) {
 Car myCar = new Car();
 myCar.Name();
 myCar.Model();
 myCar.color();
}
}
