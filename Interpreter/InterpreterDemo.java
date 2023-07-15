package Interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarried = getMarriedWomanExpression();
        System.out.println("John is male? -> "+isMale.interpret("John"));
        System.out.println("Julie is a married women? -> "+isMarried.interpret("Married Julie"));
    }
    /* 生成john和Robert都是男性规则 */
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    /* 生成julie是已婚女性规则 */
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }
}
