/*
 * Review Lab 1
 * Description: prompt the user to give us one a number to print out a pyramid of stars (*).
 * Name: Mohammad Abdelrahman
 * ID: 920158652
 * Class: CSC 211-02
 * Semester: fall 2020
 */
import java.util.Scanner;
public class ReviewLab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //creat an objet input to store the user input
        int height = 0; // variable to store the user's input
        do { // keep prompting the user to enter a value that is greater than 1
            System.out.println("Enter the height of the pyramid (an integer greater than 1)");
            height = input.nextInt(); // store the user's input
        }
        while(height <= 1);
        printPyramid(height); // calling printPyramid method to print out the stars pyramid

    }

    public static void printPyramid(int height) {
        for (int i = 0; i < height; i++) { // outer loop to handle number of rows the height of pyramid
            for (int j = height - i; j > 1; j--) { // inner loop to print the spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { // inner loop to print the stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println(); // going to the next row of the pyramid
        }
    }
}
