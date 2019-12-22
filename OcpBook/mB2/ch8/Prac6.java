package mB2.ch8;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Prac6 {
	public void sendAlert(File fn) {
		try(BufferedWriter w = new BufferedWriter(new FileWriter(fn))) {
		w.write("ALERT!");
		w.flush();
		w.write('!');
		System.out.print("1");
		} catch (IOException e) {
		System.out.print("2");
		} finally {
		System.out.print("3");
		}
		}
		public static void main(String[] testSignal) {
		new Prac6().sendAlert(new File("alarm.txt"));
		}
		}