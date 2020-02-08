public class CircleDemo {
  public static void main(String[] args) {
    int aNumber = 3;
    if (aNumber >= 0) {
      if (aNumber == 0) {
        System.out.println("first string");
      } else {
        System.out.println("second string");
      }
    }
    System.out.println("third string");

//    for (;;) {}
//    while (true) {}
    for(int item = 0; item < 5; item++) {
      if (3 == item) {
        break;
      }
      System.out.print(item);
    }

    System.out.print("\n");

    for(int item = 0; item < 5; item++) {
      if (3 == item) {
        continue;
      }
      System.out.print(item);
    }
  }
}
