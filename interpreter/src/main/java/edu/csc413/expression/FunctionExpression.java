//package edu.csc413.expression;
//
//import edu.csc413.interpreter.ProgramState;
//import edu.csc413.statement.Statement;
//
//import java.util.List;
//
//public class FunctionExpression extends Expression{
//    private final String functionName;
//    private final List<Expression> parameterValues;
//
//    public FunctionExpression(String functionName, List<Expression> parameterValues){
//        this.functionName = functionName;
//        this.parameterValues = parameterValues;
//    }
//
//    @Override
//    public int evaluate(ProgramState programState) {
//        //from programState, get the list of parameter names associated with functionName.
//        List<String> parameterNames = programState.blabla;
//        //from programState, get the list of Statements names associated with functionName.
//        List<Statement> functionStatements = programState.blablabla;
//
//        //push a new call frame onto the call stack
//
//        //look through parameter names, and assign each parameter as though it's a variable corresponding
//        //    values for those parameter variables comes from parameterValues
//
//        //go through statements in functionStatements and run each one
//
//        //pop this function's call frame from the call stack
//
//
//        //return the value that was in the ReturnStatement that was run in functionStatements
//        //(clear return value that read from for the result of this evaluate method)
//    }
//}
//
///*
//1. Look up the names of the parameters for the function.
//        2. Match the expressions being passed in as parameters with those names, and initialize
//        them all as variables.
//        3. Look up the code for the function, in the form of a list of Statement s.
//        4. Invoke run on each statement, one after another.
//        5. When a ReturnStatement is encountered, quit running statements in the function and
//        evaluate the original FunctionExpression to the value returned by the
//        ReturnStatement .
//
// */