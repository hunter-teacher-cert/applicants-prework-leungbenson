// Pre-Work 7 - Arrays

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;

public class Array{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    char run = 'y';
    while(run == 'y')
    {
    Exercise();
    System.out.print("Would you like to run the program again? <y/n>");
    run = in.nextLine().charAt(0);
    }
  }
  
  public static void Exercise(){
    Scanner in = new Scanner(System.in);
    System.out.println("Choose either to run Exercise 1,4, or 5: ");
    int choice = in.nextInt();
    if (choice == 1) {
      Exercise1();}
    else if (choice == 4) {
      Exercise4();}
    else if (choice == 5) {
      Exercise5();}
    else {
      System.out.println("You have made an invalid choice.");
      Exercise();
    }
  }
  
  //Exercise 1   The goal of this exercise is to practice encapsulation with some of the examples in this chapter.
  public static void Exercise1() {
    System.out.println("Exercise 1");  
    double[] numbers = {1.3, 6.4, 7.8, 10.4}; 
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(powArray(numbers)));
    int numValues = 8;
    int[] ranNum = randomArray(numValues);
    System.out.println(Arrays.toString(ranNum));
  }
  
  public static double[] powArray(double[] a){
    System.out.println("What power would you like to raise your array to: ");
    Scanner in = new Scanner(System.in);
    int x = in.nextInt();
    for (int i = 0; i < a.length; i++) {
    a[i] = Math.pow(a[i], x);
    }
    return a;
  }
  /*
  public static int[] histogram(int[] b){
    
    
    int[] counts = new int[100];
    for (int score : scores) {
      counts[score]++;
    }
  }
  */
  
  
public static int[] randomArray(int size) {
    Random random = new Random();
    int[] a = new int[size];
    for (int i = 0; i < a.length; i++) {
        a[i] = random.nextInt(100);
    }
    return a;
}
  
  public static void Exercise4() {
    System.out.println("Exercise 4");
    
  }
  public static void Exercise5() {
    System.out.println("Exercise 5");
    
  }
  
}