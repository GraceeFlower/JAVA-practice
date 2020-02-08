public class JudgeFloatEqualToZero {
  public static void main(String[] args) {
    float num = 1e-6F;

    System.out.println(Math.abs(num) < 1e-6F ?
        "This floating-point number is equal to zero" :
        "This floating-point number is not equal to zero");
  }
}
