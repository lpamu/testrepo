package my.test.thread;

public class UnsyncBank {

	public static void main(String[] args) throws InterruptedException {
		Bank b = new Bank(NACCOUNTS+1, INITIAL_BALANCE);
		for (int i = 0; i < NACCOUNTS; i++){
			TransferRunnable r = new TransferRunnable(b, i, i+1, 500,
				INITIAL_BALANCE, true);
		t = new Thread(r);
		t.start();
		}
		/*TransferRunnable r2 = new TransferRunnable(b, 0, 2, 500,
				INITIAL_BALANCE, false);
		t1 = new Thread(r2);
		t1.start();*/
	}

	private static Thread t, t1;
	public static final int NACCOUNTS = 5;
	public static final double INITIAL_BALANCE = 10000;
}

class Bank {
	static java.lang.Object _mylock = new java.lang.Object();

	public Bank(int n, double initialBalance) throws InterruptedException {
		accounts = new double[n];
		for (int i = 0; i < accounts.length; i++)
			accounts[i] = initialBalance;
	}

	public void transfer(int from, int to, double amount, boolean flag)
			throws InterruptedException {

		boolean ind = false;
		System.out.println(Thread.currentThread() + "	: Transfer Started");

		synchronized (_mylock) {
			if (accounts[from] == 9500) {
				ind = true;
				System.out.println(Thread.currentThread()
						+ "	: I entered lock and started waiting :");
				wait();
				System.out.println(Thread.currentThread()
						+ "	: I entered lock and finished waiting :");

			}
			accounts[from] -= amount;
			accounts[to] += amount;
			System.out.println(Thread.currentThread() + "	: from :" + from+ " : to :" + to);
			System.out.println(Thread.currentThread()
					+ "	: Balance in Account[" + from + "] :" + accounts[from]);
			System.out.println(Thread.currentThread()
					+ "	: Balance in Account[" + to + "] :" + accounts[to]);
			System.out.printf(
					Thread.currentThread() + "	: Total Balance: %10.2f%n",
					getTotalBalance());
			System.out.println(Thread.currentThread() + "	: currentthread"
					+ Thread.currentThread());
			
			System.out.println(Thread.currentThread()
					+ "	: I about to exit the lock :");
			//Thread.sleep((int) (1000));
			if (ind) {
				notifyAll();
				System.out.println(Thread.currentThread() + "	: I notified :");
			}

		}

		System.out.println(Thread.currentThread() + "	: Transfer Complete");
	}

	public synchronized double getTotalBalance() {
		double sum = 0;
		for (double a : accounts)
			sum += a;
		return sum;
	}

	private final double[] accounts;
}

class TransferRunnable implements Runnable {
	public TransferRunnable(Bank b, int from, int to, int a, double max,
			boolean flag) {
		bank = b;
		fromAccount = from;
		toaccount = to;
		amt = a;
		maxAmount = max;
		m_flag = flag;
	}

	public void run() {
		try {

			int toAccount = toaccount;
			int amount = amt;
			bank.transfer(fromAccount, toAccount, amount, m_flag);
			Thread.sleep((int) (1000));
			bank.transfer(fromAccount, toAccount, amount, m_flag);
		} catch (InterruptedException e) {
		}
	}

	private Bank bank;
	private int fromAccount;
	private double maxAmount;
	private int toaccount;
	private int amt;
	private int DELAY = 10;
	boolean m_flag;
}
