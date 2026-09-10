abstract class Animal {
	public abstract void animalSound();
	public void  sleep() {
		system.out.println("zzz");
	}
}
class Pig extends Animal {
	public void animalSound() {
		system.out.println("The pig says: wee wee");
	}
}
class Main {
	public static void main(string [] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}