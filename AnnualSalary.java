public class AnnualSalary{
	public static void main (String [] args){
		int monthlySalary = 900;
		int monthlyTax = 81;
		int annualSalary = 12 * monthlySalary;
		int annualTax = 12 * 81;
		short myMoney = (short)(annualSalary - annualTax);
		System.out.println ("I get " + myMoney + "$ each year.");
		System.out.println ("The government gets " + annualTax + "$ each year.");	
	
	}

}