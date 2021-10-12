
public class InterestCalculation {

	public static void main(String[] args)
	{
		double Principal = 32.00;
		double RateOfInterest = 7.75;
		int Day = 30;
		double Simple_Interest;
		double Compound_Interest;
		
		Simple_Interest = (Principal * RateOfInterest * Day) / 100;
		Compound_Interest = Simple_Interest * Math.pow(1.0 + RateOfInterest/100,Day)-Simple_Interest;
		
		System.out.println("Principal                        :" + "$" + Principal);
		System.out.println("Rate of interest                 :" + RateOfInterest + "%");
		System.out.println("Today's Date                     :" + java.time.LocalDate.now());
		System.out.println("Amount at maturity               :" + String.format("%.4f",Simple_Interest));
		System.out.println("Amount at maturity (compounding) :" + String.format("%.4f",Compound_Interest));
	}
}
