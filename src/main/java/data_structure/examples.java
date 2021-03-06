package data_structure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class examples {

	public static void main(String[] args) {
		/*
		 * java.util
		 * 
		 * name: ArrayList
		 * 
		 * methods:
		 * void clear()		- 리스트의 모든 내용을 제거(청소)한다. 
		 * int size() 		- 리스트에 저장된 객체의 수
		 * void add(T) 		- 객체를 리스트에 넣는다. 
		 * T get(index) 	- 리스트에 index 번째의 객체를 반환한다. 
		 * void remove(int index) - index 번째의 객체를 삭제한다. 
		 * void remove(T obj) - obj 객체를 삭제한다.
		 * 		- int와 같은 기본형 데이터(String 까지 포함)를 삭제할 때는 remove() 메서드는 autoboxing 처리를 한다. 
		 * 		- Object 를 지정하여 삭제하고 싶다면, new Integer(2), new String("KIM") 과 같이 객체 타입으로 넣어 autoboxing 을 제거해주어야 한다.  
		 * 		- Iterator<T> 의 T iterator() 메서드를 이용하여 ArrayList<T> arrlist 에 저장된 객체를 제거하려면, ArrayList 의 remove() 가 아닌 Iterator 의 remove() 를 이용하여 객체를 제거하야 한다.
		 * 
		 * */
		
		ArrayList<Geo> geolist = new ArrayList<Geo>();
		geolist.clear();
		geolist.add(new Geo.Builder(37.5670, 126.9807).build()); // removed
		geolist.add(new Geo.Builder(38.999, -23.00987).build());
		geolist.add(new Geo.Builder(138.3336, -0.000223).build()); // removed
		geolist.add(new Geo.Builder(12.97528, 157.0784).build());
		geolist.add(new Geo.Builder(96.6654, 58.66945).build()); // removed
		geolist.add(new Geo.Builder(77.5846, 87.6954).build()); // removed
		
		System.out.println(geolist.size());
		
		Geo gt = geolist.get(1);
		System.out.printf("Latitude: %f, Longitude: %f \n", gt.getLatitude(), gt.getLongitude());
		
		System.out.println("geolist Before");
		for(int i=0; i<geolist.size(); i++) {
			System.out.printf("Latitude: %f, Longitude: %f \n", geolist.get(i).getLatitude(), geolist.get(i).getLongitude());
		}
		
		geolist.remove(0); // removed 37.5670, 126.9807
		
		for(int i=0; i<geolist.size(); i++) {
			if(geolist.get(i).getLatitude() > 90) {
				geolist.remove(i);
				// removed 138.3336, -0.000223
				// removed 96.6654, 58.66945
			}
		}
		
		//Geo target = new Geo.Builder(77.5846, 87.6954).build(); // this object is not the same as the one in geolist ArrayList. 
		Geo target = geolist.get(2); // only the same object from the same ArrayList can be removed.
		System.out.printf("Target to remove: %f, %f \n", target.getLatitude(), target.getLongitude());
		System.out.println("Removed target " + geolist.remove(target)); // removed 77.584600, 87.695400
		
		System.out.println("geolist After ArrayList remove() method");
		for(int i=0; i<geolist.size(); i++) {
			System.out.printf("Latitude: %f, Longitude: %f \n", geolist.get(i).getLatitude(), geolist.get(i).getLongitude());
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(101);
		numbers.add(200);
		numbers.add(301);
		numbers.add(400);
		
		System.out.println("ArrayList Before: " + numbers);
		
		Iterator<Integer> itr = numbers.iterator();
		
		while(itr.hasNext()) {
			Integer number = itr.next();
			
			if(number % 2 == 0) {
				//numbers.remove(number); // ConcurrentModificationException due to a call to remove() from ArrayList
				itr.remove();
			}
		}
		
		System.out.println("ArrayList After: " + numbers); 
		
		
		
		/*
		 * java.util
		 * 
		 * name: HashMap
		 * 
		 * methods:
		 * void clear()				- 맵의 모든 내용을 제거한다. 
		 * int size()				- 맵에 저장된 객체의 수
		 * void put(key, value)		- (key, value) 한 쌍으로 맵에 저장한다. 같은 키값은 저장하지 않는다.
		 * value get(key)			- 맵에서 키를 이용하여 밸류를 얻는다.
		 * boolean containsKey(key) - 맵에 키가 이미 있는지 확인한다. 같은 키가 있다면 true 이다. 
		 * void remove(Object key, Object value): removes the mapping and returns the value
		 * 		- key: remove the mapping specified by this key
		 * 		- value (optional): removes the mapping only if the specified key maps to the specified value.
		 * 		- returns the previous value associated with the specified key
		 * 		- true is the mapping is removed
		 * 
		 * */
		
		HashMap<String, Geo> cities = new HashMap<String, Geo>();
		cities.put("Korea",  new Geo.Builder(37.5670, 126.9807).build());
		cities.put("Austria",  new Geo.Builder(47.01, 10.2).build());
		cities.put("US",  new Geo.Builder(40.714086, -74.228697).build());
		cities.put("Mexico",  new Geo.Builder(19.42847, -99.12766).build());
		cities.put("China",  new Geo.Builder(39.9075, 116.39723).build());
		cities.put("Russia",  new Geo.Builder(55.75222, 37.61556).build());
		
		System.out.println(cities.size());
		System.out.println(cities.containsKey("Austria"));
		Geo geo = cities.get("Austria");
		System.out.printf("%s: latitude = %f, longitude = %f \n", "Austria", geo.getLatitude(), geo.getLongitude());
		
		// key와 value 모두 접근하여 출력해보기 
		
		System.out.println("print all: " + cities); // 키는 정상 출력되지만, 값은 객체 저장 주소가 출력되는 것을 확인할 수 있다.
			
		Set<String> keySet = cities.keySet(); // 일단은 cities HashMap에서 각각의 키값을 Set 로 옮겨 놓는다.
		System.out.println("keySet elements: " + keySet);
		// 요소 값에 따른 정렬을 자동으로 하게 된다. 때문에 실제 cities 라는 HashMap 내의 배열 순서와 상이할 수 있다.
		
		String[] keyArray = keySet.toArray(new String[keySet.size()]);
		System.out.println("keyArray elements: " + Arrays.toString(keyArray));
		for(int i=0; i<keyArray.length; i++) {
			System.out.printf("keySet: %s \n", keyArray[i]);
		}
		
		for(int i=0; i<keyArray.length; i++) { // keySet은 unordered 리스트이기 때문에, 인덱스로 value에 접근할 수가 없다. 
			String key = keyArray[i];
			if(cities.containsKey(key)) {
				String country = key;
				System.out.printf("country: %s, geo: latitude - %f / longitude - %f \n", key, cities.get(key).getLatitude(), cities.get(key).getLongitude());
			}
			
		}
		
		// remove Korea
		Geo value = cities.remove("Korea"); // 
		System.out.printf("removed value: %f, %f \n", value.getLatitude(), value.getLongitude());
		
		for(int i=0; i<keyArray.length; i++) { 
			// keySet은 unordered 리스트이기 때문에, 인덱스로 value에 접근하려면 keyArray를 사용하던지 LinkedHashSet 이나 List 를 사용한다.
			// 다만 Set 을 LHS 으로 변환하려면 형변환을 해야 하는데, 형변환시 HashMap.keySet은 LinkedHashSet으로 변환할 수 없다는 에러가 발생한다. 
			String key = keyArray[i];
			if(cities.containsKey(key)) {
				String country = key;
				System.out.printf("country: %s, geo: latitude - %f / longitude - %f \n", key, cities.get(key).getLatitude(), cities.get(key).getLongitude());
			}
			
		}
		
		// 객체 지향의 주요 특징 
		
		// overloading: call showGeoByObj() method
		Geo newGeo = new Geo.Builder(37.5670, 126.9807).build();
		Geo.showGeoByObj(newGeo);
		
		Geo.showGeoWithCountryByHashMap(cities, keyArray); // 앞서 사용하던 HashMap<String, Geo> cities 객체와 key만 따로 모아놓았던 String[] keyArray 배열 객체를 인수로 보낸다. 
		
		Geo.showGeoByArrayList(geolist); // 앞서 제거한 좌표만 빼고 남은 좌표 반환. 
		
		// Generics
		ArrayList<Geo> geolist2 = new ArrayList<Geo>(); // Geo 타입만 저장 가능
		geolist2.add(new Geo.Builder(37.5670, 126.9807).build());
		Geo gt2 = geolist.get(0); // index 0번째 객체를 가져온다. 
		System.out.printf("Generics		) lanitude: %f, longitude: %f", gt.getLatitude(), gt.getLongitude());
		
		// Date Conversion
		
		// long
		long millis = System.currentTimeMillis();
		int days = (int)(millis/1000/24/60/60); // 1970.1.1 부터 며칠 
		System.out.println("days	) " + days);
		
		// Calendar
		Calendar cal = Calendar.getInstance(); // 오늘 
		Date cd = cal.getTime();
		System.out.println("cd	)" + cd);
		long cl = cal.getTimeInMillis();
		System.out.println("cl	) " + cl);
		cal.set(2016, 10, 5); // 2016.11.5 을 세팅한다. 
		Date tomorrow = new Date(millis + 24*60*60*1000); // tommorow
		System.out.println("tomorrow	) " + tomorrow);
		cal.setTime(tomorrow);
		
		// Date
		Date toDate = new Date(); // today
		Date tomorrow2 = new Date(millis + 24*60*60*1000); // tommorow
		Date dl = cal.getTime();
		
		// String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String time = sdf.format(toDate);
		try {
			Date dtime = sdf.parse("2016-09-11");
			System.out.println("dTime 	)" + dtime);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}




















