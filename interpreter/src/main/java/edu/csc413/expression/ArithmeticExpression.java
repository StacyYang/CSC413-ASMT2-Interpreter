package edu.csc413.expression;

import edu.csc413.interpreter.ProgramState;

/** An Expression representing the combination of two smaller expressions, combined with an arithmetic operator. */
public class ArithmeticExpression extends Expression {
    /** The various operators that can be used to combine smaller expressions into an ArithmeticOperator. */
    public enum Operator {
        ADD("+", 1),
        SUBTRACT("-", 1),
        MULTIPLY("*", 2),
        DIVIDE("/", 2),
        REMAINDER("%", 2),
        POWER("^", 3);

        private final String symbol;
        private final int precedence;

        Operator(String symbol, int precedence) {
            this.symbol = symbol;
            this.precedence = precedence;
        }

        String getSymbol() {
            return symbol;
        }

        int getPrecedence() {
            return precedence;
        }
    }

    private final Operator operator;
    private final Expression lhs;
    private final Expression rhs;

    public ArithmeticExpression(Operator operator, Expression lhs, Expression rhs){
        this.operator = operator;
        this.lhs = lhs;
        this.rhs = rhs;
    }


    @Override
    public int evaluate(ProgramState programState) {
        // TODO: Implement.
        int lhsValue = lhs.evaluate(programState);
        int rhsValue = rhs.evaluate(programState);

        return switch (operator) {
            case ADD -> lhsValue + rhsValue;
            case SUBTRACT -> lhsValue - rhsValue;
            case MULTIPLY -> lhsValue * rhsValue;
            case DIVIDE -> lhsValue / rhsValue;
            case REMAINDER -> lhsValue % rhsValue;
            case POWER -> power(lhsValue, rhsValue);
        };
    }

    private static int power(int base, int exponent){
        if(exponent < 0){
            return 0;
        }
        int result = 1;
        for(int i = 0; i < exponent; i++){
            result*= base;
        }
        return result;
    }
}
