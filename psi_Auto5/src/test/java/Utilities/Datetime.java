package Utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

import java.time.*;
public class Datetime {
	
	public static void DateAndTime() {
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		int cdate=date.getDayOfMonth();
		System.out.println(cdate);
		int cmonth=date.getMonthValue();
		System.out.println(cmonth);
		int cyear=date.getYear();
		System.out.println(cyear);
		
		String stdate = Integer.toString(cdate);	
		String stmonth = Integer.toString(cmonth);
		String styear = Integer.toString(cyear);
		
		String discdate = styear+"-"+stmonth+"-"+stdate;
		
		System.out.println(discdate);
		
		int hour =time.getHour();
		int minute =time.getMinute();
		int minute15 = 15;
		
		int discussionminute= minute+minute15;
		
		
		String sthr = Integer.toString(hour);
		String stmin = Integer.toString(discussionminute);
		
		String discDateTime = sthr+":"+stmin;
		System.out.println(discDateTime);
		
		
		String DisDateAndTime = discdate+" "+discDateTime;
		System.out.println(DisDateAndTime);	
		
		
		
	}
	
	public static void main(String[] args) {
		
	
	DateAndTime();
	
		
	}
	
	
	

}
