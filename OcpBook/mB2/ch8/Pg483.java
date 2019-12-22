package mB2.ch8;

import java.io.Serializable;

public class Pg483 implements Serializable {
	private static final long serialVersionUID = 2L;
	private transient String name;
	private transient int age = 10;
	private static char type = 'C';
	
	{this.age = 14;}
	public Pg483() {
	this.name = "Unknown";
	this.age = 12;
	this.type = 'Q';
	}
	public Pg483(String name, int age, char type) {
	this.name = name;
	this.age = age;
	this.type = type;
	}
	// Same methods as before

	}