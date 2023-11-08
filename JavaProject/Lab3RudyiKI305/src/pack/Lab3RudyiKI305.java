package pack;

import java.io.FileNotFoundException;

/**
 * Class App realize example program to lab work 3
 * 
 * @author Rudyi Volodymyr
 * @version 1.1
 * @since version 1.0
 */
public class Lab3RudyiKI305 {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        GasStove stove1 = new GasStove(23232232, 50);
        stove1.repaintStoveForCooking("Black");
        stove1.getInfoLook();
        stove1.getBurnerArea();
        stove1.powerMax();
        stove1.powerMin();
        stove1.stoveHeating();
        stove1.addGas(10);
        stove1.stoveWorking(25);
        stove1.getGas();
    }
}
