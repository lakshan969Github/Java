package commandDesign;

interface Light{
	void on();
	void off();
}

class livingRoomLight implements Light{
	
	public void on() {
		System.out.println("Living  room light on");
	}
	
	public void off() {
		System.out.println("Living  room light off");	
	}
}

class BedRoomLight implements Light{
	
	public void on() {
		System.out.println("Bed room light on");
	}
	
	public void off() {
		System.out.println("Bed room light off");	
	}
}




interface Command{
	void execute();
}

class OnCommand implements Command{
	
	Light light;
	
	public OnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}
	
	
}

class OffCommand implements Command{
	
	Light light;
	
	public OffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
	
	
}

//invoker
class Remote{
	Command onCommand;
	Command offCommand;
	
	void setCommand(Command onCommand, Command offCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	void onButtonPushed() {
		onCommand.execute();
	}
	
	void offButtonPushed() {
		offCommand.execute();
	}
	
}

//main class
public class CommandD{

	public static void main(String[] args) {
		
		Remote remote = new Remote();
		
		Light livingRoomLights = new livingRoomLight();
		Light bedRoomLights = new BedRoomLight();
		
		Command onCommandlivingRoomLight = new OnCommand(livingRoomLights);
		Command offCommandlivingRoomLight = new OffCommand(livingRoomLights);
		Command onBedRoomLight = new OnCommand(bedRoomLights);
		Command offBedRoomLight = new OffCommand(bedRoomLights);
		
		
		remote.setCommand(onCommandlivingRoomLight, offCommandlivingRoomLight);
		remote.onButtonPushed();
		remote.offButtonPushed();
		
		remote.setCommand(onBedRoomLight, offBedRoomLight);
		remote.onButtonPushed();
		remote.offButtonPushed();
		
		
	}

}
