package mB1.ch2;

public enum PQ34 {
	TRUE(-10) {
		@Override
		protected
		String getNickName() {
			return"RIGHT";
		}
	},
	FALSE(-10) {
		public String getNickName() {
			return"WRONG";
		}
	},
	UNKNOWN(0) {
	@Override public String getNickName() { return "LOST"; }
	};
	private final int value;

	PQ34(int value) {
this.value = value;
}

	public int getValue() {
		return this.value;
	}

	protected abstract String getNickName();
	
	//pg 114
	public static <T> T ship (T t) {
		return t;
	}
}