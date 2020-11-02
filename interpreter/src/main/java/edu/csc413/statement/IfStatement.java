package edu.csc413.statement;

import edu.csc413.expression.Condition;
import edu.csc413.interpreter.ProgramState;

import java.util.List;

public class IfStatement extends BlockStatement{

    public IfStatement(Condition condition, List<Statement> blockStatements){
        super(condition, blockStatements);
    }//constructor

    @Override
    public void run(ProgramState programState) {
        if(condition.evaluate(programState)){
            super.runBlock(programState);
        }
    }
}
