interface bike {
 public void bikemodel();
 public void bikesound();
}

class toyota implements bike {
 public void bikemodel(){
 System.out.println("bike model: toyo209");
}
 public void bikesound(){
  System.out.println("bike sound : Vuuu");
}
}

class bikee {
 public static void main(String[] args) {
 toyota mytoyota = new toyota();
 mytoyota.bikemodel();
 mytoyota.bikesound();
}
}