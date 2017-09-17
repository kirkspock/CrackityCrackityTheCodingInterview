// Ch. VI Example 1
// What is the runtime of the code below:

public class VI_Ex1 {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4}; // 1
    foo(nums); // 1
  }

  static void foo (int[] array) {
    int sum = 0; // 1
    int product = 1; // 1
    for (int i = 0; i < array.length; i++) { // n + 1
      sum += array[i];  // n
    }
    for (int i = 0; i < array.length; i++) { // n + 1
      product *= array[i]; // n
    }
    System.out.println(sum + ", " + product); // 1
  }

}

// 2(n + 1) + 2n + 5
// = 2n + 2 + 2n + 5
// = 4n + 7
// = O(n)
