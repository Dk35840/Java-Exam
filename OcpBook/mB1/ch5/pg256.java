package mB1.ch5;

//import java.util.Locale;
import java.util.*;

// typing error don't use vowel for for underscore that determines
public class pg256 {
	
	public static void main(String[] str) {
		
		//for the default 
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		
		Map<String, String> map = new TreeMap<>();
		map.put("tool", "hammer");
		map.put("problem", "nail");
		Properties props = new Properties(); // p1
		map.forEach((k,v) -> props.put(k, v)); // p2
		
		// setting locale india and hindi as a default
		Locale l2=new Locale("hi", "IN");
		Locale.setDefault(l2);
		System.out.println(Locale.getDefault());
		
		// using builder method for the language selection
		System.out.println("setting the us as builder for the language");
		Locale lbuilder1 = new Locale.Builder()
				.setLanguage("en")
				.setRegion("US")
				.build();
		System.out.println(lbuilder1);
		
				Locale lbuilder2 = new Locale.Builder()
				.setRegion("US")
				.setLanguage("en")
				.build();
				System.out.println(lbuilder2);
				
				
				// creating interlaization  in our app
				
				// creating locale for us en
				Locale i_us= new Locale("en","US");
				Locale i_fr= new Locale("fr","FR");
				
				
			//	System.out.println("the language in france");
			//	printProperties(i_fr);
				
				System.out.println("the language in en us");
				printProperties(i_us);
				
				
				System.out.println("my own created resource file is as hindi ");
				Locale i_hi= new Locale("hi","US");
				printProperties(i_hi);
				
	}
	
	
	public static void printProperties(Locale l) {
		ResourceBundle rb =ResourceBundle.getBundle("mB1.ch5_source.Zoo",l);

		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("open"));
		System.out.println(rb.getString("animal1"));
		System.out.println(rb.getString("animal2"));
		System.out.println(rb.getString("animal3"));
		
		System.out.println(rb.getString("not_in_resource"));
		
		System.out.println(rb.getString("en"));
		System.out.println(rb.getString("en_us"));
		
		// can have a language without a country, but not the reverse giving exception
		//System.out.println(rb.getString("us"));
		
	}
	
	
}


//creating the resource bundle

	// for hi language
	
	class Zoo_hi extends ListResourceBundle{

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return new Object[][] {
			{"hello","kaise bada"},
			{"open","khola ho ch"}
		};
	}
		
	}
