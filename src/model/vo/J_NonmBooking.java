package model.vo;

public class J_NonmBooking {

	private String nonmName;
	private int nonmPhone;
	private String title;
	private int showTime;
	private int seat;
	
	public J_NonmBooking() {}
	
	public J_NonmBooking(String nonmName, int nonmPhone, String title, int showTime, int seat) {
		this.nonmName = nonmName;
		this.nonmPhone = nonmPhone;
		this.title = title;
		this.showTime = showTime;
		this.seat = seat;
	}
	
	public String getNonmName() {
		return nonmName;
	}
	public int getNonmPhone() {
		return nonmPhone;
	}
	public String getTitle() {
		return title;
	}
	public int getShowTime() {
		return showTime;
	}
	public int getSeat() {
		return seat;
	}
	
	public void setNonmName(String nonmName) {
		this.nonmName = nonmName;
	}
	public void setNonmPhone(int nonmPhone) {
		this.nonmPhone = nonmPhone;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setShowTime(int showTime) {
		this.showTime = showTime;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	@Override
	public String toString() {
		return "User [nonmName=" + nonmName + ", nonmPhone=" + nonmPhone + ", title=" + title 
				+ ", showTime=" + showTime + ", seat=" + seat + "]";
	}

}
