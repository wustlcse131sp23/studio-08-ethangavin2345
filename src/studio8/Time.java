package studio8;


public class Time {

	private int hour;
	private int minute; 
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute; 	
    }

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Time d = new Time(1,1);
		Time w = new Time(4,20);
	}
		
		

}