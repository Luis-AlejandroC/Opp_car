package oop;

public class car_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car Renault= new car(); // Instance a class - Class example
		//System.out.println(Renault.get_large());
		
		//System.out.println("This car has "+Renault.wheels+" wheels");
		
		car Seat= new car();
		//Seat.set_color();
		Seat.set_color("Yellow");
		System.out.println(Seat.get_general_data());
		
		System.out.println(Seat.get_color());
		
		Seat.seats_configuration("no");
		System.out.println(Seat.get_leather_seats());
	}

}
