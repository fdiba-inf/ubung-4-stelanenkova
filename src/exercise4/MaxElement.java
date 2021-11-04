package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    double max = -9999;
    int lenght = input.nextInt();
    double array[] = new double[lenght];

    
    for (int i = 0; i < lenght; i++) {
      array[i] = input.nextInt();
      if (array[i] > max) {
        max = array[i];
      }
    }
    System.out.println("Max number: " + max);
  }
}