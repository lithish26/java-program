interface Camera{
	void takePhoto();
}
interface MusicPlayer{
	void playMusic();
}
class Smartphone implements Camera, MusicPlayer{
	public void takephoto() {
		system.out.println("smartphone is taking a photo");
	}
	public void PlayMusic() {
		system.out.println("smartphone is playing music");
	}
	public void makeCall() {
		system.out.println("smartphone is making a call");
	}
}
public class MultipleInheritanceDemo3 
	public static void main(string[]args){
		smartphone phone = new smartphone
		phone.takePhone()
		phone.playMusic()
		phone.makeCall()
	}
}