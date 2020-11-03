package edu.csc413.statement;

import edu.csc413.interpreter.ProgramState;

import java.util.List;

public class DefineFunctionStatement extends Statement{
    private String functionName;
    private List<String> parameterNames;
    private List<Statement> functionStatements;
    public DefineFunctionStatement(String fName, List<String> paramNames, List<Statement> fStatements) {
        functionName = fName;
        parameterNames = paramNames;
        functionStatements = fStatements;
    }

    @Override
    public void run(ProgramState programState) {
        programState.registerFunction(functionName, parameterNames, functionStatements);
    }
}
