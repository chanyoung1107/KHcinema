package controller;

import java.util.ArrayList;



import model.dao.S_MemberDao;
import model.vo.S_Member;





public class MemberController {
		
	S_MemberDao md = new S_MemberDao();
		


public void memberSignIn(String id, char[] pass, String nickName, String email) 
{
	
}	
			
	public void setUserPass(String id) {
	
	
	
	
	}
	
	public String findId(String email) {
		return email;
		
	}
	
	//���̵� üũ
	public boolean idCheck(String id) {
		return false;
		
	} 
	
	public boolean passCheck(char[] pass, int passLength, String id) {
		return false;
	
		
	}
	
	public S_Member[] makeMemberList() {
		return null;
		
	}
	
	public void loginMember(String id) {
	
	}//loadMemberEnd
	
	public void logoutMember() {
		
	
		
	}
	
	public void deleteMember(S_Member m) {
		
}//class end
}