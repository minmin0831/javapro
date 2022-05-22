package javaExcercise;

public class PrinterEx {

	public static void main(String[] args) {
		/*
		 * Printer 클래스의 메서드들을 void로만 선언하였다. static 키워드를 void 앞에 달아주면 객체 선언없이도 println() 메서드를 호출할 수 있다. 
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("Legend");
		*/
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("Legend");

	}

}
