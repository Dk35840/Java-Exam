package whiz;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class P3Q85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate ldt = LocalDate.of(2016,12,21);
         DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
         DateTimeFormatter format1 = DateTimeFormatter.ofPattern("YYYY-mmm-dd");
         System.out.println(ldt.format(format));
         System.out.println(ldt.format(format1));
	}

}
