package Vehicles;

public class vehicleMotorbike extends vehicleGarage {

//////////////attributes///////////////
	
	String Brand;
	String Model;

/////////////constructors/////////////

	public vehicleMotorbike(String vBrand, String vModel) {
	
		super(vBrand, vModel);
	
		String Yamaha = null;
		this.Brand = Yamaha;
		String MT10 = null;
		this.Model = MT10;		
	}

	public vehicleMotorbike(vehicleMotorbike vvehicleMotorbike) {	
		super(vvehicleMotorbike.getBrand(), vvehicleMotorbike.Brand);


////////////methods//////////////////

	}

	private Object getBrand() {
		Object Yamaha = null;
		return Yamaha;
	}
	
	
	public String toString() {
		return "This Motorbike is a "+this.getBrand()+" and its model is a "+this.Model;

	}
}