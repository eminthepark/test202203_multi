package annotation.member;

import org.springframework.stereotype.Component;

// 이미 xml파일에 memberDTO 객체 3개 bean 태그 사용하여 만들어 두었음. 
@Component // "memberDTO"이름으로 MemberDTO객체 생성 - 총 dto객체 4개 <bean id="memberDTO"... 이렇게 생성한 격
public class MemberDTO {
	String id, password, name, phone, email, address;

	MemberDTO(){}

	MemberDTO(String id, String password){
		this.id = id; 
		this.password = password; 
	}
	
	MemberDTO(String id, String password, String name, String phone, String email, String address){
		this.id = id; 
		this.password = password; 
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	} 
	
}
