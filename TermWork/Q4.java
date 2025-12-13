import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int size = scanner.nextInt();
        
        try {
            if (size <= 2 || size >= 10) {
                throw new IllegalArgumentException("Value must be greater than 2 and less than 10");
            }

            int[][] matrix = new int[size][size];
            System.out.println("Enter the matrix elements:");
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    matrix[row][col] = scanner.nextInt();
                }
            }

            System.out.println("The original matrix is:");
            printMatrix(matrix);

            // Transpose the matrix
            for (int row = 0; row < size; row++) {
                for (int col = row; col < size; col++) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
            }

            // Reverse each row
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size / 2; col++) {
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[row][size - 1 - col];
                    matrix[row][size - 1 - col] = temp;
                }
            }

            System.out.println("The matrix after rotating is:");
            printMatrix(matrix);

            int cornerSum = matrix[0][0] + matrix[size - 1][0] + matrix[0][size - 1] + matrix[size - 1][size - 1];
            System.out.println("Sum of the corner elements = " + cornerSum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
