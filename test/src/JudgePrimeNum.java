public class JudgePrimeNum {
  public static void main(String[] args) {
    int num = 17;
    boolean isPrime = true;
    if (0 == num || 1 == num) {
      System.out.println(num + " is not a prime or a composite number");
    } else {
      for(int i = 2; i < num / 2; i++) {
        if (0 == num % i) {
          isPrime = false;
          break;
        }
      }
      System.out.println(num + (isPrime ? " is" : " isn't") + " a prime number");
    }
  }
}