package assignment_scope_operators;

public class If_Block {

	public static void main(String[] args) {
		int a=10;
		if(true)
		{
			int b=15;
			System.out.println("a= "+a+" b= "+b);
		}
		//System.out.println("a= "+a+" b= "+b);
	}
/*ouptut:Compiler error
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	b cannot be resolved to a variable

	at Training/assignment_scope_operators.If_Block.main(If_Block.java:12)
 */
}
