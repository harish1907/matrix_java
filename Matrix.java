package com.example.java;

import java.util.Scanner;

public class copyMat {
    private static Scanner s = new Scanner(System.in);     //for user input.
    private static int i, j, k;                       //looping variable define upper becoz of that low variable creation.
    private static int rowc;
    private static int matrixA[][], matrixB[][], answer[][];   //null 3x3 matrix.
    private static String rerun;                     //for rerun the program.
    private static String rerunelement;

    private static void userinput(String name, int matrix[][]) {                //this function for user input on both the matrixA and matrixB.
        System.out.println("Enter the matrix" + name + " elements. ");
        for (i = 0; i < rowc; i++) {
            for (j = 0; j < rowc; j++) {
                System.out.print("Enter the " + k + " element : ");
                matrix[i][j] = s.nextInt();
                k += 1;
            }
            System.out.println();
        }
    }

    private static void printt(int matrix[][], String name) {
        System.out.println("matrix" + name + " is. ");               //this for loop for print the proper matrix.
        for (i = 0; i < rowc; i++) {                                       //this For loop print original matrix.
            for (j = 0; j < rowc; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void transpose(String name, int matrix[][]) {      //for transpose matrix.
        System.out.println("Original matrix" + name + " : ");
        printt(matrix, name);

        System.out.println("Transpose matrix" + name + " : ");        //then transpose matrix.
        for (i = 0; i < rowc; i++) {
            for (j = 0; j < rowc; j++) {
                answer[i][j] = matrix[j][i];
                System.out.print(answer[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("This program only for Square matrix.");
        
        do{
            System.out.print("Enter the row and column of matrix : ");
            rowc = s.nextInt();
            matrixA = new int[rowc][rowc];
            matrixB = new int[rowc][rowc];
            answer = new int[rowc][rowc];
            k = 1;                                             //k is the number of element the always increase in the loop that why before loop we define k = 1.
            userinput("A", matrixA);                      //user input in matrixA.
            k = 1;
            userinput("B", matrixB);                      //user input in matrixB.
            printt(matrixA, "A");
            printt(matrixB, "B");
            do {
                System.out.println("1.addition of two matrix.");
                System.out.println("2.subtraction of two matrix.");
                System.out.println("3.Transpose of two matrix.");
                System.out.print("Enter your choice : ");
                int choice = s.nextInt();                                //user choice 1,2 and 3.

                switch (choice) {
                    case 1:
                        System.out.println("Addition of matrixA and matrixB : ");
                        printt(matrixA,"A");
                        printt(matrixB,"B");
                        for (i = 0; i < rowc; i++) {
                            for (j = 0; j < rowc; j++) {
                                answer[i][j] = matrixA[i][j] + matrixB[i][j];         //addition of 2 matrix.
                                System.out.print(answer[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        System.out.println("Subtraction of matrixA and matrixB : ");
                        printt(matrixA,"A");
                        printt(matrixB,"B");
                        for (i = 0; i < rowc; i++) {
                            for (j = 0; j < rowc; j++) {
                                answer[i][j] = matrixA[i][j] - matrixB[i][j];         //subtraction of 2 matrix.
                                System.out.print(answer[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                        transpose("A", matrixA);                   //transpose of matrixA.
                        transpose("B", matrixB);                   //transpose of matrixB.
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.print("Do you want to continue (Y/N): ");
                rerun = s.next();
                System.out.print("Do you want to re enter the elements (Y/N): ");
                rerunelement = s.next();
            } while (rerun.equals("y") || rerun.equals("Y"));   
        }while (rerunelement.equals("y")||rerunelement.equals("Y"));
    }
}
