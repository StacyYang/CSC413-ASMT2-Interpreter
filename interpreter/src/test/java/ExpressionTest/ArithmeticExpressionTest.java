package ExpressionTest;

import edu.csc413.expression.ArithmeticExpression;
import edu.csc413.expression.Expression;
import edu.csc413.interpreter.ProgramState;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticExpressionTest {
    @Test
    public void addTest(){
        ArithmeticExpression.Operator addOperator = ArithmeticExpression.Operator.ADD;
        String lhs = "2";
        String rhs = "3";
        ArithmeticExpression arithmeticExpressionTest = new ArithmeticExpression(addOperator, Expression.create(lhs), Expression.create(rhs) );

        ProgramState arithmeticProgramState = new ProgramState();
        int result = arithmeticExpressionTest.evaluate(arithmeticProgramState);

        assertEquals(5, result);
    }

    @Test
    public void subtractTest(){
        ArithmeticExpression.Operator subtractOperator = ArithmeticExpression.Operator.SUBTRACT;
        String lhs = "2";
        String rhs = "3";
        ArithmeticExpression arithmeticExpressionTest = new ArithmeticExpression(subtractOperator, Expression.create(lhs), Expression.create(rhs) );

        ProgramState arithmeticProgramState = new ProgramState();
        int result = arithmeticExpressionTest.evaluate(arithmeticProgramState);

        assertEquals(-1, result);
    }

    @Test
    public void multiplyTest(){
        ArithmeticExpression.Operator multiplyOperator = ArithmeticExpression.Operator.MULTIPLY;
        String lhs = "2";
        String rhs = "3";
        ArithmeticExpression arithmeticExpressionTest = new ArithmeticExpression(multiplyOperator, Expression.create(lhs), Expression.create(rhs) );

        ProgramState arithmeticProgramState = new ProgramState();
        int result = arithmeticExpressionTest.evaluate(arithmeticProgramState);

        assertEquals(6, result);
    }

    @Test
    public void divideTest(){
        ArithmeticExpression.Operator divideOperator = ArithmeticExpression.Operator.DIVIDE;
        String lhs = "6";
        String rhs = "3";
        ArithmeticExpression arithmeticExpressionTest = new ArithmeticExpression(divideOperator, Expression.create(lhs), Expression.create(rhs) );

        ProgramState arithmeticProgramState = new ProgramState();
        int result = arithmeticExpressionTest.evaluate(arithmeticProgramState);

        assertEquals(2, result);
    }

    @Test
    public void reminderTest(){
        ArithmeticExpression.Operator reminderOperator = ArithmeticExpression.Operator.REMAINDER;
        String lhs = "5";
        String rhs = "3";
        ArithmeticExpression arithmeticExpressionTest = new ArithmeticExpression(reminderOperator, Expression.create(lhs), Expression.create(rhs) );

        ProgramState arithmeticProgramState = new ProgramState();
        int result = arithmeticExpressionTest.evaluate(arithmeticProgramState);

        assertEquals(2, result);
    }

    @Test
    public void powerTest(){
        ArithmeticExpression.Operator powerOperator = ArithmeticExpression.Operator.POWER;
        String lhs = "2";
        String rhs = "3";
        ArithmeticExpression arithmeticExpressionTest = new ArithmeticExpression(powerOperator, Expression.create(lhs), Expression.create(rhs) );

        ProgramState arithmeticProgramState = new ProgramState();
        int result = arithmeticExpressionTest.evaluate(arithmeticProgramState);

        assertEquals(8, result);
    }
}
