package mB1.ch3;

import java.util.ArrayList;
import java.util.List;

// without generic we can  declare list like
// List list= new ArrayList();

// a generic is a type declared inside angle brackets
//List<String>  list= new ArrayList<String>();
 
public class GenericStudy{
		public static void main(String...strings) {
			
			List<Integer> listInteger = new ArrayList<>();
			List<Float> listFloat = new ArrayList<>();
			List<Number> listNumber = new ArrayList<>();
			listNumber.add(new Integer(1)); // OK
			listNumber.add(new Float(1.0F)); // OK
		//	listNumber = listInteger; // Error
		//	listNumber = listFloat; // Error

			List<? extends Number> listExtendsNum = new ArrayList<>();
			// This would cause an error
			// listExtendsNum.add(new Integer(1));
			listExtendsNum = listInteger; // OK
			listExtendsNum = listFloat; // OK
		}
}
