interface foods {
 void Color();
}

interface drinks {
 void category();
}

class yam implements foods, drinks {
 public void Color() {
 System.out.println("yam is : brown");
}
 public void category() {
 System.out.println("category : foods ");
}
}

class mul {
 public static void main(String[] args) {
 yam myyam = new yam();
 myyam.Color();
 myyam.category();
}
}