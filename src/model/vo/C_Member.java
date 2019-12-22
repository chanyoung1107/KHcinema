package model.vo;

import java.io.Serializable;

public class C_Member implements Serializable{
	
	private String id;
	private String password;
	private String name;
	private String birthday;
	private String email;
	private int point;
	
	public C_Member() {}	//내가 본 영화 목록 추가

	public C_Member(String id, String password, String name,
				    String birthday, String email, int point) {
		this.id = id;					//회원 아이디
		this.password = password;		//회원 비밀번호
		this.name = name;				//회원 이름
		this.birthday = birthday;		//회원 생일(19금 영화 선별용)
		this.email = email;				//회원 이메일
		this.point = point;				//회원 포인트(영화 예매시 10%씩, 음식 주문시 10%씩 적립)
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	
}
