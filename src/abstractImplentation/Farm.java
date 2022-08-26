package abstractImplentation;

public class Farm {

	public static void main(String[] args) {
		Animal pig = new Pig("qweqwe");
		System.out.println("I am a Pig, i am making sound " + pig.makeSound());
		pig.eat();
		
		
		Animal duck = new Duck("kweikwei");
		System.out.println("I am a duck, i am making sound "+duck.makeSound());
		duck.eat();
		
		
		

	}

}
