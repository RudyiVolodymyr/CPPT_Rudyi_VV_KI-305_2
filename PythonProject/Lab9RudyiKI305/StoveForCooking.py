from Type import Type
from Burner import Burner
from Button import Button

# клас аудіоплеєр
class StoveForCooking:
    # конструктор
    def __init__(self):
        self.__typeOfStoveForCooking = Type()
        self.__burnerOfStoveForCooking = Burner()
        self.__volumeUpButton = Button()
        self.__volumeDownButton = Button()

    # метод змінює колір корпусу плити
    def repaintStoveForCooking(self, uColor):
        self.__typeOfStoveForCooking.setColor(uColor)
        print("New color of stove for cooking is " + uColor + ".")

    # метод змінює колір корпусу плити
    def resizeStoveForCooking(self, uLength, uWidth, uHeight):
        self.__typeOfStoveForCooking.setSize(uLength, uWidth, uHeight)
        print("New size of stove for cooking is " + uLength + "x" + uWidth + "x" + uHeight + " .")


    # метод повертає повну інформацію про зовнішній вигляд плити
    def getInfoLook(self):
        print("Size of stove for cooking: " + str(self.__typeOfStoveForCooking.getSize()) + " m^2.")
        print("Weight of stove for cooking: " + str(self.__typeOfStoveForCooking.getWeight()) + " kg.")
        print("Color of stove for cooking: " + str(self.__typeOfStoveForCooking.getColor()) + ".")

    # метод повертає площу, яку займають комфорка на плиті
    def getBurnerArea(self):
        print("Burner occupy " + str(self.__burnerOfStoveForCooking.getArea() * 2) + " cm^2 of size.")

    # метод виводить ресурс кнопки збільшення потужності
    def powerUpButtonResource(self):
        print("You can tap the power up button " + str(self.__volumeUpButton.getResource()) + " more times.")

    # метод виводить ресурс кнопки зменшення потужності
    def powerDownButtonResource(self):
        print("You can tap the power down button " + str(self.__volumeDownButton.getResource()) + " more times.")

    # метод симулює натискання на кнопку збільшення потужності
    def volumeUp(self):
        self.__volumeUpButton.clickButton(True)
        print("You tap the power up button.")
        if self.__burnerOfStoveForCooking.getPower() > 100:
            self.__burnerOfStoveForCooking.getPower(100)

    # метод симулює натискання на кнопку зменшення потужності
    def volumeDown(self):
        self.__volumeDownButton.clickButton(False)
        print("You tap the power down button.")
        if self.__burnerOfStoveForCooking.getPower() < 0:
            self.__burnerOfStoveForCooking.getPower(0)

    # метод симулює затискання кнопки зменшення потужності
    def volumeMin(self):
        self.__volumeDownButton.clickButton(False)
        print("You press the power down button.")
        self.__burnerOfStoveForCooking.setPower(0)

    # метод симулює затискання кнопки збільшення потужності
    def volumeMax(self):
        self.__volumeUpButton.clickButton(True)
        print("You press the power up button.")
        self.__burnerOfStoveForCooking.setPower(100)
