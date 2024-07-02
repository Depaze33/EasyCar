package fr.easycar.rental.easycar;

import java.time.LocalDate;

import fr.easycar.rental.easycar.MotorizedVehicule.FuelType;

public class EasyCarMain {

	public static void main(String[] args) {
		Bike bike1 = new Bike("Decathlon", "Super velo", "noir", LocalDate.of(2020, 3, 5), 10.50, 'L');
		Car car1 = new Car("Peugot", "208", "blanche", LocalDate.of(2014, 1, 1), 100.20, FuelType.DIESEL, 50, false, 4);
		Truck truck1 = new Truck("Mercedes","Van mercedes", "Gris", LocalDate.of(2025, 5, 5), 150.20, FuelType.DIESEL, 150, false, 8);
		// Skate skate1 = new Skate("Element", "Element", "Multi-color", LocalDate.ofYearDay(2024, 5), , 0)
		Customer client1 = new Customer("Liam", "Azari", "25 rue des champs ", "Bordeaux", "33000");
		Customer client2 = new Customer("Sara", "Azari", "25 rue des champs ", "Bordeaux", "33000");

		Reservation reservation1 = new Reservation(LocalDate.of(2024, 6, 20), LocalDate.of(2024, 7, 20), true,bike1);
		Reservation reservation2 = new Reservation(LocalDate.of(2024, 6, 20), LocalDate.of(2024, 7, 20), true,truck1);

	client1.addReservation(reservation1);
	client2.addReservation(reservation2);
	
	System.out.println(client1.totalMoneySpent());
	System.out.println(client2.totalMoneySpent());
	}

}
