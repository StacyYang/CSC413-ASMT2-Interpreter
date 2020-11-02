package edu.csc413.statement;

import edu.csc413.expression.Condition;
import edu.csc413.interpreter.ProgramState;

import java.util.List;

public class ForStatement extends LoopStatement{
    private final Statement initializationAssign;
    private final Statement updateAssign;

    public ForStatement(Condition condition, List<Statement> blockStatements, Statement initializationAssign, Statement updateAssign ) {
        super(condition, blockStatements);
        this.initializationAssign = initializationAssign;
        this.updateAssign = updateAssign;
    }//constructor

    /**
     * A method which runs any initialization step that happens before the loop executes. Each subclass of
     * LoopStatement will provide its own implementation of this based on how that LoopStatement is defined.
     */
    protected void runInitialization(ProgramState programState){
        initializationAssign.run(programState);
    }

    /**
     * A method which runs any update step that happens after each run of the loop body. Each subclass of
     * LoopStatement will provide its own implementation of this based on how that LoopStatement is defined.
     */
    protected void runUpdate(ProgramState programState){
        updateAssign.run(programState);
    }
}