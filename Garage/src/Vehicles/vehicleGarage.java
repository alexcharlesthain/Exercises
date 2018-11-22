package Vehicles;

public abstract class vehicleGarage {

	/////////////////attributes/////////////////
		private String Brand;
		private String Model;
		
		
	////////////////constructors///////////////
		
		public vehicleGarage(String vBrand) {
			this.Brand = vBrand;
			this.Model = vModel;
		}

		
		public vehicleGarage(String vBrand, String vModel) {
			this.Brand = vBrand;
			this.Model = vModel;
		}
		
	////////////////methods//////////////////	
		
		public void setModel(String vModel) {
				this.Model = vModel;
		}
}
