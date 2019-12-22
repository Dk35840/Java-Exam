package mB2.ch8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// this is question from the question 40 from the unit 18
public class QQ40 implements Serializable {
	private int chambers = -1;
	private transient Double size = null;
	private static String color;

	public QQ40() {
		this.chambers = 3;
		color = "BLUE";
	}

	public static void main(String[] love) throws Throwable {
		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("scan.txt"))) {
			final QQ40 v = new QQ40();
			v.chambers = 2;
			v.size = 10.0;
			v.color = "RED";
			o.writeObject(v);
		}
		new QQ40();
		try (ObjectInputStream o = new ObjectInputStream(new FileInputStream("scan.txt"))) {
			QQ40 v = (QQ40) o.readObject();
			System.out.print(v.chambers + "," + v.size + "," + v.color);
		}
	}

	{
		chambers = 4;
	}
}