package edu.csc413.interpreter;

/**
 * A class which tracks the state of a running program. ProgramState should maintain a call stack, with each call frame
 * tracking variable names and their corresponding values. ProgramState should also keep track of function definitions,
 * so that when function calls are made, they can be run and evaluated.
 */
public class ProgramState {

    public int getVariable(String variable) {
        // TODO: Implement.
        return 0;
    }

    public void setVariable(String variable, int value) {
        // TODO: Implement.
    }

    public void addNewCallFrame() {
        // TODO: Implement.
    }

    public void removeCurrentCallFrame() {
        // TODO: Implement.
    }

    // TODO: Define and implement methods for setting and retrieving a function's list of parameter names given the
    //       function name, along with the corresponding instance variables.

    // TODO: Define and implement methods for setting and retrieving a function's list of Statements representing its
    //       body given the function name, along with the corresponding instance variables.

    public boolean hasReturnValue() {
        // TODO: Implement.
        return false;
    }

    public int getReturnValue() {
        // TODO: Implement.
        return 0;
    }

    public void setReturnValue(int value) {
        // TODO: Implement.
    }

    public void clearReturnValue() {
        // TODO: Implement.
    }
}
