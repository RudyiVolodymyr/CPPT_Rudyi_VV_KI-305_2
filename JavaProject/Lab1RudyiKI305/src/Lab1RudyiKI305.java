import java.io.*;
import java.util.*;

/**
 * Class App realize example program to lab work №1
 * 
 * @author Rudyi Volodymyr
 * @version 1.1
 * @since version 1.0
 */
public class Lab1RudyiKI305 {
    /**
     * Static method main is enter point to program
     * 
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("TxtFiles\\MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введiть розмiр квадратної матрицi (не менше, нiж 3): ");
        nRows = in.nextInt();
        in.nextLine();
        if (nRows < 3) {
            System.out.println("Розмiр мартрицi менше, нiж 3!");
            System.exit(0);
        }

        arr = new char[nRows][];
        for (int i = 0, n = nRows; i < nRows && n > 0; i++) {
            arr[i] = new char[n];
            n -= 2;
        }

        System.out.print("\nВведiть символ-заповнювач: ");
        filler = in.nextLine();
        if (filler.length() != 1) {
            System.out.println("Ви повиннi були ввести лише один символ!");
            System.exit(0);
        }

        for (int i = 0, n = nRows; i < nRows && n > 0; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
            n -= 2;
        }

        for (int i = 0, n = nRows; i < nRows; i++) {
            for (int k = i; k > 0; k--) {
                System.out.print("  ");
                fout.print("  ");
            }
            if (n > 0)
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                }
            n -= 2;
            System.out.print("\n");
            fout.print("\n");
        }

        fout.flush();
        fout.close();
        in.close();
    }
}