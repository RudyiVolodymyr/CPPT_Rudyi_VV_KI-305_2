import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * 
 * @author Rudyi Volodymyr
 * @version 1.0
 */
public class Lab4RudyiKI305 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try {
                try {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                } finally {
                    // Цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            } catch (CalcException ex) {
                // Блок перехоплює помилки обчислень виразу
                out.print(ex.getMessage());
            }
            in.close();
        } catch (FileNotFoundException ex) {
            // Блок перехоплює помилки роботи з файлом навіть якщо вони
            // виникли у блоці finally
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}




/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * 
 * @author Rudyi Volodymyr
 * @version 1.0
 */
class CalcException extends ArithmeticException {
    public CalcException() {
    }

    public CalcException(String cause) {
        super(cause);
    }
}





/**
 * Class <code>Equations</code> implements method for ctg(8x)/x
 * expression
 * calculation
 * 
 * @author Rudyi Volodymyr
 * @version 1.0
 */
class Equations {
    /**
     * Method calculates the ctg(8x)/x expression
     * 
     * @param <code>x</code> Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double y, rad, numPI = Math.PI;
        rad = (8 * x) * numPI / 180.0;
        try {
            y = 1 / Math.tan((8 * x) * numPI / 180.0) / x; 
            if (y == Double.NaN || y == Double.NEGATIVE_INFINITY ||
                    y == Double.POSITIVE_INFINITY || rad % numPI == 0)
                throw new ArithmeticException();
            
        } catch (ArithmeticException ex) {
            // створимо виключення вищого рівня з поясненням причини
            // виникнення помилки
            if (rad % numPI == 0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (x == 0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");       
        }
        return y;
    }
}