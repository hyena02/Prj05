package ex07;

interface Duck{
	void swim();
}
interface Racoon {
	void dig ();
}
class DuckRacoon implements Duck, Racoon {

	@Override
	public void dig() {
		System.out.println("땅팜");
	}

	@Override
	public void swim() {
		System.out.println("어푸어푸");
		
	}
	
}


public class TestDuckRacoon {

	public static void main(String[] args) {
		
		// . 으로 접근 -> field, method 만
		// Java 는 하나만 상속할수 있다. 
		// object 는 항상 상속받을 수 있음. 

		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
		System.out.println( dr.toString() );
		System.out.println( dr.hashCode() );	
		System.out.println( dr.getClass() ); 
		
		// 모든 Java 의 class 는 Object class 를 상속받아서 만들어졌다. - extend 안써도 상속받음
		Object	obj	= new Object();
		System.out.println( obj.toString() ); // java.lang.Object@14dad5dc(16진수)
		System.out.println( obj.hashCode() ); // 349885916 heap 메모리의 위치
		System.out.println( obj.getClass() ); // class java.lang.Object
		
	}

}
