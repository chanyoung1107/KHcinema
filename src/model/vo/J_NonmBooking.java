package model.vo;

import java.util.Date;

public class J_NonmBooking {

	private String nonmName;		//비회원 이름
	private int nonmPhone;			//비회원 전화번호
	private int nonmBirthday;		//비회원 생년월일(19세금) getter, setter 추가해야 함
	private String movie_title;		//상영 영화 제목
	private Date schedule_date;		//상영 시간
	private int seat;				//좌석
	
	public J_NonmBooking() {}
	
	public J_NonmBooking(String nonmName, int nonmPhone, int nonmBirthday, String title, 
			Date schedule_date, int seat) {
		this.nonmName = nonmName;
		this.nonmPhone = nonmPhone;
		this.nonmBirthday = nonmBirthday;
		this.movie_title = title;
		this.schedule_date = schedule_date;
		this.seat = seat;
	}
	
	public String getNonmName() {
		return nonmName;
	}
	public int getNonmPhone() {
		return nonmPhone;
	}
	public int nonmBirthday() {
		return nonmBirthday;
	}
	public String getTitle() {
		return movie_title;
	}
	public Date getSchedule_date() {
		return schedule_date;
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
	public void setNonmBirthday(int nonmBirthday) {
		this.nonmBirthday = nonmBirthday;
	}
	public void setTitle(String movie_title) {
		this.movie_title = movie_title;
	}
	public void setShowTime(Date schedule_date) {
		this.schedule_date = schedule_date;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	@Override
	public String toString() { 
		return "User [nonmName=" + nonmName + ", nonmPhone=" + nonmPhone + "m nonmBirthday" + nonmBirthday
				+ ", movie_title=" + movie_title + ", schedule_date=" + schedule_date + ", seat=" 
				+ seat + "]";
	}

}
