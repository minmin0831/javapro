package EJ01_Create_Destroy_Object.static_factory_methods;

public class NutritionFactsEx {

	public static void main(String[] args) {
		// 아래와 같이 클라이언트에서 호출이 가능하다. 
		NutritionFacts cocaCola = new NutritionFacts.Builder(250, 8)
				.calories(100).sodium(35).carbohydrate(27).build();
		
		// Builder Pattern은 파이썬과 스칼라에 있는 '명명된 선택적 매개변수(named optional parameters)'를 흉내 낸 것이다. 
		
		System.out.println(cocaCola.getServingSize());
		System.out.println(cocaCola.getServings());
		System.out.println(cocaCola.getCalories());
		System.out.println(cocaCola.getFat());
		System.out.println(cocaCola.getSodium());
		System.out.println(cocaCola.getCarbohydrate());
	}

}
