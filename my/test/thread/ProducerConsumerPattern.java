package my.test.thread;

import java.util.LinkedList;

public class ProducerConsumerPattern {

	public static void main(String args[]) {

		// Creating shared object
		LinkedList<Order> products = new LinkedList<Order>();

		// Creating Producer and Consumer Thread
		Thread prodThread = new Thread(new Producer(products));

		Thread consThread = new Thread(new Consumer(products));

		// Starting producer and Consumer thread
		prodThread.start();
		consThread.start();
	}
}

// Producer Class in java
class Producer implements Runnable {
	private final LinkedList<Order> producerList;

	public Producer(LinkedList<Order> prodList) {
		this.producerList = prodList;
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			try {
				Order o = new Order(i, i * 10, "order" + i);
				producerList.add(o);
				System.out.println("Prducer: RemainingElements: " + producerList.size());
			} catch (Exception ex) {
			}
		}
	}
}

// Consumer Class in Java
class Consumer implements Runnable {

	private final LinkedList<Order> consumerList;

	public Consumer(LinkedList<Order> cList) {

		this.consumerList = cList;

	}

	@Override
	public void run() {
		while (true) {
			try {
				Order o = (Order)consumerList.removeFirst();
				System.out.println("Consumed: " + o);
				System.out.println("Consumer: RemainingElements: " + consumerList.size());
			} catch (Exception ex) {
			}
		}
	}
}

class Order {

	private int orderId;
	private int amount;
	private String customer;

	public Order(int orderId, int amount, String customer) {
		this.orderId = orderId;
		this.amount = amount;
		this.customer = customer;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	 @Override
	    public String toString(){
	        return String.valueOf(orderId+" "+ amount + " " + customer);
	    }
}
