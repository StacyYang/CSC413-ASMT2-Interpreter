package StatementTest;

import edu.csc413.expression.Condition;
import edu.csc413.expression.Expression;
import edu.csc413.interpreter.ProgramState;
import edu.csc413.statement.AssignStatement;
import edu.csc413.statement.ForStatement;
import edu.csc413.statement.Statement;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ForStatementTest {
    @Test
    public void forStatementTest(){

        String conditionString = "X < 3";
        Condition condition = Condition.create(conditionString);

        List<Statement> blockStatements = new ArrayList<>();
        Expression bValue = Expression.create("b + 1");
        Expression xValue = Expression.create("X + 1");
        blockStatements.add(new AssignStatement("b", bValue));
        blockStatements.add(new AssignStatement("X", xValue));

        Expression x = Expression.create("0");
        Statement initializationAssign = new AssignStatement("X", x);
        Expression xplus = Expression.create("X + 1");
        Statement updateAssign = new AssignStatement("X", xplus);

        ForStatement forStatementTest = new ForStatement(condition, blockStatements, initializationAssign, updateAssign);
        ProgramState forStatementPS = new ProgramState();
        forStatementPS.setVariable("b", 1);
        forStatementTest.run(forStatementPS);

        assertEquals(3, forStatementPS.getVariable("b"));
    }
}
