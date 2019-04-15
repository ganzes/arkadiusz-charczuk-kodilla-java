package com.kodilla.stream.lambda;

public class ExpressionExecutor {
    // metoda executeExpression(double a, double b, MathExpression mathExpression)
    // przyjmuje dwa argumenty a oraz b, a także kod do wykonania na tych argumentach
    // w postaci argumentu mathExpression.
    public void executeExpression(double a, double b, MathExpression mathExpression) {
        double result = mathExpression.calculateExpression(a, b);
        System.out.println("Result equals: " + result);
    }
}