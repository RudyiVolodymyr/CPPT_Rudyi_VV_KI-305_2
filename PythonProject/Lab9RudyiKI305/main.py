from GasStove import GasStove

# основна програма
if __name__ == "__main__":
    # об'єкт на основі класу газова плита
    stove = GasStove()

    # використання методів класу за допомогою створеного об'єкта
    stove.repaintStoveForCooking("Red")
    stove.getInfoLook()
    stove.getBurnerArea()
    stove.powerUpButtonResource()
    stove.powerDownButtonResource()
    for i in range(5):
        stove.volumeUp()
    for i in range(3):
        stove.volumeDown()
    stove.volumeMax()
    stove.volumeMin()
    stove.stoveHeating()
    stove.addGas(110)
    stove.stoveWorking()
    stove.getGas()
