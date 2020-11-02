package edu.csc413.statement;

import edu.csc413.expression.Expression;
import edu.csc413.expression.VariableExpression;
import edu.csc413.interpreter.ProgramState;

public class AssignStatement extends Statement{
    private final String variableName;
    private final Expression expression;

    public AssignStatement(String variableName, Expression expression){
        if (!variableName.matches(VariableExpression.VARIABLE_NAME_PATTERN.pattern())) {
            throw new RuntimeException("Invalid variable name provided: " + variableName);
        }
        this.variableName = variableName;
        this.expression = expression;
    }

    @Override
    public void run(ProgramState programState){
        int value = expression.evaluate(programState);
        programState.setVariable(variableName, value);
    }
}
