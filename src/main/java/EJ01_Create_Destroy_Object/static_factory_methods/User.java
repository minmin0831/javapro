package EJ01_Create_Destroy_Object.static_factory_methods;

import java.time.LocalTime;
import java.util.logging.*;


public class User {
	private static final Logger LOGGER = Logger.getLogger(User.class.getName());
	private final String name;
	private final String email;
	private final String country;
	
	public User(String name, String email, String country) {
		this.name = name;
		this.email = email;
		this.country = country;
	}
	
	// it is a logic that logs the time at which every User object is created.
	// we should not add logic to the constructor. If we add it, we will be breaking the Single Responsibility Principle. 
	// we would end up with a monolithic constructor that does a lot more than initialize fields.
	public static User createWithLoggedInstantiationTime(
			String name, String email, String country) {
		// code logics
		LOGGER.log(Level.INFO, "Creating User instance at : {0}", LocalTime.now());
		// and return the object to instantiate
		return new User(name, email, country);
	}
	
	public String getName() {
		return name;
	}



	public String getEmail() {
		return email;
	}



	public String getCountry() {
		return country;
	}



	public static User createWithDefaultCountry(String name, String email) {
		return new User(name, email, "South Korea");
	}
	
	
}
