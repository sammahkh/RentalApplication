package rentalapp;

public class CreditCard implements PaymentMethod {

	@Override
	public void  processPayment() {
		System.out.println("Processing payment through  CreditCard");		
	}

}
