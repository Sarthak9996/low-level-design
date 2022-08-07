package pl.parking.lot;

import java.util.Date;
import java.util.List;
import java.util.Map;

class ParkingLot {
	List<ParkingFloor> parkingFloors;
	List<Entrance> entrances;
	List<Exit> exits;

	Address address;

	String parkingLotName;

	public boolean isParkingSpaceAvailable(Vehicle vehicle) {
		return false;
	}

	public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, int gateID) {
		return false;
	}
}

class ParkingFloor {
	int levelId;
	boolean isFull;

	List<ParkingSpace> parkingSpace;

	ParkingDisplayBoard parkingDisplayBoard;
}

class Gate {
	int gateId;
	ParkingAttendant parkingAttendant;
}

class Entrance extends Gate {
	public ParkingTicket getParkingTicket(Vehicle vehicle) {
		return null;
	}
}

class Exit extends Gate {
	public ParkingTicket payForParking(ParkingTicket parkingTicket, PaymentType paymentType) {
		return parkingTicket;
	}
}

class Address {
	String country;
	String state;
	String city;
	String area;
	String street;
	int pinCode;
}

class ParkingSpace {
	int spaceId;
	boolean isFree;
	double costPerHour;
	Vehicle vehicle;
	ParkingSpaceType parkingSpaceType;
}

//enum Vehicle{
//	
//}
//
enum ParkingSpaceType {
	BIKE_PARKING, CAR_PARKING, TRUCK_PARKINGS;
}

class ParkingDisplayBoard {
	Map<ParkingSpaceType, Integer> freeAvailableMap;

	public void updateFreeSlotsAvailable(ParkingSpaceType parkingSpaceType, int spaces) {
	}
}

class Account {
	String name;
	String email;
	String password;
	String empId;
	Address address;
}

class Admin extends Account {
	public boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor parkingFloor) {
		return false;
	}

	public boolean addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace) {
		return false;
	}
}

class ParkingAttendant extends Account {
	Payment paymentService;

	public boolean processVehicleEntry(Vehicle vehicle) {
		return false;
	}

	public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {
		return null;
	}

}

class Vehicle {
	String licenseNumber;
	VehicleType vehicleType;
	ParkingTicket parkingTicket;
	PaymentInfo paymentInfo;
}

class ParkingTicket {
	int ticketId;
	int levelId;
	int spaceId;
	Date vehicleEntryDateTime;
	Date vehicleExitDateTime;
	ParkingSpaceType parkingSpaceType;
	double totalCost;
	ParkingTicketStatus parkingTicketStatus;

	public void updateTotalCost() {
	}

	public void updateVehicleExitTime(Date vehicleExitTime) {
	}
}

enum PaymentType {
	CASH, CREDIT_CARD, DEBIT_CARD, UPI;
}

class Payment {
	public PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType) {
		return null;
	}
}

class PaymentInfo {
	double amount;
	Date paymentDate;
	int transactionId;
	ParkingTicket parkingTicket;
	PaymentStatus paymentStatus;
}

enum PaymentStatus {
	UNPAID, COMPLETED, PENDING, DECLINED, CANCELLED, REFUNDED;
}

enum ParkingTicketStatus {
	PAID, ACTIVE;
}

enum VehicleType {
	BIKE, CAR, TRUCK
}