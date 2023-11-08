package pack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

interface Heating {
    void stoveHeating();
}

/**
 * Class <code>GasStove</code> implements gas stove
 */
public class GasStove extends StoveForCooking implements Heating {
     /**
     * Constructor
     * 
     * @throws FileNotFoundException
     */ 
    private boolean ConnectingTheCylinder;
    private int amountOfGas;
    
    public GasStove() throws FileNotFoundException {
        TypeOfStoveForCooking = new Type();
        BurnerOfStoveForCooking = new Burner();
        PowerUpButton = new Button();
        PowerDownButton = new Button();

        ConnectingTheCylinder = true;
        amountOfGas = 30;
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Constructor
     * 
     * @param <code>resource</code> Button clicks resource
     * @throws FileNotFoundException
     */
    public GasStove(int resource, int uAmountOfGas) throws FileNotFoundException {
        TypeOfStoveForCooking = new Type();
        BurnerOfStoveForCooking = new Burner();
        PowerUpButton = new Button(resource);
        PowerDownButton = new Button(resource);

        ConnectingTheCylinder = true;
        amountOfGas = uAmountOfGas;
        fout = new PrintWriter(new File("Log.txt"));
    }

    /**
     * Method provides information about the appearance of the gas stove
     */
    public void getInfoLook() {
        System.out.println("Size of stove for cooking: " + TypeOfStoveForCooking.getSize() + " m^2.");
        System.out.println("Weight of stove for cooking: " + TypeOfStoveForCooking.getWeight() + " kg.");
        System.out.println("Color of stove for cooking: " + TypeOfStoveForCooking.getColor() + "."); 
        System.out.println("The amount of gas in the cylinder: " + amountOfGas + " L.");
        fout.println("Size of stove for cooking: " + TypeOfStoveForCooking.getSize() + " m^2.");
        fout.println("Weight of stove for cooking: " + TypeOfStoveForCooking.getWeight() + " kg.");
        fout.println("Color of stove for cooking: " + TypeOfStoveForCooking.getColor() + ".");
        fout.println("The amount of gas in the cylinder: " + amountOfGas + " L.");
        fout.flush();
    }


    /**
     * Method of modeling the stove operation
     */
    public void stoveHeating() {
        System.out.println("The stove is heating up.");
        fout.println("The stove is heating up.");
        fout.flush();
    } 
    


    /**
     * Method change the amount of gas
     * 
     * @param <code>additionalGas</code> The value of the amount of gas
     */
    public void addGas(int additionalGas) {
        amountOfGas += additionalGas;
    }

    /**
     * Method how the stove works
     */
    public void stoveWorking(int time) {
        if (ConnectingTheCylinder) {
            System.out.println("The stove is working " + time +" min.");
            fout.println("The stove is working " + time +" min.");
        } else {
            System.out.println("The stove is NOT working.");
            fout.println("The stove is NOT working.");
        }
        amountOfGas -= (time/10);
        fout.flush();
    }

    /**
     * Method print amount of gas
     */
    public void getGas() {
        System.out.println("Amount of gas in the cylinder: " + amountOfGas + " L.");
        fout.println("Amount of gas in the cylinder: " + amountOfGas + " L.");
        fout.flush();
    }

}
