interface Vehicle {
	public void start();
	public void stop();
	public void switchGear(String gear);
}

class BatMobile implements Vehicle {
	@Override
	public void start(){
		System.out.println("BatMobile Started");
	}

	@Override
	public void stop(){
		System.out.println("BatMobile Stoped");
	}

	@Override
	public void switchGear(String gear){
		System.out.println("BatMobile  gear switching to "+gear);
	}
}

class BatPod implements Vehicle {
	@Override
	public void start(){
		System.out.println("BatPod Started");
	}

	@Override
	public void stop(){
		System.out.println("BatPod Stoped");
	}

	@Override
	public void switchGear(String gear){
		System.out.println("BatPod  gear switching to "+gear);
	}
}

class TheBat implements Vehicle {
	@Override
	public void start(){
		System.out.println("The Bat Started");
	}

	@Override
	public void stop(){
		System.out.println("The Bat Stopped");
	}

	@Override
	public void switchGear(String gear){
		System.out.println("The Bat  gear switching to "+gear);
	}
}

abstract class BatRemoteController {
	Vehicle vehicle;

	BatRemoteController(Vehicle vehicle){
		this.vehicle = vehicle;
	}

	void turnOn(){
		this.vehicle.start();
	}

	void turnOff(){
		this.vehicle.stop();
	}

	void changeGear(String gear){
		this.vehicle.switchGear(gear);
	}
}


class BatController extends BatRemoteController{

	BatController(Vehicle vehicle){
		super(vehicle);
	}

	void setGear(String gear){
		changeGear(gear);
		System.out.println("BatControl was used to Change Gear");
	}
}

class Main {
	public static void main(String[] args){
		Vehicle vehicleOne = new BatMobile();
		Vehicle vehicleTwo = new BatPod();
		Vehicle vehicleThree = new TheBat();
		
		BatController controller = new BatController(vehicleOne);
		controller.turnOn();
		controller.setGear("4");
		controller.setGear("Neutral");
		controller.turnOff();
		
		System.out.println();
		
		controller = new BatController(vehicleTwo);
		controller.turnOn();
		
		System.out.println();
		
		controller = new BatController(vehicleThree);
		controller.turnOn();
	}
}