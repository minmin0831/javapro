package javaobject;

public class AbstractEx1 {

	public static void main(String[] args) {
		Tiger hodol = new Tiger();
		Eagle doksuri = new Eagle();
		
		hodol.age = 5;
		doksuri.home = "소나무둥지";
		
		hodol.move();
		
		doksuri.move();
		
	}

}
