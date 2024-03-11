
import java.util.Scanner;

public class spiral {

    public static void printSprial(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startCol <= endRow && startCol <= endCol) {

            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {

                if (startRow == endRow) {
                    break;
                }

                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int rows = sc.nextInt();
        System.out.println("enter the number of colo");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        System.out.println("enter matrix element");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral order traversal:");
        printSprial(matrix);
        sc.close();
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the number of rows: ");
        // int rows = scanner.nextInt();

        // System.out.print("Enter the number of columns: ");
        // int cols = scanner.nextInt();

        // int matrix[][] = new int[rows][cols];

        // System.out.println("Enter the matrix elements:");

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // matrix[i][j] = scanner.nextInt();
        // }
        // }

        // System.out.println("Spiral order traversal:");
        // printSprial(matrix);

        // scanner.close();
    }
}