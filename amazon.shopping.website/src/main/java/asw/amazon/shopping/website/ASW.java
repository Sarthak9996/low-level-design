package asw.amazon.shopping.website;

import java.util.Date;
import java.util.List;

class Customer {
	ShoppingCart cart;
	Search searchObj;
	int customerId;

	public ShoppingCart getShoppingCart(int customerId) {
		return cart;
	}

	public void addItemsToShoppingCart(Item item) {
	}

	public void updateItemToShoppingCart(Item item) {
	}

	public void removeItemToShoppingCart(Item item) {
	}
}

class Guest extends Customer {
	public Account createNewAccount() {
		return null;
	}
}

class User extends Customer {
	Account account;

	public Account getAccount() {
		return account;
	}
}

class Seller extends User {
	public void addProduct(Product product) {
	}
}

class Buyer extends User {
	Order orderObj;

	public void addReview(ProductReview review) {
	}

	public OrderStatus placeOrder(ShoppingCart cart) {
		return null;
	}
}

class Account {
	String name;
	String email;
	String phoneNumber;
	String userName;
	String password;

	List<Address> shippingAddress;
	AccountStatus accountStatus;

	public String getEmail() {
		return email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}

class Address {
	int pinCode;
	String street;
	String area;
	String city;
	String state;
	String country;
}

enum AccountStatus {
	ACTIVE, INACTIVE, BLOCKED;
}

class ShoppingCart {
	List<Item> items;
	double cartValue;

	public void addItem(Item item) {
	}

	public void updateItem(Item item) {
	}

	public void deleteItem(Item item) {
	}

	public void checkoutItems() {
	}

	public List<Item> getItems() {
		return items;
	}

	public double getCartValue() {
		return cartValue;
	}

}

class Item {
	Product product;
	int quantity;
}

class Product {
	int productId;
	String productDescription;
	String productName;
	ProductCategory productCategory;
	Seller seller;
	double cost;
	List<ProductReview> productReview;
}

enum ProductCategory {
	ELECTRONICS, FURNITURE, GROCERY, BOOKS, MOBILE;
}

class ProductReview {
	String details;
	Buyer reviewer;
	int rating;
}

class Search {
	public List<Product> searchByName(String name) {
		return null;
	}

	public List<Product> searchByCategory(ProductCategory productCategory) {
		return null;
	}
}

class Order {
	int orderId;
	List<Item> orderItems;
	double orderValue;
	Buyer buyer;
	Date orderDate;
	NotificationService notificationService;
	List<OrderLog> orderLog;

	public OrderStatus placeOrder() {
		return null;
	}

	public OrderStatus trackOrder() {
		return null;
	}

	public void addOrderLogs() {
	}

	public PaymentStatus makePayment(PaymentType paymentType) {
		return null;
	}
}

enum OrderStatus {
	PACKED, SHIPPED, ENROUTE, OUT_FOR_DELIVERY, DELIVERED, CANCELLED
}

enum PaymentStatus {
	SUCCESS, CANCELLED, ERROR, REFUND_INITIATED, REFUNDED;
}

enum PaymentType {
	CREDIT_CARD, DEBIT_CARD, NET_BANKING, UPI, CASH_ON_DELIVERY
}

class OrderLog {
	String orderDetails;
	Date createdDate;
	OrderStatus status;
}

class NotificationService {
	public boolean sendNotification(NotificationDomain notificationDomain) {
		Notification notificationObject;
		MessageAttribute messageAttribute;

		switch (notificationDomain.getNotificationType()) {
		case EMAIL:
			notificationObject = new EmailNotification();
			messageAttribute = new MessageAttribute("abc@abc.com", notificationDomain.getUser().getAccount().getEmail(),
					"Order Detail...");
			break;
		case WHATSAPP:
			notificationObject = new WhatsappNotification();
			messageAttribute = new MessageAttribute("9888888888",
					notificationDomain.getUser().getAccount().getPhoneNumber(), "Order Detail ...");
			break;
		default:
			notificationObject = new SMSNotification();
			messageAttribute = new MessageAttribute("988888888",
					notificationDomain.getUser().getAccount().getPhoneNumber(), "Order Detail ...");
			break;
		}
		return notificationObject.sendNotification(messageAttribute);
	}
}

class NotificationDomain {
	String notificationId;
	NotificationType notificationType;
	User user;

	public NotificationType getNotificationType() {
		return notificationType;
	}

	public User getUser() {
		return user;
	}
}

class MessageAttribute {
	String to;
	String from;
	String message;

	public MessageAttribute(String from, String to, String message) {
		this.from = from;
		this.to = to;
		this.message = message;
	}
}

enum NotificationType {
	EMAIL, WHATSAPP, SMS
}

interface Notification {
	boolean sendNotification(MessageAttribute messageAttribute);
}

class EmailNotification implements Notification {
	public boolean sendNotification(MessageAttribute messageAttribute) {
		return false;
	}
}

class WhatsappNotification implements Notification {
	public boolean sendNotification(MessageAttribute messageAttribute) {
		return false;
	}
}

class SMSNotification implements Notification {
	public boolean sendNotification(MessageAttribute messageAttribute) {
		return false;
	}
}
