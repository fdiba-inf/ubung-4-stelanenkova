package exercise4;

import java.util.Arrays;
import java.util.Scanner;
public class MinIndex {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    double[] array = new double[size];
    double min = 10000;
    int ind = 0;

    for(int i = 0; i < size; i++) {
      array[i] = input.nextInt();
      if(min > array[i]) {
        min = array[i];
        ind = i;
      }
    }
    System.out.println("Min index: " + ind);
  }

}