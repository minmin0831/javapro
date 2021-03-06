package EJ01_Create_Destroy_Object.static_factory_methods;

public class PizzaCalzone extends Pizza {
	
	private final boolean sauceInside;
	
	public static class Builder extends Pizza.Builder<Builder> {
		
		private boolean sauceInside = false; // 기본값은 boolean 타입의 데이터이다. 
		
		// 구체 클래스이기 때문에 Builder를 정의해주었다. 필수 값으로 sauceInside를 인수로 받는다. 
		public Builder sauceInside() {
			sauceInside = true;
			return this;
		}
		
		@Override public PizzaCalzone build() {
			return new PizzaCalzone(this);
		}
		
		@Override protected Builder self() {
			return this;
		}
	}
	
	private PizzaCalzone(Builder builder) {
		super(builder);
		sauceInside = builder.sauceInside;
	}

	public boolean isSauceInside() {
		return sauceInside;
	}
	
}
