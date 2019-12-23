package model.dao;





import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import model.vo.C_Member;



public class S_MemberDao {
	private String id;
	private String password;
	private String name;
	private String birthday;
	private String email;
	private int point;
	private String wathced;
	
	private char[] password2;//테스트용 계정
	
	public void basicMember() {

		
		
		
		
	}
	
	public void writeMember() {
		
		ObjectOutputStream objOut = null;
		
	

		try {
			objOut = new ObjectOutputStream(new FileOutputStream("Member_List", false));
		

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
