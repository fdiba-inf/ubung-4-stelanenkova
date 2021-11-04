package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOutput {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter size: ");
    int size = input.nextInt();

    int[] numbers = new int[size];

    System.out.println("Enter numbers: ");
    for (int i = 0; i < size; i++) {
      numbers[i] = input.nextInt();
    }
    for (int i = 0; i < size; i++) {
      for (int x = 0; x < i; x++) {
        System.out.print(" ");
      }
      System.out.println(numbers[i]); 
    } 
  }
}