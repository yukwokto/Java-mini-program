
public interface Payme {
	// interface method
	double getPaymentAmount();
	
	// default interface method
	default void display() {
		System.out.println(toString());  // or this
	}
}

