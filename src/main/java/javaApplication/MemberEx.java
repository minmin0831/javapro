package javaApplication;

public class MemberEx {

	public static void main(String[] args) {
		// Member 객체 생성. 
		Member member = new Member("john1234", "John Doe", "ab1111", 22);
		memberPrint(member);
		
		// copy 변수를 만드는 이유는 해당 member 의 필드 정보가 변경될 때 마다 새로운 copyMember 에 저장하여 기록을 보관하기 위함이다.
		Member copyMember = member.getMember();
		
		copyMember.pw = "ab3333";
		memberPrint(copyMember);
	}
	public static void memberPrint(Member obj) {
		System.out.println("Member Information ");
		System.out.println("ID : " + obj.id);
		System.out.println("Name : " + obj.name);
		System.out.println("Password : " + obj.pw);
		System.out.println("Age : " + obj.age);
		System.out.println("-------------------");
	}

}
