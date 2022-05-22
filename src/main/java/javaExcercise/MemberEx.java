package javaExcercise;;

public class MemberEx {

	public static void main(String[] args) {
		Member user1 = new Member("Adam", "user1id123");
		user1.setPassword("user1pw12345"); // 패스워드 생성 
		user1.setAge(35); // 나이 정보 추가 
		user1.getAge("user1id123"); // 나이 정보 출력. 
		user1.login("user1id12", "user1pw12345"); // 잘못된 아이디 입력.
		user1.login("user1id123", "user1pw12"); // 잘못된 비밀번호 입력. 
		user1.login("user1id123", "user1pw12345"); // 올바른 로그인 정보 입력. 
		user1.getPassword("user1id123"); // 비밀번호 힌트 출력. 
		user1.logout("user1id123"); // 로그아웃 
		
		System.out.println();
		
		Member user2 = new Member("Paul", "user2id123");
		user2.setPassword("user2pw123"); // 패스워드 생성 
		user2.setAge(34); // 나이 정보 추가 
		user2.getAge("user2id123"); // 나이 정보 출력. 
		user2.login("user1id12", "user1pw123"); // 잘못된 아이디 입력.
		user2.login("user1id123", "user1pw12"); // 잘못된 비밀번호 입력. 
		user2.login("user2id123", "user2pw123"); // 올바른 로그인 정보 입력. 
		user2.getPassword("user1id123"); // 비밀번호 힌트 출력. 
		user2.logout("user2id123"); // 로그아웃 
		
	}

}
