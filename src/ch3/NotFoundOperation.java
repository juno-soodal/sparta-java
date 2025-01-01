package src.ch3;

public class NotFoundOperation implements Operation {
    public double operate(int firstNumber, int secondNumber) {
        throw new IllegalArgumentException("없는 연산자 입니다.");
    }
}
