package edu.csc413.expression;

import edu.csc413.interpreter.ProgramState;

import java.util.regex.Pattern;

public class VariableExpression extends Expression{
    public static final Pattern VARIABLE_NAME_PATTERN = Pattern.compile("^[A-Za-z][A-Za-z0-9_]*$");

    // The name of the variable being referenced.
    private final String variableName;

    /**
     * While it is assumed that the caller of the constructor has already verified that variableName fits
     * VARIABLE_NAME_PATTERN, we will perform an additional check here just in case.
     */
    public VariableExpression(String variableName) {
        if (!variableName.matches(VARIABLE_NAME_PATTERN.pattern())) {
            throw new RuntimeException("Invalid variable name provided: " + variableName);
        }
        this.variableName = variableName;
    }

    /**
     * Returns the integer value represented by this variable. Throws a RuntimeException if the variable is undefined in
     * the state map.
     */
    @Override
    public int evaluate(ProgramState programState) {
        if(!programState.isDefined(variableName)){
            throw new RuntimeException("Undefined variable: " + variableName);
        }
        return programState.getVariable(variableName);
    }
}
