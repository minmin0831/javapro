package EJ01_Create_Destroy_Object.static_factory_methods;

import java.util.Objects;

// Pizza의 하위 클래
public class PizzaNy extends Pizza {
	
	public enum Size {
		SMALL, MIDIUM, LARGE
	}
	
	private final Size size;
	
	public static class Builder extends Pizza.Builder<Builder> {
		
		private final Size size;
		
		// 구체 클래스이기 때문에 Builder를 정의해주었다. 필수 값으로 size를 인수로 받는다. 
		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}
		
		@Override public PizzaNy build() {
			return new PizzaNy(this);
		}
		
		@Override protected Builder self() {
			return this;
		}
	}
	
	private PizzaNy(Builder builder) {
		super(builder);
		size = builder.size;
	}

	public Size getSize() {
		return size;
	}
	
}
