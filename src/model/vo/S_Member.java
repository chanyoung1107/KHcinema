package model.vo;

import java.io.Serializable;

public class S_Member implements Serializable {
	
	/**
	 * s
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private char[] password;
	private String nickname;
	private String email;

	
	public S_Member() {}
	
	public S_Member(String id, char[] password, String nickname, String email) {
		super();
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.email = email;

	}




	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
