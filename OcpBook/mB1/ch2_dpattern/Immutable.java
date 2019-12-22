package mB1.ch2_dpattern;

public class Immutable {

	
	// it is make because many other object use this object as this is immutable
	
	/*
	 * immutable class can be attain by following ways
	 * 1> make class make public and final 
	 * 2>declare variable make private 
	 * 3>make construtor for assigning the value
	 * 4>don't make setter method for  changing
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImmutableClass a= new ImmutableClass("hellod");
		
		System.out.println(a.getA());
		System.out.println(a);
		
		System.out.println("printing the hash code"+ a.hashCode());
	}

}



 final class ImmutableClass{
	 
	 //the varialbe  must be for private and must be final
	  private final String a;
	  
	  public ImmutableClass(String a) {
		  this.a=a;
	  }
	  
	  // only getter method
	  public String getA()	{
		  return this.a;
	  }
	  
       

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public String toString() {
	    return a;
	    }
	  
	  // it is automatically generated
	  @Override
	public int hashCode() {
		  
		 // System.out.println(a.hashCode());  
		  //it gives  99162322
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		return result;
	}
 // it is automatically generated
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableClass other = (ImmutableClass) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		return true;
	}

	
	  
  }