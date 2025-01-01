package src.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Map<String, Operation> operations = new HashMap<>();
        operations.put("+", new AddOperation());
        operations.put("-", new SubstactOpertion());
        operations.put("*", new MultiplyOperation());
        operations.put("/", new DivideOperation());
        operations.put("%", new RemainOperation());

        Calculator calculator = new Calculator(operations);

        double calculate = calculator.calculate("%", 2, 5);
        System.out.println(calculate);
    }


}
