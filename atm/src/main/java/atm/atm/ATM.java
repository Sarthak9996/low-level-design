package atm.atm;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.security.auth.login.AccountException;

class ATM {
	int atmId;

	Address location;
	CashDispenser cashDispenser;
	Screen screen;
	CardReader cardReader;
	Keypad keypad;
	CashDeposit cashDeposit;
	ChequeDeposit chequeDeposit;

	BankService bankService;
}

class Address {
	int pinCode;
	String street;
	String area;
	String city;
	String state;
	String country;
}

class CashDispenser {
	Map<CashType, List<Cash>> cashAvailable;

	public void dispenseCash(int amount) {
	}
}

enum CashType {
	FIFTY, HUNDRED, FIVEHUNDRED;
}

class Cash {
	CashType cashType;
	String serialNumber;
}

class Screen {
	public void display(String message) {
	}
}

class CardReader {
	public CardInfo fetchCardDetails() {
		return null;
	}
}

class CardInfo {
	CardType cardType;
	Bank bank;
	String cardNumber;
	Date expiryDate;
	int cvv;
	float withdrawLimit;
}

enum CardType {
	CREDIT_CARD, DEBIT_CARD
}

class Keypad {
	public String getInput() {
		return null;
	}
}

class Bank {
	String name;
	Address location;

	List<ATM> atmList;
}

interface BankService {
	public Boolean isValidUser(String pin, CardInfo cardInfo);

	public Customer getCustomerDetails(CardInfo cardInfo);

	public TransactionDetail executeTransaction(Transaction transaction);
}

class BankA implements BankService {

	public Boolean isValidUser(String pin, CardInfo cardInfo) {
		return null;
	}

	public Customer getCustomerDetails(CardInfo cardInfo) {
		return null;
	}

	public TransactionDetail executeTransaction(Transaction transaction) {
		return null;
	}
}

class BankB implements BankService {

	public Boolean isValidUser(String pin, CardInfo cardInfo) {
		return null;
	}

	public Customer getCustomerDetails(CardInfo cardInfo) {
		return null;
	}

	public TransactionDetail executeTransaction(Transaction transaction) {
		return null;
	}
}

class BankServiceFactory {
	public BankService getBankServiceObject(CardInfo cardinfo) {
		return null;
	}
}

class Customer {
	String firstName;
	String lastName;
	CardInfo cardInfo;
	Account account;

	BankService bankService;

	CustomerStatus customerStatus;
}

class Account {
	String accountNumber;
	Float availableBalance;
}

enum CustomerStatus {
	BLOCKED, ACTIVE, CLOSED
}

class Transaction {
	Integer transactionId;
	String sourceAccount;
	Date transactionDate;
}

class Deposit extends Transaction {
	float amount;
}

class ChequeDeposit extends Deposit {
	public Cheque getCheque() {
		return null;
	}
}

class CashDeposit extends Deposit {
	public List<Cash> getCash() {
		return null;
	}
}

class Cheque {
	String bankName;
	// other things present in cheque
}

class Withdraw extends Transaction {
	float amount;
}

class Transfer extends Transaction {
	String destinationAccount;
	float amount;
}

class TransactionDetail {
	int transactionId;

	TransactionStatus transactionStatus;
	String sourceAccountNumber;
	Date transactionDate;
	TransactionType transactionType;

}

enum TransactionStatus {
	PENDING, CANCELLED, SUCCESS, ERROR;
}

enum TransactionType {
	WITHDRAW, DEPOSIT, TRANSFER;
}