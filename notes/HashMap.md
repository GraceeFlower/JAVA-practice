#### HashMap
***
- example：
    ```
    HashMap<String , Double> map = new HashMap<String , Double>();   
    map.put("Chinese" , 80.0);   
    map.put("Math" , 89.0);   
    map.put("English" , 78.2);
    ```
    当你存储 "Chinese" 的时候，系统会将其 `hashCode()` 的结果来判断该元素的存储位置。
    Additional：内部接口 `Map.Entry`
    每一个该接口都是一个键值对，是按照 key 值来决定每个 Entry 的存储位置的，value 也会随之存储。
    Map/hashMap 都是 ok 的，回去重，好像有个叫做，哈希冲突的东西，但是一般是用的 hashMap。
    
 - function： 
    1. 存放键值对 `Map.put(key, value)`;
    2. 键中是否包含这个数据：`Map.containsKey(key)`;
    3. 通过键拿值：`Map.get(key)`;
    4. 判空：`Map.isEmpty()`;
    5. get 长度：`Map.size()`;
    6. 从键值中删除：`Map.remove()`;
    7. 清楚：`Map.clear()`;
    8. 遍历 Map 的 key & value：
        ```
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        for (String values : map.values()) {
		    System.out.println(values);
		}
        // or
		for (Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "," + value);
		}
        ```
        
    **Attention**: you can not remove item in map when you use the iterator of map!
    
    ```
    for(Entry<String,String> entry : map.entrySet()) {
        if(!entry.getValue().equals("1")){
            map.remove(entry.getKey());
        }
    }
    ```
    
    **If you have to**, write in this way:  
    
    ```
    List<String> removeKeys = new ArrayList<String>();
	for (Entry<String, String> entry : map.entrySet()) {
	    if (!entry.getValue().equals("1")) {
	        removeKeys.add(entry.getKey());
	    }
	}
	for (String removeKey : removeKeys) {
	    map.remove(removeKey);
	}
	for (Entry<String, String> entry : map.entrySet()) {
        String key = entry.getKey();
	    String value = entry.getValue();
	    System.out.println(key + "," + value);
	}
    ```
    
    不能在遍历的时候直接删除哦～要存储在另一个引用类型，例如 ArrayList 里，再去遍历删除。
    
    这个是我们上课的那个例子～这里重写一下：
    
    ```
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
    ```
