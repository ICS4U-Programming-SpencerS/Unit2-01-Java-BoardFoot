package com.example;

import java.util.Scanner;

/**
 * BoardFoot Calculator.
 *
 * @author Spencer S.
 * @version 1.0
 * @since 2024-Mar-18
 */

public final class BoardFoot {
    /** Stops random instantiation from happening. */
    private BoardFoot() {
    // Prevents instantiation.
    }

    /**
    * Main Code base.
    *
    * @param args Command line arguments (not used).
    */

    // constant for volume
    final int VOLUME = 144;

    public float CalcLength(float widthFLT, float heightSTR) {
        /**
         * Function designed for calculations
        */

        // calculations for length
        final float Length = VOLUME / (widthFLT * heightSTR);

        // returns length to main
        return Length;
    }

    public static void main(final String[] args) {
        /**
         * Main function for input and output.
         */

        // gets set scanner for use
        final Scanner in = new Scanner(System.in);

        // opening statement and input message.
        System.out.print("Enter the width value(inches): ");
        final String widthSTR = in.nextLine();

        // try catch for width input
        try {
            final Float widthFLT = Float.parseFloat(widthSTR);

            // checks if input is less or zero
            if (widthFLT <= 0) {
                System.out.println("Width can't be 0 or a negative number!");

                // if input is ready, move to height input
            } else {
                // input statement for height
                System.out.print("Enter the height value(inches): ");
                final String heightSTR = in.nextLine();

                // try catch for height input
                try {
                    final Float heightFLT = Float.parseFloat(heightSTR);

                    // if height is 0 or less
                    if (heightFLT <= 0) {
                        System.out.println("Height can't be 0 or a negative number!");
                    } else {
                        // imports length from above function
                        BoardFoot boardFoot = new BoardFoot();
                        float length = boardFoot.CalcLength(widthFLT, heightFLT);

                        // displays length
                        System.out.println("The wood should be " + length + " inch(es) long");
                    }
                }
                // for invalid height inputs
                catch (NumberFormatException error) {
                    System.out.println("Invalid height inputted. Input must be a number greater than 0");
                }
            }
        }

        // for invalid width inputs
        catch (NumberFormatException error) {
            System.out.println("Invalid width inputted. Input must be a number greater than 0");
        }

        // Closing the scanner
        in.close();
    }
}
