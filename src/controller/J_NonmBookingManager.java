package controller;

import java.util.Date;

import model.dao.J_NonmBookingDao;
import model.vo.J_NonmBooking;

public class J_NonmBookingManager {
	
	private String nonmName;		//비회원 이름
	private int nonmPhone;			//비회원 전화번호
	private int nonmBirthday;		//비회원 생년월일(19세금) getter, setter 추가해야 함
	private String movie_title;		//상영 영화 제목
	private Date schedule_date;		//상영 시간
	private int seat;				//좌석
	private J_NonmBookingDao nbd = new J_NonmBookingDao();
	
	public J_NonmBookingManager(String nonmName, int nonmPhone, int nonmBirthday, String movie_title
			, Date schedule_date, int seat) {
		this.nonmName = nonmName;
		this.nonmPhone = nonmPhone;
		this.nonmBirthday = nonmBirthday;
		this.movie_title = movie_title;
		this.schedule_date = schedule_date;
		this.seat = seat;
	}
	
	public void nonmBook() {
		
		J_NonmBooking nb = new J_NonmBooking();
		
		nbd.insertNonmBooking(nb);
		
		
	}

}
