package Revision;
class Payment {
    public void pay() {
        System.out.println("General payment");
    }


}

class CreditCardPayment extends Payment {
	
	@Override
	public void pay()
	{
		System.out.print("teh credit card payment");
	}
}

class UPIPayment extends Payment {
	@Override
	public void pay()
	{
		System.out.print("teh UPIPayment card payment");
	}
}

public class Pay {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
       

        p1.pay();
        p2.pay();
        // TODO: Call pay() using both references
    }
}
