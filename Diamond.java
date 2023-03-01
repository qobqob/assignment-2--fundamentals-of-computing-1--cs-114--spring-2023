
import java.util.Scanner;


public class Diamond {
  public static void main(String [] args){
    int diamondSize;
    int column;
    int row;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter size of diamond:");
    diamondSize = in.nextInt(); // requests for user to enter diamond size

    if(diamondSize % 2 == 0){   //runs loop code when user enters an even number
      for(row=0; row <= diamondSize/2; row++)
        System.out.print("  ");
      System.out.println("*");

      column = 2;         //print out for second column

      while(column <= diamondSize){
        for(row=0; row<=(diamondSize/2 - column/2); row++)
          System.out.print("  ");
        for(row=0; row<column; row++)
          System.out.print(" *");
        System.out.println();
        column += 2;      // compound assignment operator to create the while loop
      }

      column -= 4;

      while(column > 1){
        for(row=0; row<=(diamondSize/2 - column/2); row++)
          System.out.print("  ");
        for(row=0; row<column; row++)
          System.out.print(" *");
        System.out.println();
        column -= 2;                  // retrieves column and adds two to it and assigns it to a new column number for a while loop      }
      }

      for(row=0; row <= diamondSize/2; row++)
        System.out.print("  ");
      System.out.println("*");

    }
    else{                              // runs loop for when number entered by user is odd
      for(row=0; row <= diamondSize/2; row++)
        System.out.print("  ");
      System.out.println("*");

      column = 3;

      while(column <= diamondSize){
        for(row=0; row<=(diamondSize/2 - column/2); row++)
          System.out.print("  ");
        for(row=0; row<column; row++)
          System.out.print("* ");
        System.out.println();
        column += 2;
      }

      column -= 4;
        while(column > 1){
          for(row=0; row<=(diamondSize/2 - column/2); row++)
            System.out.print("  ");
          for(row=0; row<column; row++)
            System.out.print("* ");
          System.out.println();
          column -= 2;
        }

        for(row=0; row <= diamondSize/2; row++)
          System.out.print("  ");
        System.out.println("*");
    }               // ends the loop for the diamond


  }
}
