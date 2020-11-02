package ExpressionTest;

import edu.csc413.expression.VariableExpression;
import edu.csc413.interpreter.ProgramState;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class VariableExpressionTest {
    @Test
    public void evaluateTest() {
        String variableName = "a";
        VariableExpression variableTest = new VariableExpression(variableName);

        ProgramState variableTestPS = new ProgramState();
        variableTestPS.setVariable(variableName, 72);

        int result = variableTest.evaluate(variableTestPS);

        assertEquals(72, result);
    }
}

