package model.vo;

import java.io.Serializable;

public class C_Member implements Serializable{
	
	private String id;
	private String password;
	private String name;
	private String birthday;
	private String email;
	private int point;
	private String wathced;
	
	private char[] password2; //테스트용 패스워드
	
	public C_Member(String id, String password, String name,
			  String birthday, String email, int point, String wathced) {
	
	this.id = id;
	this.password = password;
	this.name = name;
	this.birthday = birthday;
	this.email = email;
	this.point = point;
	this.wathced = wathced;
}
	
//테스트용 생성자//
	public C_Member(String id, char[] password2, String name,
			  String birthday, String email, String wathced) {
	
	this.id = id;
	this.password2 = password2;
	this.name = name;
	this.birthday = birthday;
	this.email = email;
	this.wathced = wathced;
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

	public String getWathced() {
		return wathced;
	}

	public void setWathced(String wathced) {
		this.wathced = wathced;
	}
	
//테스트용
	public char[] getPassword2() {
		return password2;
	}
//테스트용
	public void setPassword2(char[] password2) {
		this.password2 = password2;
	}
	
	
}
