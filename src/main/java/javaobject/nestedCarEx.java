package javaobject;

public class nestedCarEx {

	public static void main(String[] args) {
		NestedCar myCar = new NestedCar();
		NestedCar.Tire myTire = myCar.new Tire();
		NestedCar.Engine myEngine = new NestedCar.Engine(); // 외부에 있는 클래스가 해당 클래스에 고정된 것이다. 
	}

}
