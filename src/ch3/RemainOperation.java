package src.ch3;

public class RemainOperation implements Operation {
    @Override
    public double operate(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
