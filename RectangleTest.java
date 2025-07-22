import java.awt.Rectangle;
import java.util.Scanner;

/**
 * This program creates a rectangle using user-provided width and height,
 * then calculates and displays the rectangle's area.
 * 
 * Activity: ITSC1213_ProblemSolve19
 * Author: [Your Full Name]
 * UNC Charlotte ID: [Your ID Number]
 * UNC Charlotte Email: [YourEmail]@uncc.edu
 */

public class RectangleTest {
    public static void main(String[] args) {
        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user for width
        System.out.print("Enter width: ");
        int width = input.nextInt();

        // Prompt the user for height
        System.out.print("Enter height: ");
        int height = input.nextInt();

        // Create a rectangle using the user's input (starting at x=0, y=0)
        Rectangle box1 = new Rectangle(0, 0, width, height);

        // Display the rectangle object info
        System.out.println("box1: " + box1);

        // Calculate and display the area
        int area = width * height;
        System.out.println("Area of box1: " + area);
    }
}
