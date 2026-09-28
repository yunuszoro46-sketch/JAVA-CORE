package midexam25101109;
import java.util.Scanner;
public class OfficeApp {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a Office name : ");
	String name;
	name = scanner.nextLine();
     Office ws = new Office(name);
     
     System.out.println("Enter employe name: ");
     String ename;
     ename= scanner.nextLine();
     System.out.println("Enter employe id: ");
     String eid ;
     eid= scanner.nextLine();
     System.out.println("Enter employe salary: ");
     double esalary;
     esalary=scanner.nextDouble();
     
     
     
    int option=-1;
    while(option!=0) {
    	System.out.println("1. Add an employee");
    	System.out.println("2. Search an employee");
    	System.out.println("3. Display employee");
    	System.out.println("0. Exit system");
    	
    	
    	System.out.println("Select an Option");
    	option=scanner.nextInt();
    	
    	
    	switch(option) {
    	case 1:
    		System.out.println("Enter employ name : ");
    		Employee ss = new Employee(ename,eid,esalary);
    	
    	    ws.addEmployee(ss);
    		break;
    		
    	case 2:
    		System.out.println("Display Employe");
    		
    		break;
    		
    	case 3:
    		System.out.println("All Employee");
    		ws.displayEmployees();
    		break;
    		
    	case 0:
    		System.out.println("Exit the system");
    		break;
    	default:
    		System.out.println("invalid Input");
    }
	

}
  }
}
