package studio8;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) { 
		this.date = date;
		this.time = time; 
		
		
	}
	
	public static void main(String[] args) {
		Time t = new Time(1,1);
		Time x = new Time(4,20);
		
		Date d = new Date(1,1,69);
		Date w = new Date(4,20,69);
		Date r = new Date(12, 3, 01);
		Date e = new Date(1, 10, 11);
		Date g = new Date(4, 30, 03);
		
	
		Appointment A = new Appointment(w, t);
		Appointment B = new Appointment(r, x);
		Appointment C = new Appointment(r, t);
		Appointment D = new Appointment(e, x);
	}
}


