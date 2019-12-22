package mB2.ch8;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;

public class QQ31 {
	public int getWidgetNumber(byte[] data) throws Exception {
		try (InputStream is = new ByteArrayInputStream(data)) {
		
			System.out.println(is.read(new byte[3]));
			System.out.println("three parameter mode read method");
			// len= 3 ie three data bytes are read
		int a=	is.read(data, 3, 3);
			System.out.println(a);
			
			if (!is.markSupported())
				return -1;
			is.mark(5);
			System.out.println(	is.read());
		
			is.read();
			is.skip(3);
			is.reset();
		//	is.read();
			return is.read();
		}
	}
//The mark() marking a particular point in a stream and reset() resets the stream to the most recent mark.
//These methods provide a book-marking feature that allows you to read ahead in the stream to inspect the upcoming data.
	// main goal of mark() is the use of reset
	public static void main(String... sprockets) throws Exception {
		final QQ31 p = new QQ31();
		System.out.print(p.getWidgetNumber(new byte[] { 9,8,1, 2, 3, 4, 5, 6, 7 }));
		
		
		  System.out.println(" \n gfg mark:"); 
		try { 
            String str = "GeeksForGeeks 0123456789"; 
  
            // Create a Reader instance 
            Reader reader 
                = new StringReader(str); 
  
            // Get the character 
            // to be read from the stream 
            int ch; 
  
            // Read the first 10 characters 
            // to this reader using read() method 
            // This will put the str in the stream 
            // till it is read by the reader 
            System.out.println("our string :"+ str);
           System.out.println("\nprint first 10 letters");
            for (int i = 0; i < 10; i++) { 
                ch = reader.read(); 
                System.out.print((char)ch); 
            } 
  
            System.out.println(" \nmark the stream for5 char and print 6 char"); 
  
           
            reader.mark(5); 
            for (int i = 0; i < 6; i++) { 
                ch = reader.read(); 
                System.out.print((char)ch); 
            } 
            
            System.out.println("\n without reset the stream position and print 5 char");
            for (int i = 0; i < 5; i++) { 
                ch = reader.read(); 
                System.out.print((char)ch); 
            } 
           System.out.println("\n reset the stream position and print 5 char");
        reader.reset(); 
  
           
            // to this reader using read() method 
            for (int i = 0; i < 5; i++) { 
                ch = reader.read(); 
                System.out.print((char)ch); 
            } 
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
    } 
	}

