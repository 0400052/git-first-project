package demo;

public class TestClass {
	
	public static void main(String[] args) {
		System.out.println("Hello Guardians");
		
		
		String name = "ahmad ghafoor";
		String allUpperCase = name.toUpperCase();
		
		int indexOfSpace = allUpperCase.indexOf(" ");
		
		String lastName = name.substring(indexOfSpace);
		String firstName = name.substring(0, indexOfSpace);
		
		String fullName = firstName + lastName;
		String nameUpperCase = fullName.toUpperCase();
		
		System.out.println(nameUpperCase);
		
		
		
		
		
		
	}

}
