public class m4_1 {
  public static void main (String []args) {
    System.out.println("九九を始めます");
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j + " ");
      }
      System.out.println("");
    }
  }
}