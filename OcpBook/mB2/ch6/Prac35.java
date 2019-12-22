package mB2.ch6;

public class Prac35 {
	class BearException extends RuntimeException {
	}

	class WolfException extends RuntimeException {
	}

	class DragonException extends RuntimeException {
	}

	public int tellStory() {
		try {
		} catch (BearException d) {
			throw new RuntimeException();

		} catch (WolfException | DragonException e) {
			e = new RuntimeException();
			throw e;
		}
		return 3;
	}

	public static void main(String... wand) throws RuntimeException {
		new Prac35().tellStory();
	}
}
