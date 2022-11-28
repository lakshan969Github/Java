 package strategyDesign;

interface FlyBehaviour{
	void fly();
}

interface SpeakBehaviour{
	void speak();
}

class speakLoudly implements SpeakBehaviour{
	public void speak() {
		System.out.println("Speak Loudly");
	}
}

class speakShowly implements SpeakBehaviour{
	public void speak() {
		System.out.println("Speak slowly");
	}
}



class FlyWithWings implements FlyBehaviour{
	public void fly() {
		System.out.println("Fly with wings");
	}
}
class FlyNoWay implements FlyBehaviour{
	public void fly() {
		System.out.println("Fly No way");
	}
}
class FlyFaster implements FlyBehaviour{
	public void fly() {
		System.out.println("Fly faster");
	}
}

class Bird{
	FlyBehaviour flyBehaviour;
	SpeakBehaviour speakBehaviour;
	
	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setSpeakBehaviour(SpeakBehaviour speakBehaviour) {
		this.speakBehaviour = speakBehaviour;
	}
	
	void performFly() {
		this.flyBehaviour.fly();
	}
	
	void performSpeak() {
		this.speakBehaviour.speak();
	}
}

public class Strategy {
	
	
	public static void main(String[] args) {
		
		Bird bird = new Bird();
		
		FlyBehaviour flyBehaviour = new FlyNoWay();
		bird.setFlyBehaviour(flyBehaviour);
		bird.performFly();
		
		bird.setFlyBehaviour(new FlyWithWings());
		bird.performFly();
		
		bird.setFlyBehaviour(new FlyFaster());
		bird.performFly();
		
		bird.setSpeakBehaviour(new speakLoudly());
		bird.performSpeak();
		
		bird.setSpeakBehaviour(new speakShowly());
		bird.performSpeak();

	}

}
