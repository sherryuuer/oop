# calculator pj
class Operation(object):

    __numberA = 0
    __numberB = 0

    def get_numberA(self):
        return self.__numberA

    def set_numberA(self, numberA):
        self.__numberA = numberA

    def get_numberB(self):
        return self.__numberB

    def set_numberB(self, numberB):
        self.__numberB = numberB

    def get_result():
        return 0

    numberA = property(get_numberA, set_numberA)
    numberB = property(get_numberB, set_numberB)


class OperationAdd(Operation):
    def get_result(self):
        return self.numberA + self.numberB


class OperationSub(Operation):
    def get_result(self):
        return self.numberA - self.numberB


class OperationMul(Operation):
    def get_result(self):
        return self.numberA * self.numberB


class OperationDiv(Operation):
    def get_result(self):
        if self.numberB == 0:
            raise Exception("Can not be divided by 0!")
        return self.numberA / self.numberB


class OperationFactory(object):
    def createOperate(self, operate):
        if operate == "+":
            self.oper = OperationAdd()
        elif operate == "-":
            self.oper = OperationSub()
        elif operate == "*":
            self.oper = OperationMul()
        elif operate == "/":
            self.oper = OperationDiv()
        return self.oper


if __name__ == "__main__":
    oper = OperationFactory().createOperate("*")
    oper.numberA = 1
    oper.numberB = 2
    print(oper.get_result())
