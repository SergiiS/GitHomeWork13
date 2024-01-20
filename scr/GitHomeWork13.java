import java.util.Scanner;
public class GitHomeWork13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число рядків (М): ");
        int m = scanner.nextInt();

        System.out.print("Введіть число столбців (N): ");
        int n = scanner.nextInt();

        int[][] originalMatrix = createMatrix(m, n);

        System.out.println("Перша оригінальна матриця:");
        printMatrix(originalMatrix);

        int[][] transposedMatrix = transposeMatrix(originalMatrix);

        System.out.println("Друга транспонована матриця:");
        printMatrix(transposedMatrix);
            }
            public static int[][] createMatrix(int m, int n) {
                Scanner scanner = new Scanner(System.in);
                int[][] matrix = new int[m][n];

                System.out.println("Введіть елементи матриці: ");

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }

                return matrix;
            }

            public static int[][] transposeMatrix(int[][] originalMatrix) {
                int m = originalMatrix.length;
                int n = originalMatrix[0].length;

                int[][] transposedMatrix = new int[n][m];

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        transposedMatrix[j][i] = originalMatrix[i][j];
                    }
                }

                return transposedMatrix;
            }

            public static void printMatrix(int[][] matrix) {
                for (int[] row : matrix) {
                    for (int element : row) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                }
            }
        }