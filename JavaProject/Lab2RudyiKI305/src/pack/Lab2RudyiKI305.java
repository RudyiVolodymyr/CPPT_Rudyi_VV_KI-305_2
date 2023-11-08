package pack;

import java.io.FileNotFoundException;

/**
 * Class App realize example program to lab work 2
 * 
 * @author Rudyi Volodymyr
 * @version 1.1
 * @since version 1.0
 */
public class Lab2RudyiKI305 {
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws Exception {
        StoveForCooking stove1 = new StoveForCooking(23232232);

        stove1.getInfoLook();
        stove1.repaintStoveForCooking("Red");
        stove1.resizeStoveForCooking(0.6, 0.6, 0.8);
        stove1.getInfoLook();
        stove1.getBurnerArea();
        stove1.PowerUpButtonResource();
        for (int i = 0; i < 5; i++) {
            stove1.powerUp();
        }
        for (int i = 0; i < 4; i++) {
            stove1.powerDown();
        }
        stove1.PowerDownButtonResource();
        stove1.powreMin();
        stove1.powerMax();

    }
}
