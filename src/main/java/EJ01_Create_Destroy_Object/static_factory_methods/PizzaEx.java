package EJ01_Create_Destroy_Object.static_factory_methods;

import EJ01_Create_Destroy_Object.static_factory_methods.Pizza.Topping;
import EJ01_Create_Destroy_Object.static_factory_methods.Pizza.Topping.*;
import EJ01_Create_Destroy_Object.static_factory_methods.PizzaNy.Size;
import EJ01_Create_Destroy_Object.static_factory_methods.PizzaNy.Size.*;

public class PizzaEx {
	
	public static void main(String[] args) {
		
		PizzaNy NyPizza = new PizzaNy.Builder(PizzaNy.Size.SMALL) // 객체 초기값은 각각의 객체에 저장된 열거형 자료 중, 선택하고자 하는 데이터를 선택한다. 
				.addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
		
		PizzaCalzone CalzonePizza = new PizzaCalzone.Builder()
				.addTopping(Pizza.Topping.HAM).sauceInside().build();
		
		System.out.println(NyPizza.getSize());
		System.out.println(NyPizza.getToppings());
		
		System.out.println(CalzonePizza.isSauceInside());
		System.out.println(CalzonePizza.getToppings());
	}

}
