package mB2.ch6;

import java.io.IOException;

public class Prac16 
	{
		class TideException extends Exception {}
		public void surf() throws Exception {
		try {
		throw new IOException();
		} catch (TideException | IOException i) {}
		}
		}

dempotent means that the method can called be multiple times without any side effects or undesirable behavior on subsequent runs.