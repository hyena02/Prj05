package ex03;

class Dog {
	String name;
	void	eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void	bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}
class Cat {
	String name;
	void 	eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void	meow() {
		System.out.println(name + "(이)가 야옹");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		// new Dog() 생성자 호출 문장-> 생성자가 없다..? => 자바가 '기본 생성자'를 생성해준다.(필수요소)
		// 오버로드 된 생성자 있으면 안 만들어줌 ..
		Dog	chu = new Dog();	
		chu.name = "츄";
		chu.eat();
		chu.bark();
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();
	}

}
