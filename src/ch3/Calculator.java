package src.ch3;

import java.util.Map;

public class Calculator {

    private final Map<String, Operation> operations;
    private final Operation notFoundOperation = new NotFoundOperation();

    public Calculator(Map<String, Operation> operations) {
        this.operations = operations;
    }


    public double calculate(String operator, int firstNumber, int secondNumber) {
        Operation operation = operations.getOrDefault(operator, notFoundOperation);
        return operation.operate(firstNumber,secondNumber);


    }
}
