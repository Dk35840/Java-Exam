package mB1.ch2;

enum DaysOff {
	Thanksgiving, PresidentsDay, ValentinesDay
}
enum DayOn{}
public class PQ2 {
	public static void main(String... unused) {
		final DaysOff input = DaysOff.PresidentsDay;
		switch (input) {
		default:
		case ValentinesDay:
			System.out.print("1");
		case PresidentsDay:
			System.out.print("2");
		}
		
		System.out.println(DaysOff.Thanksgiving.ordinal()==0 );
	}
}
