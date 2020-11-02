package StatementTest;

import edu.csc413.expression.Condition;
import edu.csc413.expression.Expression;
import edu.csc413.interpreter.ProgramState;
import edu.csc413.statement.AssignStatement;
import edu.csc413.statement.Statement;
import edu.csc413.statement.WhileStatement;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WhileStatementTest {
    @Test
    public void whileStatementTest(){

        String conditionString = "X < 3";
        Condition condition = Condition.create(conditionString);

        List<Statement> blockStatements = new ArrayList<>();
        Expression bValue = Expression.create("b + 1");
        Expression xValue = Expression.create("X + 1");
        blockStatements.add(new AssignStatement("b", bValue));
        blockStatements.add(new AssignStatement("X", xValue));

        WhileStatement whileStatementTest = new WhileStatement(condition, blockStatements);
        ProgramState whileStatementPS = new ProgramState();
        whileStatementPS.setVariable("X", 1);
        whileStatementPS.setVariable("b", 1);
        whileStatementTest.run(whileStatementPS);

        assertEquals(3, whileStatementPS.getVariable("b"));

    }
}
