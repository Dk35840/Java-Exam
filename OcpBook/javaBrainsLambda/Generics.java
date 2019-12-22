package javaBrainsLambda;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


// generic class
class Container<i1,i2>
{
	i1 item1;
	i2 item2;
	
	public Container(i1 item1, i2 item2) {
		this.item1=item1;
		this.item2=item2;
	}
	
	
	public i1 getItem1() {
		return this.item1;
	}
	
	public i2 getItem2() {
		return this.item2;
	}
}


public class Generics {
		 public static void main(String...strings) {
			 
		// java is about the type ie String, int . first java check the type ie java is typesafety language	 
			 // java is realted to native code
			 ArrayList mylist= new ArrayList();
			 mylist.add("fgasf");
			 mylist.add(4);
			 mylist.add('d');
			 
			 System.out.println(mylist);
			 
			 Container<Integer,String> c1= new Container<>(44,"first container");
			 
			 // set for adding
			 Set<String> s1= new HashSet<String>();
			 s1.add("sfd");
			 s1.add("ddsfs");
			 s1.add("sfsdfsfd");
			 
			 
			 Set<String> s2= new HashSet<String>();
			 s1.add("sfd");
			 s1.add("ddsfs");
			 s1.add("sfs");
			 
			 Set<String> rs= union(s1,s2);
			 
			 // iterator interface
			 Iterator<String> itr=rs.iterator();
			 while(itr.hasNext())
			 {
				 System.out.println(itr.next());
			 }
				 
			 
				 
}
		 
		 
		 
		// generic method E can be words  ie multiple character
		 public static <E> Set<E>  union(Set<E> s1, Set<E> s2) {   // it can be Set<hello>
			Set<E> res= new HashSet<E>(s1);
			res.addAll(s2);
			 return res;
			 
			 
		 }
}

