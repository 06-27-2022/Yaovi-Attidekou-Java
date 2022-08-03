import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X = in.nextInt();
        int Y = in.nextInt();

        int yMin = 0;
        int yMax = H;
        int xMin = 0;
        int xMax = W;
    

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            
            
            switch(bombDir){
                case "U":
                yMax = Y - 1;

                break;

                case "UR":
               yMax = Y - 1;
               xMin = X + 1;
                break;

                case "R":
                xMin = X + 1;
    
                break;

                case "DR":
                yMin = Y + 1;
                xMin = X + 1;
               
                break;

                case "D":
            
                yMin = Y + 1;
                
                break;


                case "DL":
                yMin = Y + 1;
                xMax = X - 1;
                break;

                case "L":
               
                xMax = X - 1;
               
                break;

                case "UL":
                yMax = Y - 1;
                xMax = X - 1;
                break;

                
            }

            X = ((xMin + xMax) / 2);
            Y = ((yMin + yMax) / 2);
             

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // the location of the next window Batman should jump to.
            System.out.println(X+" " +Y);

        }

    }
}