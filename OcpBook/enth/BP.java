package enth;


/*
		Output: 4
 */


public class BP {
	
	protected static int assertTest() {
		assert false :"testing";
	   return 2;
	}
public static void main(String[] str) {
	
	

	String[] symbol  = {"T","T","F","T"};
	String[] operator= {"|","&","^"};
	 		//			T|T&F^T
	System.out.println(synch(symbol,operator));
}


	public static int synch(String[] symbol,String[] operator) {
		String[] inbuildArray= new String[symbol.length+operator.length];
		
		int k=0;
	
		for(int i=0; i<operator.length;i++,k++) {
			
			inbuildArray[k]= symbol[i];
			inbuildArray[++k]= operator[i];
		}
		inbuildArray[k]= symbol[symbol.length-1];
		
		for(String s:inbuildArray)
			System.out.print(s);
		
		
		
		return 0;
	}
}


