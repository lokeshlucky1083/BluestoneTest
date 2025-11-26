package java_Learning;

public class SmartTaxCalculator {
	float cgstRate;
	float sgstRate;

	public static void main(String[] args) {
		SmartTaxCalculator tn = new SmartTaxCalculator(9, 10);
		tn.anyState();
		
		SmartTaxCalculator tg = new SmartTaxCalculator (14, 12);
		tg.anyState();
		
		SmartTaxCalculator ap = new SmartTaxCalculator (16, 14);
		ap.anyState();

	}
	
	public SmartTaxCalculator(float x, float y)
	{
		cgstRate = x;
		sgstRate = y;		
	}
		
	public void anyState() {
	float baseprice = 1000; // Base cost of the product
	
	//Calculate CGST and SGST amounts
	float cgstamount = (baseprice + cgstRate)/100;
	float sgstamount = (baseprice + cgstRate)/100;
	
	//Calculate total price including GST
	float totalPrice = baseprice + cgstamount + sgstamount;
	System.out.println("Base price in (Including GST): " + totalPrice);

}
	
}
