package oop;

public class car {

		private int wheels;
		
		private int large_;// Largo y ancho
		private int width_;
		
		private int motor;
		private int mass_chasis;
		
		private String color;
		private int net_mass;
		private boolean leather_seats;
		
		public car() {
			wheels= 4;
			large_=2000;//[cm]
			width_=300;//[cm]
			motor=1600;//[cm**2]
			mass_chasis=500;//[kg]
		}
	public String get_general_data() {
		return "The whole vehicle has "+ wheels +" wheels"
		+". In addition, it has a length of "+large_/1000+
		" meters and width of "+width_+" cm. It has a mass"
		+ " chasis of "+mass_chasis+" kg";
	}
	
	//public String get_large() {//Getter
		//return "The large of car is "+ large_;
	
	
	public void set_color(String car_color) {//Setter
		//color="blue";
		color= car_color;
	}
	
	public String get_color() {
		return "The color car is "+ color;
	}
	public void seats_configuration(String seats) {
		//this.seats=seats;
		if(seats=="yes") {
			this.leather_seats=true;
			
		}else {
			this.leather_seats=false;
		}
	}
	public String get_leather_seats() {//Getter
		if(leather_seats==true) {
			return "The car has leather seats";
		
		}else {
			return "The car hasn't leather seats";
		}
	}
}


