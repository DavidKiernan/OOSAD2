public class CategoryB implements SalaryCalculator{
	

	final static double commission = 0.02;
	double salesAmt, baseSalary;

	public CategoryB(double sa, double base){

		salesAmt = sa;
		baseSalary = base;
	}

	public double getSalary(){

		return(baseSalary +(commission * salesAmt));
	}
}
