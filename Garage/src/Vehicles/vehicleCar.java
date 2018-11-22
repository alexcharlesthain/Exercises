package Vehicles;

public class vehicleCar extends vehicleGarage {

	//////////////attributes///////////////
	
	String Brand;
	String Model;
	
	/////////////constructors/////////////
	
	public vehicleCar(String vBrand, String vModel) {
		
		super(vBrand, vModel);
		
		String BMW;
		this.Brand = BMW;
		String M4;
		this.Model = M4;		
	

	}

	public vehicleCar(vehicleCar vvehicleCar) {
		super(vvehicleCar.getBrand(Brand),vvehicleCar.Brand);
		
	}
	////////////methods//////////////////

	private Object getBrand() {
		Object BMW = null;
		return BMW;
	}


	public String toString() {
		return "This Car is a "+this.getBrand()+" and its model is a "+this.Model;



}
