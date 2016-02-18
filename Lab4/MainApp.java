public class MainApp{
	public static void main(String [] args){

		SalaryCalculator c = new CategoryA(1000, 200);
		Employee e = new Employee("Jennifer", c);
	
		e.display();
		
		c = new CategoryB(2000, 800);
		e = new Employee ("Shania",c);
		e.display();
	
	}
}
