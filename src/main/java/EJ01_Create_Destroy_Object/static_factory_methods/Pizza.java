package EJ01_Create_Destroy_Object.static_factory_methods;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

// 계층적으로 설계된 클래스와 잘 어우리는 빌더 패턴 
public abstract class Pizza {
	
	public enum Topping {
		HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
	}
	
	final Set<Topping> toppings;
	
	// 해당 Builder를 상속하 클래스가 Builder 클래스를 여러 형태의 데이터 타입으로 정의할 수 있도록 
	// abstract로 추상화 하였고, 
	// T로 타입에 대한 형변환 부담을 없애놓았다. 
	abstract static class Builder<T extends Builder<T>> {
		
		// 추상 클래스이기 때문에 별도의 Builder 메서드를 생성하지 않았다. 
		
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
		
		// 생성자로는 누릴 수 없는 사소한 이점으로, 빌더를 이용하면 '가변인수(variable args; varargs)' 매개 변수를 여러 개 사용할 수 있다. 
		// 
		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping)); 
			// EnumSet 객체의 add 메서드를 이용하여 addTopping으로 받아온 인수를 Builder 객체의 멤버 변수인 toppings 초기값으로 저장한다. 
			return self(); 
		}
		
		// build와 self 메서드는 override를 허용하고자 abstract 메서드로 남겨놓았다. 
		// build를 overriding 하는 하위 클래스에서 상위 클래스의 메서드(해당 build 메서드)가 정의한 반환 타입이 아닌,
		// 그 하위 타입을 반환하는 기능을 '공변 반환 타이핑(covariant return typing)'이라 한다. 
		// 이러한 기능을 이용하면 클라이언트가 형변환에 신경 쓰지 않고도 빌더를 사용할 수 있다. 
		abstract Pizza build();
		
		// Java에서는 self 타입이 없기 때문에, 시뮬레이트한 self 타입 관용구를 코딩하였다. 
		// 하위 클래스는 이 메서드를 재정의(Overriding)할 때, 꼭 "this"를 반환하도록 해야 한다.
		// 이로써 하위 클래스에서 형변환 없이도 method chaining을 지원할 수 있다. 
		protected abstract T self();
	}
	
	Pizza(Builder<?> builder) {
		toppings = builder.toppings.clone(); // shallow copy를 통해 builder에서 생성한 값으로 Pizza 객체를 초기화한다. 
	}

	public Set<Topping> getToppings() {
		return toppings;
	}
	
}
