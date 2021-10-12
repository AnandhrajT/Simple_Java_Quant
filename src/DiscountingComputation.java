
public class DiscountingComputation {
	
	public static void main(String[] args) 
	{
		double Amount_Needed =1000000;
		double RateOfInterest=7.5;
		int TimePeriod = 35;
		
		double Invested=  Amount_Needed /(Math.pow((1 + RateOfInterest / 100), TimePeriod));
		
		System.out.println("Amount Needed in xx years   :  " + "$ " + Amount_Needed);
		System.out.println("Rate of Interest            :  " + RateOfInterest + " %");
		System.out.println("Today's Date                :  " + java.time.LocalDate.now());
		System.out.println("Amount to be invested today :  " +  String.format("%.2f",Invested));
	}
}
