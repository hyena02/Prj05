package ex06;


class Duck {
	void swim() {
		System.out.println("헤엄 침");
	}
}
//너구리 - 코드없는 함수로 구현
//모든 항목이 abstract 인 abstract class 는 interface 문법으로 변경이 가능하다
//extends 클래스 implements 는 interface1, interface2, ... 가
/*
abstract class Racoon {		
	abstract void dig ();	
}
*/
interface Racoon {
	void dig();
}// 다중상속 구현가능

// 오리너구리 = 오리 + 너구리
// class DuckRacoon extends Duck, Racoon { // 다중 상속 불가능 에러}
class DuckRacoon extends Duck implements Racoon {

	@Override
	public void dig() {
		System.out.println("땅 팜");
	}	
}


public class TestDuckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
	}
}
