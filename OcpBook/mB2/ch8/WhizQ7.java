package mB2.ch8;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WhizQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=10;
try {
	FileOutputStream out= new FileOutputStream("tex.txt");
	ObjectOutputStream oout= new ObjectOutputStream(out);
	oout.write(6);
	//oout.defaultWriteObject();
	
	oout.writeObject(i);
}
catch (Exception e) {
	e.printStackTrace();
}
	}

}
