package mB2.ch6;

public class pg360 {

	/*
	 *  workings on assertions
	 *  BEFORE WORKING WE HAVE TO USE -ea like java -ea pg360
	 *  It gives three output ie no any if assertion is disabled,if assertion is true then nothing happen else it give fatal error
	 */
	public static void main(String[] args) {
		

		// it has two forms
	//	assert boolean_expression;
		int inte=-5;
		assert inte < 0;
	
		System.out.println(inte);
		//assert boolean_expression: error_message;
	}

}
