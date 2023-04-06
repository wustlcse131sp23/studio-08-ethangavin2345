package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) { 
		this.month = month; 
		this.day = day;
		this.year = year; 
	}
	
	
    @Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	public static void main(String[] args) {
		Date d = new Date(1,1,69);
		Date w = new Date(4,20,69);
		Date r = new Date(12, 3, 01);
		Date e = new Date(1, 10, 11);
		Date g = new Date(4, 30, 03);
		
		
		
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(d);
		list.add(w);
		list.add(r);
		list.add(e);
		list.add(g);
    	
		System.out.println(list);
    }


	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

}
