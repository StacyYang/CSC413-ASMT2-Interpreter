package ExpressionTest;

import edu.csc413.expression.ConstantExpression;
import edu.csc413.interpreter.ProgramState;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ConstantExpressionTest {
    @Test
    public void constantExpressionTest(){
        ConstantExpression constantExpressionTest = new ConstantExpression(72);
        ProgramState constantProgramState = new ProgramState();
        int result = constantExpressionTest.evaluate(constantProgramState);

        assertEquals(72, result);
    }
}

