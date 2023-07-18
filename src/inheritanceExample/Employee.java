package inheritanceExample;

public class Employee extends Worker {

	String workSpelization = "Developer";
	String deparement = "Cyber Security";
	
	void assign() {
		sName = "Gajendra";
		age = 22;
		phoneNo = 86009740;
		address = "At Post Makodi";
		salary = 78000;
	}
	
	void displayData() {
		System.out.println("Name : "+sName);
		System.out.println("Age : "+age);
		System.out.println("Phone Number : "+phoneNo);
		System.out.println("Address : "+address);
		System.out.println("Work Spelization : "+workSpelization);
		System.out.println("Deparement : "+deparement);
		
	}
	public static void main(String[] args) {
		Employee obj =new Employee();
		
		obj.assign();
		obj.displayData();
		obj.displaySalary();
		
		
	}
}
