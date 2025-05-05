package polymorphism;

public class childClass extends parentClass {
	
	@Override// parent class method impletened in child class - method overriding - always from parent to child
	public void launchtheBrowser(String browsername) {
		System.out.println("Launch the browser" +browsername);
	}

	public void sumofNumbers(int a, int b) { //same name with different parameers - ex- sysem .ou.println- Stringx, object x, Char[] etc...- within same class
		System.out.println(a+b);
	}
	
	public void sumofNumbers(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {

		childClass obj = new childClass();
		obj.launchtheBrowser("Chrome");
		obj.sumofNumbers(10, 20);
	}

}
