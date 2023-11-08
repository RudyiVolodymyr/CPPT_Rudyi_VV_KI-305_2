# клас комфорка
class Burner:
    # конструктор
    def __init__(self):
        self.__diametr = 15
        self.__power = 50

    # метод повертає площу комфорки
    def getArea(self):
        return 3.14 * (self.__diametr / 2) * (self.__diametr / 2)

    # метод повертає потужність плити
    def getPower(self):
        return self.__power

    # метод втановлює потужності плити
    def setPower(self, newPower):
        if newPower < 0 or newPower > 100:
            return "Incorrectly specified power!"
        else:
            self.__power = newPower
