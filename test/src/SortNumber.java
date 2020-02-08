import java.util.Arrays;
import java.util.Scanner;

public class SortNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入任意三个整数 x, y, z(eg: 1 2 3 回车结束)：");

    int x = scanner.nextInt();
    int y = scanner.nextInt();
    int z = scanner.nextInt();

    scanner.close();

    int[] array = new int[]{x, y, z};
    Arrays.sort(array);
    System.out.println("从小到大排序为：" + array[0] + " " + array[1] + " " + array[2]);
  }
}

