package reserve;

public class Booking {

	// a. 날짜 
	private String date;
	// b. 상영관 /시간
	// 분리 해야되는거 아닌가???
	
	// c. 좌석
	private String seat;
	// d. 예매성공여부?

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}
	
	
	
}
