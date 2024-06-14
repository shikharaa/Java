package com.shikhara.Java8;

import java.time.LocalDate;
import java.time.*;

public class TestDateAndTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate t1 = LocalDate.now();
		System.out.println(t1);
		
		LocalTime t2 = LocalTime.now();
		System.out.println(t2);
		
		LocalDateTime t3 = LocalDateTime.now();
		System.out.println(t3);
		
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println(z1);

	}

}
