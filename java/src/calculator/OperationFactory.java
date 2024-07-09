package calculator;

import calculator.operations.Operation;
import calculator.operations.OperationAdd;
import calculator.operations.OperationDiv;
import calculator.operations.OperationMul;
import calculator.operations.OperationSub;

public class OperationFactory {
    public static Operation createOperation(char operator) {
        Operation operation = null;

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
