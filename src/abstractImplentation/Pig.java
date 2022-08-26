package abstractImplentation;

public class Pig extends Animal {
	String sound;
	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public Pig(String sound) {
		setSound(sound);
	}

	@Override
	String makeSound() {
		// TODO Auto-generated method stub
		return sound;
		
	}
	
	@Override
	void eat() {
		System.out.println("I am eating grass");
	}
	

}
