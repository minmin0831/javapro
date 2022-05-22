package javaobject;

public class RectangleEx {

	public static void main(String[] args) {
		int area;
		
		try {
			Rectangle green = new Rectangle(20, 30);
			
			green.setWidth(-30); // 객체에 접근이 불가하기 때문에 setter를 호출하여 너비값을 수정한다. 다만 여기서도 음수가 들어갈 수 있기 때문에 class 파일에서 setWidth 메서드에 예외처리를 해주어야 한다. 
			area = green.getArea();
			System.out.println("사각형의 너비 : " + green.getWidth()); 
			// Rectangle 클래스에 access controller 인 private을 삽입하면 실행 파일에서 해당 데이터에 접근할 수 없기 때무에 The field Rectangle.width is not visible 와 같은 메시지가 나온다. 
			System.out.println("사각형의 높이 : " + green.getHeight());
			System.out.println("사각형의 면적 : " + area);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
