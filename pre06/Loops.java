// Pre-Work 6 - Loops

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Loops{
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
    System.out.println("Choose either to run Exercise 3,4, or 5: ");
    int choice = in.nextInt();
    if (choice == 3) {
      Exercise3();}
    else if (choice == 4) {
      Exercise4();}
    else if (choice == 5) {
      Exercise5();}
    else {
      System.out.println("You have made an invalid choice.");
      Exercise();
    }
  }
  
  //Exercise 3
  public static void Exercise3() {
    System.out.println("Exercise 3");
  }
  
  public static void Exercise4() {
    System.out.println("Exercise 4");
  }
  
  public static void Exercise5() {
    System.out.println("Exercise 5");
  }
}
  
    

    
    
    
 