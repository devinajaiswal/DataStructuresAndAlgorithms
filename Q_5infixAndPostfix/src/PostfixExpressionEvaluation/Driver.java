package PostfixExpressionEvaluation;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String expression= " 4 8 + 6 5 - 3 2 - 2 2 + * / *";
		PostfixEvaluation res= new  PostfixEvaluation();
		double val=res.PostfixEvaluation_Impl(expression);
		 System.out.println("Value of postfix expression '"+expression+"' is : "+val);
	}

}
