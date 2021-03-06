package EJ01_Create_Destroy_Object.static_factory_methods;

public class NutritionFacts {
	private final int servingSize; // final을 붙여 불변으로 정의하였기 때문에 initial value가 저장되면 이후로 변경이 불가한 변수가 된다. 
	private final int servings; // 따라서 불변 변수는 setter 정의가 불가하다. 
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	// Builder 객체 
	public static class Builder {
		// 필수 매개변수
		private final int servingSize;
		private final int servings;
		
		// 선택적 매개변수 - 기본값으로 초기화한다.
		private int calories 		= 0;
		private int fat 			= 0;
		private int sodium 			= 0;
		private int carbohydrate 	= 0;
		
		// Builder 생성자 (정적 팩토리)
		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}
		
		public Builder calories(int val) { // Builder를 데이터 타입으로 갖는 이유는 method chaining 을 위해 Builder 객체를 반환해야 하기 때문이다. 
			calories = val;
			return this; // Builder의 setter들은 Builder 자신을 반환하기 때문에 연쇄적으로 호출할 수 있다. 이런 방식을 메서드 호출이 흐르듯 연결된다는 뜻으로 Fluent API 또는 method chaining 이라 한다. 
		}
		
		public Builder fat(int val) {
			fat = val;
			return this;
		}
		
		public Builder sodium(int val) {
			sodium = val;
			return this;
		}
		
		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}
		
		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}
	
	
	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}


	public int getServingSize() {
		return servingSize;
	}


	public int getServings() {
		return servings;
	}


	public int getCalories() {
		return calories;
	}


	public int getFat() {
		return fat;
	}


	public int getSodium() {
		return sodium;
	}


	public int getCarbohydrate() {
		return carbohydrate;
	}
	
	
}
