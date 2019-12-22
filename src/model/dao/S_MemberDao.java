package model.dao;





import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import model.vo.C_Member;



public class S_MemberDao {
	private String id;
	private char[] password2;
	private String nickName;
	private String email;
	private String name;
	private String birthday;
	private int point;
	private String wathced;
	
	public void basicMember() {

		
		
		
		
	}
	
	public void writeMember() {
		
		ObjectOutputStream objOut = null;
		
	

		try {
			objOut = new ObjectOutputStream(new FileOutputStream("회원가입", false));
		

			objOut.flush();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				objOut.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
	}
	
	

}
