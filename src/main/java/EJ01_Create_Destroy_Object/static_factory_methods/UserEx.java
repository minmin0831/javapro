package EJ01_Create_Destroy_Object.static_factory_methods;

public class UserEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User("Minseok", "minseok@gmail.com", "South Korea");
		User user2 = User.createWithDefaultCountry("Minseok2", "minseok2@gmail.com");
		System.out.println(user.getName());
		System.out.println(user2.getName());
		
		// improved user instance
		User user3 = User.createWithLoggedInstantiationTime("Minseok3", "minseok3@gmail.com", "South Korea");
	}

}
