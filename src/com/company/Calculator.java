package com.company;

public class Calculator implements OperandCalc {
    private int result = 0;
    private Throwable e;

    @Override
    public int calcwithoperand(int a, char operand, int b) {
        try {
            switch (operand) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a - b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                default:
                    System.err.println("нет нужного операнда");
                    throw new SpecificCalcExeption();
            }
        } catch (ArithmeticException | SpecificCalcExeption e) {
            System.err.println("Арифметическое исключение:" + e.toString());
        }
        return result;
    }
}
