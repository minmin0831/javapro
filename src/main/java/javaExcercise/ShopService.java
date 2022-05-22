package javaExcercise;

public class ShopService {
	private static ShopService shopService = new ShopService(); // static이 붙으면 인스턴스화 되는 영역이 아니기 때문에, 호출 방법은 클래스 이름에 접근하여 해당 영역에 접근한다. 
	// Singleton 클래스인데, 이 경우 instance를 생성하는 영역을 실행 파일에서 클래스 파일 내부로 가져온 케이스이다. 
	
	// empty 생성자 생성 
	private ShopService() {
		
	}
	
	static ShopService getInstance() {
		return shopService; // getInstance() 메서드를 호출하면 shopService 인스턴스를 반환할 수 있도록 한다. 
	}
}
