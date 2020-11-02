package StatementTest;

import edu.csc413.expression.Condition;
import edu.csc413.expression.Expression;
import edu.csc413.interpreter.ProgramState;
import edu.csc413.statement.AssignStatement;
import edu.csc413.statement.IfStatement;
import edu.csc413.statement.Statement;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IfStatementTest {
    @Test
    public void ifStatementTest(){
        String conditionString = "3==3";
        Condition condition = Condition.create(conditionString);

        List<Statement> blockStatements = new ArrayList<>();
        Expression bValue = Expression.create("10");
        blockStatements.add(new AssignStatement("b", bValue));

        IfStatement ifStatementTest = new IfStatement(condition, blockStatements);
        ProgramState ifStatementPS = new ProgramState();
        ifStatementTest.run(ifStatementPS);

        assertEquals(10, ifStatementPS.getVariable("b"));
    }
}

