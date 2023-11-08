from StoveForCooking import StoveForCooking

# клас диктофон
class GasStove(StoveForCooking):
    # конструктор
    def __init__(self):
        super().__init__()
        self.__connectingTheCylinder = True
        self.__amountOfGas = 30

    # метод симулює розігрів плити
    def stoveHeating(self):
        print("The stove is heating up.")

    # метод додає газу у балон
    def addGas(self, additionalGas):
        self.__amountOfGas += additionalGas

    # метод симулює процес роботи плити
    def stoveWorking(self):
        if self.__connectingTheCylinder:
            print("The stove is working.")
        else:
            print("The stove is NOT working.")
        self.__amountOfGas -= 5

    # метод повертає кількість газу в балоні
    def getGas(self):
        print("Amount of gas in the cylinder: " + str(self.__amountOfGas) + " L.")