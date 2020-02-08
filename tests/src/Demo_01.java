public class Demo_01 {
  public static void main(String[] args) {
    int lineNum = 5;
    int startNum = 5;
    for (int i = 0; i < lineNum; i++) {
      StringBuilder star = new StringBuilder();
      for (int j = 0; j < startNum * 2 - i - 1; j++) {
        star.append(j < startNum - i - 1 ? " " : "*");
      }
      System.out.println(star);
    }
  }
}
