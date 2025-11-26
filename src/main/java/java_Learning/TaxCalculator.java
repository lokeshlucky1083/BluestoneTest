package java_Learning;

public class TaxCalculator {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.TamilNaduTax();
		taxCalculator.TelanganaTax();
		taxCalculator.AndhraPradehsTax();


	}

	public void TamilNaduTax() {
		
		float baseprice = 1000; // Base cost of the product
		float cgstRate = 9;    // CGST percentage
		float sgstRate = 10;   // SGST percentage
		
		//Calculate CGST and SGST amounts
		float cgstamount = (baseprice + cgstRate)/100;
		float sgstamount = (baseprice + cgstRate)/100;
		
		//Calculate total price including GST
		float totalPrice = baseprice + cgstamount + sgstamount;
		System.out.println("Base price in (Including GST): " + totalPrice);
				
	}
	public void TelanganaTax() {
		
		float baseprice = 1000;
		float cgstRate = 14;
		float sgstRate = 12;
		float cgstamount = (baseprice + cgstRate)/100;
		float sgstamount = (baseprice + cgstRate)/100;
		float totalPrice = baseprice + cgstamount + sgstamount;
		System.out.println("Base price in (Including GST): " + totalPrice);
				
	}
	
	public void AndhraPradehsTax() {
		
		float baseprice = 1000;
		float cgstRate = 15;
		float sgstRate = 14;
		float cgstamount = (baseprice + cgstRate)/100;
		float sgstamount = (baseprice + cgstRate)/100;
		float totalPrice = baseprice + cgstamount + sgstamount;
		System.out.println("Base price in (Including GST): " + totalPrice);
				
	}
}
