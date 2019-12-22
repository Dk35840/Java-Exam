package mB2.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

class A {
	public void ride() {
		System.out.println("a");
	}
}

public class Q10 extends A {
	public static void main(String[] args) throws IOException {
		String name = "John-.-George-.-Hoew";

		IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;
		
		for (String s : name.split("-."))
			System.out.println(s);

		A a = new Q10();
		a.ride();
		
		Thread thread1 = new Thread(new MyThread());Thread thread2 = new Thread(new MyThread());
		Thread thread3 = new Thread(new MyThread());
		Thread [] ta = {thread1, thread2, thread3};
		for (int x= 0; x < 3; x++) {
		ta[x].start();
		}

	}

	public void ride() {
		System.out.println("B");
	}

}

interface B {
	int st = 3;
}

class Aw {

	static int st = 4;
	int id;

	Aw() {
	}

	Aw(int i) {
		id = i;
	}

	protected String doa() {
		return "a";
	}

	public boolean equals(Object o) {
		return (this == o) ? true : super.equals(o);
	}
}

class Canvas implements Drawable {
	public void draw() {
	}
}

class Frame extends Canvas implements Drawable {
	public void resize() {
	}
}

interface Drawable {
	public abstract void draw();
}

interface x {
	public void m();
}

class y {
	public void m() {
	}
}

class z extends y implements x {
}

class MyThread implements Runnable {
	private static AtomicInteger count = new AtomicInteger(0);

public void run () {
int x = count.incrementAndGet();
System.out.print(x +" ");
}
}