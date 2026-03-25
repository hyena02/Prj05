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

public class TestAnimalInherit {
//상속 : Inherit / Java 에서는 Extends
//다중상속 불가능(상속은 한개만 가능) - Java. C++
	public static void main(String[] args) {
		Pet pet = new Pet();
		pet.name = "뻐끔이";
		pet.eat();
		
		Dog dog = new Dog();
		dog.name = "chu";
		dog.eat();
		dog.bark();
		
		Cat cat = new Cat();
		cat.name = "nero";
		cat.eat();
		cat.meow();
		
	}

}
