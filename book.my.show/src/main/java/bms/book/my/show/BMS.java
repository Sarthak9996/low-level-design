package bms.book.my.show;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class BMS {
	List<CinemaHall> cinemas;

	public List<Movie> getMovies(Date date, String city) {
		return null;
	}

	public List<CinemaHall> getCinemaHall(String city) {
		return null;
	}
}

class CinemaHall {
	int cinemaHallId;
	String cinemaHallName;

	Address address;

	public Map<Date, Movie> getMovies(List<Date> dateList) {
		return null;
	}

	public Map<Date, Show> getShows(List<Date> dateList) {
		return null;
	}
}

class Address {
	int pin;
	String street;
	String area;
	String city;
	String state;
	String country;
}

class Audi {
	int audiId;
	String audiName;
	int totalSeats;
	List<Show> shows;
}

class Show {
	int showId;
	Movie movie;
	Date startTime;
	Date endTime;
	CinemaHall cinemaPlayedAt;
	List<Seat> seats;
}

class Seat {
	int seatId;
	SeatType seatType;
	SeatStatus seatStatus;
	Double price;
}

enum SeatType {
	DELUX, VIP, ECONOMY, OTHER;
}

enum SeatStatus {
	BOOKED, AVAILABLE, RESERVED, NOT_AVAILABLE;
}

class Movie {
	String movieName;
	int movieId;
	int durationInMins;
	String language;
	Genre genre;
	Date releaseDate;
	Map<String, List<Show>> cityShowMap;
}

enum Genre {
	SCIFI, ROMCOM, HORROR, ACTION, ROMANTIC, DRAMA;
}

class User {
	int userId;
	Search searchObj;
}

class SystemMember extends User {
	Account account;
	String name;
	String email;
	Address address;
}

class Member extends SystemMember {
	public Booking makeBooking(Booking booking) {
		return booking;
	}

	public List<Booking> getBooking() {
		return null;
	}
}

class Admin extends SystemMember {
	public boolean addMovie(Movie movie) {
		return false;
	}

	public boolean addShow(Show show) {
		return false;
	}
}

class Account {
	String userName;
	String password;
}

class Search {
	public List<Movie> searchMovieByName(String name) {
		return null;
	}

	public List<Movie> searchMovieByGenre(Genre genre) {
		return null;
	}

	public List<Movie> searchMovieByLanguage(String language) {
		return null;
	}

	public List<Movie> searchMovieByDate(Date releaseDate) {
		return null;
	}
}

class Booking {
	String bookingId;
	Date bookingDate;
	Member member;
	Show show;
	Audi audi;
	BookingStatus bookingStatus;
	double totalAmout;
	List<Seat> seats;
	Payment paymentObj;

	public boolean makePayment(Payment payment) {
		return false;
	}

}

enum BookingStatus {
	REQUESTED, PENDING, CONFIRMED, CANCELLED
}

class Payment {
	double amount;
	Date paymentDat;
	int transactionId;
	PaymentStatus paymentStatus;
}

enum PaymentStatus {
	COMPLETED, DECLINED, PENDING, CANCELLED, UNPAID, REFUNDED;
}
