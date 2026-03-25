package ex05;

abstract class Pet { // 한 개의 abstract method 가 있으면 abstract class 로 만들어야 한다.
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹음");
	}
	abstract void sound(); // 함수의 {}가 없으면 abstract 필수 
}//abstract class
class Dog extends Pet {
// 코딩이 없는 함수를 상속받으면 반드시 자식이 코딩을 구현해야한다. - 재정의
// Add Unimplemented Method
	@Override // 기능 재정의
	void sound() {  
		 System.out.println(name + "(이)가 멍");
		
	}	
}//class Dog

class Cat extends Pet {

	@Override
	void sound() {
		System.out.println(name + "(이)가 냥");
		
	}
}//class Cat
public class TestAnimal {

	public static void main(String[] args) {
		
//		Pet pet = new Pet(); 	//abstract 가 있으면 new 가 불가능하다.
		
		Dog dog1 = new Dog();
		work(dog1, "츄");
		//dog1.name = "츄";
		//dog1.eat();
		//dog1.sound();
		
		Cat cat1 = new Cat();
		work(cat1, "네로");
		//cat1.name = "네로";
		//cat1.eat();
		//cat1.sound();

	}//main
	

//----------------------------------------------------
// 방법 2: work 한개로 통일
// 부모 클래스는 자식 클래스를 담을 수 없다. 	
//		Pet pet = new Pet();  Dog dog = pet;  ==> 오류 
// 자식 클래스는 부모 클래스를 담을 수 있다.
// 		Pet pet = dog1;
	
	private static void work(Pet pet, String name) {
		pet.name = name;
		pet.eat();
		pet.sound();
	}
//----------------------------------------------------
/*	
// 방법 1 : 함수의 오버로드 기능 활용
	private static void work(Dog dog1, String name) {
		dog1.name = name;
		dog1.eat();
		dog1.sound();
		
	}

	private static void work(Cat cat1, String name) {
		cat1.name = name;
		cat1.eat();
		cat1.sound();
		
	}
*/
//----------------------------------------------------
	
	
}//class TestAnimal
