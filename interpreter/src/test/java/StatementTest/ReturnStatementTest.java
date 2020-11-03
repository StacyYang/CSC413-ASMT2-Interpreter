package StatementTest;

import edu.csc413.expression.Expression;
import edu.csc413.interpreter.ProgramState;
import edu.csc413.statement.ReturnStatement;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ReturnStatementTest {
    @Test
    public void returnTest(){
        String expressionLine = "72";
        Expression returnExpression = Expression.create(expressionLine);
        ReturnStatement returnStatement = new ReturnStatement(returnExpression);

        ProgramState returnProgramState = new ProgramState();
        returnStatement.run(returnProgramState);
        int result = returnProgramState.getReturnValue();

        assertEquals(72, result);
    }
}
