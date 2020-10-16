package edu.csc413.statement;

import edu.csc413.interpreter.ProgramState;

/**
 * An abstract Statement type that represents a compound Statement, where running the Statement leads to a sequence of
 * other Statements to be run in order.
 */
public abstract class BlockStatement extends Statement {
    // TODO: Implement. BlockStatement should privately track the List of statements comprising the body of the block.
    //                  Add whatever instance variables and constructor are needed to suppor that.

    /**
     * Runs every statement in the BlockStatement's block. Note that for certain looping statements, this may be
     * invoked repeatedly.
     */
    protected void runBlock(ProgramState programState) {
        // TODO: Implement.
    }
}
