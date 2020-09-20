package com.example.java;
import java.util.Scanner;

public class Matrix {
    private static Scanner s = new Scanner(System.in);     //for user input.
    private static int i, j,k;                       //looping variable define upper becoz of that low variable creation.
    private static int matrixA[][] = new int[3][3],matrixB[][] = new int[3][3],answer[][] = new int[3][3];   //null 3x3 matrix.
    private static String rerun;                     //for rerun the program.

    private static void userinput(String name, int matrix[][]){                //this function for user input on both the matrixA and matrixB.
        System.out.println("Enter the matrix"+name+" elements. ");
        for(i = 0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("Enter the "+k+" element : ");
                matrix[i][j] = s.nextInt();
                k +=1;
            }
            System.out.println();
        }
        System.out.println("matrix"+name+" is. ");               //this for loop for print the proper matrix.
        printt(matrix);
    }
    private static void printt(int matrix[][]){                 //printt function for only print matrix.
        for (i = 0;i<3;i++){                                       
            for (j=0;j<3;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void transpose(String name,int matrix[][]){      //transpose matrix.
        System.out.println("Original matrix"+name+" : ");
        printt(matrix);                                       //print original matrix using printt function.
        System.out.println();

        System.out.println("Transpose matrix"+name+" : ");        //then transpose matrix.
        for(i = 0;i<3;i++){
            for(j=0;j<3;j++){
                answer[i][j] = matrix[j][i];
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        do{
            k = 1;                                             //k is the number of element the always increase in the loop 
                                                                                //that why before loop we define k = 1. 
            userinput("A",matrixA);                      //user input in matrixA.
            k = 1;
            userinput("B",matrixB);                      //user input in matrixB.

            System.out.println("1.addition of two matrix.");
            System.out.println("2.subtraction of two matrix.");
            System.out.println("3.Transpose of two matrix.");
            System.out.print("Enter your choice : ");
            int choice = s.nextInt();                                //user choice 1,2 and 3.

            switch (choice) {
                case 1:
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 3; j++) {
                            answer[i][j] = matrixA[i][j] + matrixB[i][j];         //addition of 2 matrix.
                            System.out.print(answer[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 3; j++) {
                            answer[i][j] = matrixA[i][j]-matrixB[i][j];         //subtraction of 2 matrix.
                            System.out.print(answer[i][j]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    transpose("A",matrixA);                   //transpose of matrixA.
                    transpose("B",matrixB);                   //transpose of matrixB.
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.print("Do you want to continue (Y/N): ");
            rerun = s.next();                                     //ask user continue or not.
        }while (rerun.equals("y")||rerun.equals("Y"));            //then i use do while loop for rerun program a/c to user choice.
    }
}
