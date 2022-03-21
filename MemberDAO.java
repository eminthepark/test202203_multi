package annotation.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dao") // dao 객체 생성
public class MemberDAO {
	@Autowired // 멤버 dto가 있으면 연결해 주어라! setter injection <property....
	@Qualifier("dto4") // 현재 dto 객체 4개인데 사용할 dto객체 알려줌
	MemberDTO dto; 

//	public void setDto(MemberDTO dto) { //<property name="dto" .... -> @autowired
//		this.dto = dto;
//	} 
	
	public boolean selectMember(){
		if(dto.getId().equals("eastsea") && dto.getPassword().equals("1234")) {
			return true; 
		}
		return false;
	}
	
	public void insertMember() {
		System.out.println(dto.getId() + " 회원님 정상적으로 회원가입 되셨습니다.");
	}
		
}

