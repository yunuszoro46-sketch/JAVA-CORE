package midexam25101109;

public class Employee {
	String empName;
	String empid;
	double salary;
	
	Employee(String empName, String empid, double salary){
		this.empName=empName;
		this.empid=empid;
		this.salary=salary;
	}
	
	public void displayinfo() {
		System.out.println("Name "+this.empName+"id "+this.empid+"salary"+this.salary);
	}

	public String getempName() {
	
		return this.empName;
	}

}
