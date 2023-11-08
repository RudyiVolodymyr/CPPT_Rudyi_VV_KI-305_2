# клас корпус
class Type:
    #конструктор
    def __init__(self):
        self.__color = "White"
        self.__length = 0.5
        self.__width = 0.6
        self.__height = 0.8
    
    # метод встановлює колір корпусу
    def setColor(self, newColor):
        self.__color = newColor

    # метод повертає колір корпусу
    def getColor(self):
        return self.__color

    # метод встановлює розмір корпусу
    def setSize(self, newLength, newWidth, newHeight):
        self.__length = newLength
        self.__width = newWidth
        self.__height = newHeight

    # метод повертає розмір плити
    def getSize(self):
        return self.__length * self.__width

    # метод повертає вагу плити
    def getWeight(self):
        return self.__height * self.__length * self.__width * 166.6