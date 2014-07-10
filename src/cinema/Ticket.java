package cinema;

public class Ticket {
	private int id;
	private Hall hall;
	private Hour hour;
	private int x;
	private int y;
	Ticket(int id, Hall salon, Hour hour, int x, int y){
		this.id=id;
		this.hall = salon;
		this.hour =hour;
		this.x=x;
		this.y=y;
	}
	public int getId() {
		return id;
	}
	public Hall getSalon() {
		return hall;
	}
	public Hour getHour() {
		return hour;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
}


