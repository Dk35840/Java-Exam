package mB1.ch1;

import java.io.FileWriter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class TestClass {
	static class Rabbit implements Comparable {
		Integer id;

		@Override
		public int compareTo(Object o) {
			return this.id - ((Rabbit) o).id;

		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Stream s= Stream.of("fsd","fsd");
	

		
	}
}
