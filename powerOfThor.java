import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        int xDifference = lightX - initialTx;
        int yDifference = lightY - initialTy;
        int actualPositionX = initialTx;
        int actualPositionY = initialTy;
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            xDifference = lightX - actualPositionX;
            yDifference = lightY - actualPositionY;

            if(xDifference == 0 && yDifference < 0) {System.out.println("N"); actualPositionY++;}
            else if(xDifference == 0 && yDifference > 0) {System.out.println("S"); actualPositionY--;}
            else if(xDifference > 0 && yDifference == 0) {System.out.println("E"); actualPositionX--;}
            else if(xDifference < 0 && yDifference == 0) {System.out.println("W"); actualPositionX++;}
            else if(xDifference > 0 && yDifference > 0) {System.out.println("SE"); actualPositionX++; actualPositionY++;}
            else if(xDifference > 0 && yDifference < 0) {System.out.println("NE"); actualPositionX++; actualPositionY--;}
            else if(xDifference < 0 && yDifference > 0) {System.out.println("SW"); actualPositionX--; actualPositionY++;}
            else {System.out.println("NW"); actualPositionX--; actualPositionY--;}


        }
    }
}