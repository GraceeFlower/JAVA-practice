import java.util.HashMap;

public class Demo_04 {
  public static void main(String[] args) {
    String[] arr = {"a", "a", "b", "c", "b", "a", "d", "d", "d", "a"};
    HashMap<String, Integer> map = new HashMap<>();
    for (String i: arr) {
      Integer num = map.get(i);
      map.put(i, num == null ? 1 : num + 1);
      // Here we cannot use 'num++', because the value will be overwritten.
    }
    for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println(key + ":" + value);
    }
    // map.forEach((key, value) -> System.out.println(key + ":" + value));
    // Here comes the simple writing~
  }
}

