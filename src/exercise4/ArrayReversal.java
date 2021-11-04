package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReversal {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter size: ");
    int size = input.nextInt();
    char[] ch = new char[size];
    
    System.out.println("Enter symbols: ");

    for (int i = 0; i < size; i++) {
      ch[i] = input.next().charAt(0);
    }
    
    char[] rev = new char[size];
    int revIndex = 0;
    for (int i = size - 1; i >= 0; i--) {
      rev[revIndex] = ch[i];
      revIndex++;
    }
    String str = Arrays.toString(rev);
    System.out.println("Reversed symbols: " + str);
  }
}