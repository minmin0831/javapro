package javaExcercise;

public class ShopServiceEx {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance(); 
		/* 
		getInstance() 메서드는 ShopService를 객체로 생성하지 못하도록 하기 위한 메서드이며, 
		이러한 메서드를 이용하여 유일한 클래스를 인스턴스화하여 내부 메서드를 사용할 수 있도록 한다. 
		 */
		
		ShopService obj2 = ShopService.getInstance(); 
		// 객체를 obj1에서 obj2로 이전하는 결과를 초래한다. 
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다. ");
		}else {
			System.out.println("다른 ShopService 객체입니다. ");
		}
	}

}
