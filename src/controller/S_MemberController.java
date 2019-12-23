package controller;

import model.dao.S_MemberDao;
import model.vo.C_Member;





public class S_MemberController {
		
	S_MemberDao md = new S_MemberDao();
	//Dao객체 생성//


//DAO에서 넘어온 객체 고객 정보
public void memberSignIn(String id, String password, String name,String birthday, String email) 
{
	
}	
			
//유저PASS
	public void setUserPass() {
	

	
	
	}
	//이메일이 맞는지확인
public void correctEmail() {
		
	
	
}
//이메일 찾기
	public String findId(String email) {
		return email;
		
	}
	
//ID확인
	public boolean idCheck(String id) {
		return false;
		
	} 

//PW확인
	public boolean passCheck(char[] password2, int passLength, String id) {
		return false;
	
		
	}
	
//만들어진 고객목록
	public C_Member[] makeMemberList() {
		return null;
		
	}
//로그인 ID
	public void loginMember(String id) {
	
	}
//로그아웃
	public void logoutMember() {
		
	
		
	}
//고객삭제
	public void deleteMember(C_Member m) {
		
}
}