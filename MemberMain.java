package annotation.member;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMain {

	public static void main(String[] args) {
		// <방법1>non-spring
//		MemberDTO dto = new MemberDTO(); // member.xml���� <bean>
//		dto.setId("jsp"); // property setter
//		dto.setPassword("1234");
//		dto.setName("ȫ�浿");
//		dto.setPhone("010-1111-2222");
//		dto.setEmail("spring@io");
//		dto.setAddress("�����");
		
//		MemberDAO dao = new MemberDAO();
//		dao.setDto(dto);
//		boolean result = dao.selectMember();
//		if(result == true) {
//			System.out.println("���� �α��� ������Դϴ�.");
//		} else {
//			dao.insertMember();
//			
//		}
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("annotation/member/member.xml");
		
		int cnt = 0; 
		
		for(String n : factory.getBeanDefinitionNames()) {
			cnt ++; 
			System.out.println(cnt + "번째 객체정의명= " + n);
		}
		
		MemberDAO dao = (MemberDAO)factory.getBean("dao");
		boolean result = dao.selectMember();
		if(result == true) {
			System.out.println("정상 로그인 사용자입니다"); 
		} else {
			dao.insertMember();
			
		}
	}
}
