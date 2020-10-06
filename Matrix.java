package com.example.java;

import java.util.Scanner;

public class Matrix{
    private static Scanner s = new Scanner(System.in);     //for user input.
    private static int i, j, k;                       //looping variable define upper becoz of that low variable creation.
    private static int row,col;
    private static int matrixA[][], matrixB[][], answer[][];   //null matrix.
    private static String rerun;                     //for rerun the program.
    private static String rerunelement;
    private static String reenter;

    private static void userinput(String name, int matrix[][]) {                //this function for user input on both the matrixA and matrixB.
        k=1;
        System.out.println("Enter the matrix" + name + " elements. ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print("Enter the " + k + " element : ");
                matrix[i][j] = s.nextInt();
                k++;
            }
            System.out.println();
        }
    }

    private static void printtt(String name, int matrix[][]) {
        int i, j;
        System.out.println("Matrix" + name + " is : ");
        for (i = 0; i < row; i++) {                                       //this For loop print original matrix.
            for (j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static void transpose(String name, int matrix[][]) {      //for transpose matrix.
        printtt(name,matrix);
        System.out.println("Transpose matrix" + name + " : ");        //then transpose matrix.
        for (i = 0; i < col; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(matrix[j][i] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        do{
            do{
                System.out.print("Enter the row of matrix : ");
                row = s.nextInt();
                System.out.print("Enter the column of matrix : ");
                col = s.nextInt();
                matrixA = new int[row][col];
                matrixB = new int[row][col];
                answer = new int[row][col];
                userinput("A", matrixA);                      //user input in matrixA.
                userinput("B", matrixB);                      //user input in matrixB.
                printtt("A",matrixA);
                printtt("B",matrixB);

                System.out.print("Do you want to reEnter the element (Y/N) : ");
                reenter = s.next();
            }while(reenter.equals("Y")||reenter.equals("y"));
            do {
                System.out.println("1.addition of two matrix.");
                System.out.println("2.subtraction of two matrix.");
                System.out.println("3.Transpose of two matrix.");
                System.out.print("Enter your choice : ");
                int choice = s.nextInt();                                //user choice 1,2 and 3.

                switch (choice) {
                    case 1:
                        printtt("A",matrixA);
                        printtt("B",matrixB);
                        System.out.println();
                        System.out.println("Addition of matrixA and matrixB : ");
                        for (i = 0; i < row; i++) {
                            for (j = 0; j < col; j++) {
                                answer[i][j] = matrixA[i][j] + matrixB[i][j];         //addition of 2 matrix.
                                System.out.print(answer[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        printtt("A",matrixA);
                        printtt("B",matrixB);
                        System.out.println();
                        System.out.println("Subtraction of matrixA and matrixB : ");
                        for (i = 0; i < row; i++) {
                            for (j = 0; j < col; j++) {
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
                System.out.print("Do you want to continue for check rest of option (Y/N) : ");
                rerun = s.next();
            } while (rerun.equals("y") || rerun.equals("Y"));
            System.out.print("Do you want to rerun all-over program (Y/N) : ");
            rerunelement = s.next();
        }while (rerunelement.equals("y")||rerunelement.equals("Y"));
    }
}
