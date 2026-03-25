package ex04;

class Pet {
	String name;
	void	eat() {
		System.out.println(name + "(이)가 먹는다");
	}
}
class Dog extends Pet { // Dog = Pet + Dog
	void	bark() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Pet{ // Cat = Pet + Cat
	void	meow() {
		System.out.println(name + "(이)가 야옹");
	}
}

class Tiger extends Pet {
	void 	cry(){
		System.out.println(name + "(이)가 어흥");
	}
	
}


public class TestAnimalInherit {

//상속 : Inherit / Java 에서는 Extends
//다중상속 불가능(상속은 한개만 가능) - Java. C++
	public static void main(String[] args) {
		
//가능
//		System.out.println("==========");
//		pet = dog;
//		pet.eat();
//		
				
		Dog dog = new Dog();
		work(dog,"츄");
//		dog.name = "chu";
//		dog.eat();
//		dog.bark();
		System.out.println("==========");
		
		Cat cat = new Cat();
		work(cat,"네로");
//		cat.name = "nero";
//		cat.eat();
//		cat.meow();
		System.out.println("==========");
		
		
		Tiger tiger = new Tiger();
		work(tiger, "큰냥이");
		System.out.println("==========");
		
		
		Pet pet = new Pet() ;
		pet.name = "뻐끔이";
		pet.eat();
		System.out.println("==========");
		
		//pet.bark();    - error
		//pet.meow();    - error
	}
	
	
//qkqdjq2
// 한개의 work() 함수로 업무를 처리한다
	private static void work(Pet pet, String name) {
		pet.name = name;
		System.out.println("Work : ");
		pet.eat();
		
		if( pet instanceof Dog )
			((Dog) pet).bark();
		if( pet instanceof Cat)
			((Cat) pet).meow();
		if( pet instanceof Tiger)
			((Tiger) pet).cry();
	
}

	
	
/*	 / 
	private static void work(Cat nero, String name) {
		nero.name = name;
		System.out.print("work:");
		nero.eat();
		nero.meow();		
	}

	private static void work(Dog dog, String name) {
		dog.name = name;
		System.out.print("work:");
		dog.eat();
		dog.bark();
	}
*/

}
