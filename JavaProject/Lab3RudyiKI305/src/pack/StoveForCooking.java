package pack;

import java.io.*;


/**
 * Class <code>StoveForCooking</code> implements stove for cooking
 */
abstract class StoveForCooking {
    protected Type TypeOfStoveForCooking;
    protected Burner BurnerOfStoveForCooking;
    protected Button PowerUpButton;
    protected Button PowerDownButton;
    protected PrintWriter fout;
    //static int power;

    /**
     * Method change color of stove for cooking
     */
    public void repaintStoveForCooking(String uCollor) {
        TypeOfStoveForCooking.setColor(uCollor);
        System.out.println("New color of a stove for cooking is " + uCollor + ".");
        fout.println("New color of stove for cooking is " + uCollor + ".");
        fout.flush();
    }

    /**
     * Method change color of stove for cooking
     */
    public void resizeStoveForCooking(double uLength, double uWidth, double uHeight) {
        TypeOfStoveForCooking.setSize(uLength, uWidth, uHeight);
        System.out.println("New size of stove for cooking is " + uLength + "x" + uWidth + "x" + uHeight + " m.");
        fout.println("New size of stove for cooking is " + uLength + "x" + uWidth + "x" + uHeight + " .");
        fout.flush();
    }

    abstract void getInfoLook(); 

    /**
     * Method provides information about the area of burner
     */
    public void getBurnerArea() {
        System.out.println("Burner occupy " + BurnerOfStoveForCooking.getArea() + " cm^2 of size.");
        fout.println("Burner occupy " + BurnerOfStoveForCooking.getArea() + " cm^2 of size.");
        fout.flush();
    }

    /**
     * Method provides information about the count of clicks of power up button
     */
    public void PowerUpButtonResource() {
        System.out.println("You can tap the power up button " + PowerUpButton.getResource() + " more times.");
        fout.println("You can tap the power up button " + PowerUpButton.getResource() + " more times.");
        fout.flush();
    }

    /**
     * Method provides information about the count of clicks of power down button
     */
    public void PowerDownButtonResource() {
        System.out.println("You can tap the power down button " + PowerDownButton.getResource() + " more times.");
        fout.println("You can tap the power down button " + PowerDownButton.getResource() + " more times.");
        fout.flush();
    }

    /**
     * Method simulate the power up button tap
     */
    public void powerUp() {
        PowerUpButton.clickButton(true);
        System.out.println("You tap the power up button.");
        fout.println("You tap the power up button.");
        fout.flush();

        if (BurnerOfStoveForCooking.getPower() > 100) {
            BurnerOfStoveForCooking.setPower(100);
        }
    }

    /**
     * Method simulate the power up button tap
     */
    public void powerDown() {
        PowerDownButton.clickButton(false);
        System.out.println("You tap the power down button.");
        fout.println("You tap the power down button.");
        fout.flush();

        if (BurnerOfStoveForCooking.getPower() < 0) {
            BurnerOfStoveForCooking.setPower(0);
        }
    }

    /**
     * Method simulate the power down button press
     */
    public void powerMin() {
        PowerDownButton.clickButton(false);
        System.out.println("You press the power down button.");
        fout.println("You press the power down button.");
        fout.flush();
        BurnerOfStoveForCooking.setPower(0);
    }

    /**
     * Method simulate the power up button press
     */
    public void powerMax() {
        PowerUpButton.clickButton(false);
        System.out.println("You press the power up button.");
        fout.println("You press the power up button.");
        fout.flush();
        BurnerOfStoveForCooking.setPower(100);
    }
}

/**
 * Class <code>Type</code> implements type of stove for cooking
 * 
 * @author Rudyi Volodymyr
 * @version 1.0
 */
class Type {
    private String color;
    private double length, width, height;

    /**
     * Constructor
     */
    public Type() {
        color = "White";
        length = 0.5;
        width = 0.6;
        height = 0.8;
    }

    /**
     * Method sets new color of type of stove for cooking
     * 
     * @param <code>newColor</code> The color value
     */
    public void setColor(String newColor) {
        color = newColor;
    }

    /**
     * Method sets new size of type of stove for cooking
     * 
     * @param <code>newSize</code> The Size value
     */
    public void setSize(double newLength, double newWidth, double newHeight) {
        length = newLength;
        width = newWidth;
        height = newHeight;
    }

    /**
     * Method gets color of type of stove for cooking
     */
    public String getColor() {
        return color;
    }

    /**
     * Method gets size of type of stove for cooking in m^2
     */
    public double getSize() {
        return length * width;
    }

    /**
     * Method gets weight of type of stove for cooking in kilograms
     */
    public double getWeight() {
        return length * width * height * 166.6;
    }
}

/**
 * Class <code>Burner</code> implements burner of stove for cooking
 * 
 * @author Rudyi Volodymyr
 * @version 1.0
 */
class Burner {
    private double diametr, power;

    /**
     * Constructor
     */
    public Burner() {
        diametr = 15;
        power = 50;
    }

    /**
     * Constructor
     * 
     * @param <code>uLoudness</code> The power value
     */
    public Burner(int uLoudness) {
        diametr = 15;
        power = uLoudness;
    }

    /**
     * Method gets area of dynamics of stove for cooking in cm^2
     */
    public double getArea() {
        return 3.14 * (diametr / 2) * (diametr / 2);
    }

    /**
     * Method returns resource of button
     * 
     */
    public double getPower() {
        return power;
    }

    /**
     * Method sets new power of burner of stove for cooking
     * 
     * @param <code>newPower</code> The power value
     */
    public void setPower(double newPower) {
        if (newPower < 0 || newPower > 100) {
            System.out.println("Incorrectly specified power!");
        } else {
            power = newPower;
        }
    }
}

/**
 * Class <code>Button</code> implements buttons of stove for cooking
 * 
 * @author Rudyi Volodymyr
 * @version 1.0
 */
class Button {
    // Button clicks resource
    private int btnResource, count;

    /**
     * Constructor
     */
    public Button() {
        btnResource = 999999999;
        count = 0;
    }

    /**
     * Constructor
     * 
     * @param <code>res</code> Button clicks resource
     */
    public Button(int res) {
        btnResource = res;
        count = 0;
    }

    /**
     * Method simulates Button clicking
     */
    public void clickButton(boolean type) {
        if (type) {
            btnResource--;
            count++;
        } else {
            btnResource--;
            count--;
        }
    }

    /**
     * Method returns resource of button
     * 
     */
    public int getResource() {
        return btnResource;
    }

    /**
     * Method returns how many times the user clicked on the button at one time
     * 
     * @return Button clicks
     */
    public int getCountClicks() {
        return count;
    }

}
