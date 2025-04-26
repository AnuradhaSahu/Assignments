package nonAccessModifier;

public class staticNonAccessModifer {

	static String name ="ABC";
	
	public static int empId() {
		return 1234;
	}
	
	static int salary;
	//just a  block with out any method name
	{
		 salary=3000;
		 System.out.println(salary);
	}
	public static void main(String[] args) {
		
		//when static was not used we had to create object and then call 

		System.out.println(staticNonAccessModifer.name);
		System.out.println(staticNonAccessModifer.empId());// with out creating object we are able to call the methods and data from class

		System.out.println(staticNonAccessModifer.salary);
		
		//after creating object
		staticNonAccessModifer s = new staticNonAccessModifer();
		System.out.println(s.salary);
	}
	

}
