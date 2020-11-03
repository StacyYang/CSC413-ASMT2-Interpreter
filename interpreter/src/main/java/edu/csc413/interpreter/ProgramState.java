package edu.csc413.interpreter;

import edu.csc413.statement.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class which tracks the state of a running program. ProgramState should maintain a call stack, with each call frame
 * tracking variable names and their corresponding values. ProgramState should also keep track of function definitions,
 * so that when function calls are made, they can be run and evaluated.
 */
public class ProgramState {

    private final Map<String, Integer> variablesByName;
    private List<String> functions = new ArrayList<>();
    private Map<String, List<String>> functionVariables = new HashMap<>();
    private Map<String, List<Statement>> functionStatements = new HashMap<>();

    private boolean has_return = false;
    private int return_value = -1;

    public ProgramState() {
        this.variablesByName = new HashMap<>();
    }

    public boolean isDefined(String variableName){
        return variablesByName.containsKey(variableName);
    }

    public int getVariable(String variable) {
        return variablesByName.get(variable);
    }

    public void setVariable(String variable, int value) {
        variablesByName.put(variable, value);
    }

    public void addNewCallFrame() {
        // TODO: Implement.
    }

    public void removeCurrentCallFrame() {
        // TODO: Implement.
    }

    // Define and implement methods for setting and retrieving a function's list of parameter names given the
    //       function name, along with the corresponding instance variables.

    // Define and implement methods for setting and retrieving a function's list of Statements representing its
    //       body given the function name, along with the corresponding instance variables.
    public void registerFunction(String functionName, List<String> newFunctionVariables, List<Statement> newFunctionStatements){
        functions.add(functionName);
        functionVariables.put(functionName, newFunctionVariables);
        functionStatements.put(functionName, newFunctionStatements);
    }

    public List<String> getRegisteredFunctions(){
        return functions;
    }

    public List<String> retrieveFunctionParams(String functionName){
        List<String> parameterNames = functionVariables.get(functionName);
        return parameterNames;
    }

    public List<Statement> retrieveFunctionStatements(String functionName){
        return functionStatements.get(functionName);
    }

    public boolean hasReturnValue() {
        return has_return;
    }

    public int getReturnValue() {
        if(has_return) return return_value;
        return -1;
    }

    public void setReturnValue(int value) {
        if(!has_return){
            has_return = true;
            return_value = value;
        }
    }

    public void clearReturnValue() {
        has_return = false;
        return_value = -1;
    }
}
