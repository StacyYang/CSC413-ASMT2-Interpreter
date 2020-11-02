package edu.csc413.expression;

import edu.csc413.interpreter.ProgramState;

import java.util.regex.Pattern;

public class ConstantExpression  extends Expression{
    // The format for a valid constant String as a regular expression.
    public static final Pattern CONSTANT_PATTERN = Pattern.compile("^-?[0-9_]+$");

    //The integer constant
    private final int value;

    public ConstantExpression(int value){
        this.value = value;
    }

    @Override
    public int evaluate(ProgramState programState){
        return value;
    }
}
