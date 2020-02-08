class TestArray{
  public static void main(String args[]){
    int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
    System.out.println("Printing original array:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(arr[i][j] + " ");
      }
    }

    System.out.println("\nPrinting clone of the array:");
    int carr[][]=arr.clone();
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(carr[i][j] + " ");
      }
    }

    System.out.println("\nAre both equal?");
    System.out.println(arr==carr);

  }}