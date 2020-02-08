1. 无限循环
  ```
  for (;;) {}
  // or
  while (true) {}
  ```
2. break & continue  
break 会直接跳出循环，continue 只是不执行本次循环下面的语句了，接下来的循环还会继续进行。
  ```
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
  //output:
  // 012
  // 0124
  ```
3. 考虑代码输出结果。
   - 应该输出：  

     > second string  
    third string  
    
    因为 `else` 会寻找离自己最近的那个 `if`，也就是判断 `aNumber` 是否为零的 if 语句，所以会执行 else 语句的内容。

  - 修改为：  
 
  ```
  int aNumber = 3;
  if (aNumber >= 0) {
    if (aNumber == 0) {
      System.out.println("first string");
    } else {
      System.out.println("second string");
    }
  }
  System.out.println("third string");
  ```

4. 
    