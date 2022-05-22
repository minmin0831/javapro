package javaApplication;

// Container 는 파라미터로 data type 을 정한다. 
public class Container<K, V> {
	// 필드 이름. 
	private K key;
	private V value;
	
	
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void set(K parameterKey, V parameterValue) {
		this.key = parameterKey;
		this.value = parameterValue;
	}
	
	
	
	

}
