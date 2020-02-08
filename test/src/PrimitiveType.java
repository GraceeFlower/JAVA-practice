public class PrimitiveType {
  public static void main(String[] args) {
    byte num1 = 111;
    System.out.println("byte: " + num1);

    short num2 = 11111;
    System.out.println("short: " + num2);

    int num3 = 11111111;
    System.out.println("int: " + num3);

    long num4 = 11111111111l;
    System.out.println("long: " + num4);

    float num5 = 1.2e10f;
    System.out.println("float: " + num5);

    double num6 = 1.2e20d;
    System.out.println("double: " + num6);

    boolean status = true;
    System.out.println("boolean: " + status);

    char character = '福';
    System.out.println("char: " + character);

    String str = "   Be healthy, WuHan, China!   ";
    System.out.println("string: " + str);
    System.out.println("string.length: " + str.length());
    System.out.println("string.indexOf('e'): " + str.indexOf("e"));
    System.out.println("string.indexOf('e', 6): " + str.indexOf("e", 6));
    System.out.println("string.charAt(4): " + str.charAt(4));
    // charAt will print out the sub-string at the given index
    System.out.println("string.startsWith('B'): " + str.startsWith("B"));
    System.out.println("string.startsWith('h', 6): " + str.startsWith("h", 6));
    System.out.println("string.endsWith('!'): " + str.endsWith("!"));
    System.out.println("string.endsWith(' '): " + str.endsWith(" "));
    System.out.println("string.subString(6, 13): " + str.substring(6, 13));
    System.out.println("string.trim: " + str.trim());

    int a = 3;
    int b = 4;
    b++;
    System.out.println(b);
    int result = b*12+(b--)+a*(b--);
    System.out.println(b);
    System.out.println(result);

    int i = 10;
    int n = ++i%5;
    System.out.println(i);
    System.out.println(n);
  }
}
