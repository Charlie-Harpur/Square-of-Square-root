/*
 * Charlie Harpur
 * Shows inaccuracy of numbers
 * 11/9/2018
 */

package square.of.square.root;

import javax.swing.JOptionPane;

/**
 *
 * @author chhar9972
 */
public class SquareOfSquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        double squareRoot = Math.sqrt(number);
        double squared = Math.pow(squareRoot, 2);
        System.out.println("Square root: " + squareRoot + "\nSquared: " + squared + "\nInaccuracy: " + (squared - number));
    }
}
