import java.util.Scanner;

class TwoDArray_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements for 2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calculate sum
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += arr[i][j];
            }
        }

        // Output result
        System.out.println("Sum of all elements = " + sum);

        sc.close();
    }
}