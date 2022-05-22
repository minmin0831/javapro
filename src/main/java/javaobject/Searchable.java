package javaobject;

// 검색 인터페이스 
public interface Searchable {
	
	// 추상 메서드 (인터페이스를 만들면 자동적으로 모든 메서드는 추상 메서드화 되어 있기 때문에 abstract 를 붙여줄 필요가 없다. default, static 은 보이지 않는 abstract 를 대체하는 키워드)
	void search(String url);
}
