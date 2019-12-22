package mB2.ch8;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable {
}

public class QPrac21 {
	public static void main(String[] grades) {
		try (ObjectInputStream ios = new ObjectInputStream(new FileInputStream(new File("C://students.data")))) {
			Student record;
			while ((record = (Student) ios.readObject()) != null) {
				System.out.print(record);
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}