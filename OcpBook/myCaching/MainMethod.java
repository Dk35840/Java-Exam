package myCaching;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MainMethod {
	public static void main(String[] args) {

		int b=4;
			Vector v = new Vector();

		v.add("temp1");
		v.add("temp2");
		Enumeration ds = v.elements();
		System.out.println("enum preparation");
		while (ds.hasMoreElements()) {
			System.out.println(ds.nextElement());
		}
		// caller
		String str = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String str1 = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZa");
		// cache object for time
		CacheObj co = new CacheObj(str, new Long(1234), 1);
		CacheObj co1 = new CacheObj(str1, new Long(12341));

		CacheManager.putCache(co);

		CacheObj coGet = (CacheObj) CacheManager.getCache(new Long(1234));

		if (coGet == null)
			System.out.println("CacheManagerTestProgram.Main:  FAILURE!  Object not Found.");
		else
			System.out.println("CacheManagerTestProgram.Main:  SUCCESS! " + ( coGet.obj).toString());
	}

}
