import java.util.Arrays;
import java.util.Comparator;

public class Demo_03 {
  public static void main(String[] args) {
    String[] arr = {"22", "77", "11", "33", "55", "44", "66"};
    Arrays.sort(arr, Comparator.reverseOrder());
    // 逆序排列 但是不能是基本数据类型 必须是封装的 例如 Integer... T[]封装类型
    // 例如 int[] nums = {4, 1, 2, 3}
    // 就会报错 Integer 可以~
    String res = String.join("-", arr);
//    String result = arr[arr.length - 1];
//    for (int i = arr.length - 2; i >= 0; i--) {
//      result += "-" + arr[i];
//    }
//    System.out.println(result);
    System.out.println(res);
  }
}
