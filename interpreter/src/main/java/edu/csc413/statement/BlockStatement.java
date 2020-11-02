package edu.csc413.statement;

import edu.csc413.expression.Condition;
import edu.csc413.interpreter.ProgramState;

import java.util.List;

/**
 * An abstract Statement type that represents a compound Statement, where running the Statement leads to a sequence of
 * other Statements to be run in order.
 */
public abstract class BlockStatement extends Statement {
    // TODO: Implement. BlockStatement should privately track the List of statements comprising the body of the block.
    //                  Add whatever instance variables and constructor are needed to support that.

    private final List<Statement> blockStatements;
    protected final Condition condition;

    public BlockStatement(Condition condition, List<Statement> blockStatements){
        this.blockStatements = blockStatements;
        this.condition = condition;
    }

    /**
     * Runs every statement in the BlockStatement's block. Note that for certain looping statements, this may be
     * invoked repeatedly.
     */
    protected void runBlock(ProgramState programState) {
        // TODO: Implement.
        for(Statement statement: blockStatements){
            statement.run(programState);
        }
    }


}
