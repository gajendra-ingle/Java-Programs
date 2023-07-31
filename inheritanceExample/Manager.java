package inheritanceExample;

public class Manager extends Worker {
	String workSpelization = "UI/UX Developer";
	String deparement = "Desiginer";
	
	void assign() {
		sName = "Gaurav";
		age = 22;
		phoneNo = 95523604;
		address = "At Post Makodi";
		salary = 70000;
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
		Manager obj = new Manager();
	
		obj.assign();
		obj.displayData();
		obj.displaySalary();
		

	}
}
