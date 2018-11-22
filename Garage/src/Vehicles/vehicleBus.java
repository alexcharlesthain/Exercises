package Vehicles;

public class vehicleBus extends vehicleGarage {

//////////////attributes///////////////
	String Brand;
	String Model;

/////////////constructors/////////////

	public vehicleBus(String vBrand, String vModel) {
		
		super(vBrand, vModel);
		
		String First;
		this.Brand = First;
		String BendyBus;
		this.Model = BendyBus;		

	}
	
	public vehicleBus(vehicleBus vvehicleBus) {
		super(vvehicleBus.getBrand(), vvehicleBus.Brand);
		
////////////methods//////////////////

	}

	private Object getBrand() {
		Object First = null;
		return First;
		
	}

	
	public String toString() {
		return "This Bus is a "+this.getBrand()+" and its model is a "+this.Model;
		
	}
}
