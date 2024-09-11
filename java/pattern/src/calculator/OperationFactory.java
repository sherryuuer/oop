package calculator;

public class OperationFactory {
    public static Operation createOperation(char operator) {
        Operation operation = null; // 多态，父类 - 子类

        switch (operator) {
            case '+':
                operation = new OperationAdd();
                break;
            case '-':
                operation = new OperationSub();
                break;
            case '*':
                operation = new OperationMul();
                break;
            case '/':
                operation = new OperationDiv();
                break;
        }

        return operation;
    }
}
