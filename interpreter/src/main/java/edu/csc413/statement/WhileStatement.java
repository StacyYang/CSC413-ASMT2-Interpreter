package edu.csc413.statement;

import edu.csc413.expression.Condition;
import edu.csc413.interpreter.ProgramState;

import java.util.List;

public class WhileStatement extends LoopStatement{

    public WhileStatement(Condition condition, List<Statement> blockStatements) {
        super(condition, blockStatements);
    }//constructor


    /**
     * A method which runs any initialization step that happens before the loop executes. Each subclass of
     * LoopStatement will provide its own implementation of this based on how that LoopStatement is defined.
     */
    protected void runInitialization(ProgramState programState){
        //we don't need runInitialization for whileStatement.
        //So leave this method empty. But we must call it.

        //while(X<10){}
    }

    /**
     * A method which runs any update step that happens after each run of the loop body. Each subclass of
     * LoopStatement will provide its own implementation of this based on how that LoopStatement is defined.
     */
    protected void runUpdate(ProgramState programState){
        //we don't need runUpdate for whileStatement.
        //So leave this method empty. But we must call it.
    }
}
