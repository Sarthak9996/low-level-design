package lms.library.management;

import java.util.Date;
import java.util.List;

class Library {
	String name;
	Address location;
	List<BookItem> books;
}

class Address {
	int pinCode;
	String street;
	String area;
	String city;
	String state;
	String country;
}

class Book {
	String uniqueIdNumber;
	String title;
	List<Author> authors;
	BookType bookType;
}

class BookItem extends Book {
	String barcode;
	Date publicationDate;
	Rack rackLocation;
	BookStatus bookStatus;
	BookFormat bookFormat;
	Date issueDate;
}

enum BookType {
	SCIFI, ROMANTIC, FANTASY, DRAMA;
}

enum BookFormat {
	HARDCOVER, PAPERBACK, NEWSPAPER, JOURNAL;
}

enum BookStatus {
	ISSUED, AVAILABLE, RESERVED, LOST
}

class Rack {
	int number;
	String locationId;
}

class Person {
	String firstName;
	String lastName;
}

class Author extends Person {
	List<Book> booksPublished;
}

class SystemUser extends Person {
	String email;
	String phoneNumber;
	Account account;
}

class Member extends SystemUser {
	int totalBookeCheckedOut;

	Search searchObj;
	BookIssueService issueService;
}

class Librarian extends SystemUser {
	Search searchObj;
	BookIssueService issueService;

	public void addBookItem(BookItem bookItem) {
	}

	public BookItem deleteBookItem(String barcode) {
		return null;
	}

	public BookItem editBookItem(BookItem bookItem) {
		return bookItem;
	}
}

class Account {
	String userName;
	String password;
	int accountId;
}

class Search {
	public List<BookItem> getBookByTitle(String title) {
		return null;
	}

	public List<BookItem> getBookByAuthor(Author author) {
		return null;
	}

	public List<BookItem> getBookByType(BookType bookType) {
		return null;
	}

	public List<BookItem> getBookByPublicationDate(Date publishedDate) {
		return null;
	}

}

class BookIssueService {
	FineService fineService;

	public BookReservationDetail getReservationDetail(BookItem bookItem) {
		return null;
	}

	public void updateResetvationDetail(BookReservationDetail bookReservationDetail) {
	}

	public BookReservationDetail reserveBook(BookItem book, SystemUser user) {
		return null;
	}

	public BookIssueDetail issueBook(BookItem book, SystemUser user) {
		return null;
	}

	// this will internally call the issueBook function after basic validations
	public BookIssueDetail renewBook(BookItem book, SystemUser user) {
		return null;
	}

	public void returnBook(BookItem book, SystemUser user) {
	}
}

class BookLending {
	BookItem book;
	Date startDate;
	SystemUser user;
}

class BookIssueDetail extends BookLending {
	Date dueDate;
}

class BookReservationDetail extends BookLending {
	ReservationStatus reservationStatus;
}

enum ReservationStatus {
	RESERVED, NOT_RESERVED;
}

class FineService {
	public Fine calculateFine(BookItem book, SystemUser user, int days) {
		return null;
	}
}

class Fine {
	Date fineDate;
	BookItem book;
	SystemUser user;
	Double fineValue;
}
