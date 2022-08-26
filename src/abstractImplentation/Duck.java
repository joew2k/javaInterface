package abstractImplentation;

public class Duck extends Animal {
	String sound;

	public String getSound() {
		return sound;
	}
	
	

	public void setSound(String sound) {
		this.sound = sound;
	}
	public Duck(String sound) {
		setSound(sound);
	}

	@Override
	String makeSound() {
		// TODO Auto-generated method stub
		return sound;
		
	}
	

}
