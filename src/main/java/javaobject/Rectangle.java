package javaobject;

public class Rectangle {
	private int width, height; 
	/* private 이라는 access controller 를 추가하여 객체의 데이터를 외부에서 접근할 수 없도록 한다. 무결(결함이 없는 성질) 을 지키기 위함. 
	 객체 외부에서 데이터에 접근하여 마음대로 해당 데이터를 읽고 변경하지 못하도록 하기 위함이다. 
	 변수 단계에서 캡슐화하였기 때문에 읽고 변경이 불가하기 때문에 그와 관련한 메서드도 작동하지 않는다. 
	 Getter 와 Setter 메소드 사용하여 무결성을 유지하면서도 접근이 제한된 필드를 이용하여 메서드를 실행시킬 수 있다. 	 
	*/ 
	
	// 생성자 : 객체를 생성할 때 초기화 역할을 담당한다. 
	public Rectangle (int width, int height) throws Exception {
		if(width <= 0 || height <= 0) {
			throw new Exception("너비와 높이는 양수 값이어야 합니다. ");
		}
		this.width = width;
		this.height = height;
	}
	
	// 사각형 면적을 구하는 메서드 
	int getArea() { // 메서드는 항상 파라미터가 있느라는 법은 없다. 
		return width * height;
	}
	
	// Sources > Generate Getters and Setters > 필드 선택 > Generate 하면 아래와 같이 getter 와 setter 가 자동 생성된다. 
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws Exception {
		if(width <= 0) {
			throw new Exception("너비는 양수 값이어야 합니다. ");
		}
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) throws Exception {
		if(height <= 0) {
			throw new Exception("높이는 양수 값이어야 합니다.");
		}
		this.height = height;
	}
	
	

}
