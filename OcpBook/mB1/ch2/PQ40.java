package mB1.ch2;

public class PQ40 {
	protected static int first = 2;
	private final short DEFAULT_VALUE = 10;

	private static class GetSet {
		int first = 5;
		static int second = DEFAULT_VALUE;
	}

	private GetSet go = new GetSet();

	public static void main(String[] begin) {
		PQ40 r = new PQ40();
		System.out.print(r.go.first);
		System.out.print(", " + r.go.second);
	}
}
