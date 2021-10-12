
public class FxCalculation {
	
	public static void main(String[] args)
	{
		int Amount=1000000;
		double USD_Amount = (Amount*100/7365);
		int Profit = 50;
		
		double Total= USD_Amount + Profit;
		double ExchangeRate = (( Total - USD_Amount  )/ USD_Amount * 100);
		
		System.out.println("Amount in Rs                     :" + "Rs." + Amount);
		System.out.println("Exchange Rate                    :" + String.format("%.2f", ExchangeRate));
		System.out.println("Profit in $                      :" + "$" + Profit);
		System.out.println("Amount to be paid by customer ($):" + "$" + String.format("%.2f", Total));
	}
}
