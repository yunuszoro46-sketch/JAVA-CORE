package midexam25101109;

public class Office {
     String officeName;
     Employee Employ[]= new Employee[5];
     int empCount =0 ;
     
     Office(String officename){
    	 this.officeName=officename;
    	
    	 empCount=0;
     }
   
	 public void addEmployee(Employee employ2) {
         if (empCount >= Employ.length) {
             System.out.println("office is full");
         } else {
             Employ[empCount] = employ2;
             empCount++;
             System.out.println("employee added successfully.");
         }
     }
    
     
     public void searchEmployee(String name) {
         for (int i = 0; i < empCount; i++) {
             if (Employ[i].getempName().equalsIgnoreCase(name)) {
                 System.out.println("Employee "+this.officeName);;
             }
         }
          System.out.println("not found");;
     }
     
     
     
     public void displayEmployees() {
    	 for(int i=0;i<empCount;i++) {
    		 System.out.println(" movies"+i+": "+this.officeName);
    	 }
    }
     
     

}
