package rentalapp;

public class PayPal implements PaymentMethod {

	@Override
	public void processPayment() {
        System.out.println("Processing payment through  PayPal");
	}

	

}
