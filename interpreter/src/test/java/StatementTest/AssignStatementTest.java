package StatementTest;

import edu.csc413.expression.Expression;
import edu.csc413.interpreter.ProgramState;
import edu.csc413.statement.AssignStatement;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AssignStatementTest {
    @Test
    public void assignStatementTest(){
        String variableName = "a";
        String expressionLine = "72";
        Expression assignExpression = Expression.create(expressionLine);
        AssignStatement assign1 = new AssignStatement("a", assignExpression);

        ProgramState assignProgramState = new ProgramState();
        assign1.run(assignProgramState);
        int result = assignProgramState.getVariable(variableName);

        assertEquals(72, result);
    }
}


