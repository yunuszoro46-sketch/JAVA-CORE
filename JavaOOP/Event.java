package event.lib;
import java.util.ArrayList;
public class Event {
	   public String title;
	   public String id;
	   public ArrayList<String>task= new ArrayList<>();
	   public String customerContact;
	   public String EventManager;
	   public String status;
	   Event(String title, String id , String customerContact ,String EventManager){
	        this.title=title;
	        this.id=id;
	        this.customerContact=customerContact;
	        this.EventManager=EventManager;
	   }
	   public void addtask(String task) {
		        this.task.add(task);
	   }
	   public boolean completeTask(String tsk) {
		   for(int i=0;i<task.size();i++) {
			   if(task.get(i)==tsk){
				   task.remove(i);
				   return true;
			   }
		   }return false;
	   }
	  
	    public void updateCustomerContact (String contact) {
	    	  this.customerContact = contact ;
	    }
	   
	   public void updateManager (String mngr) {
		     this.EventManager=mngr;
	   }
	   
	    public void complete () {
	    	 this.status= "complete";
	    }
	    
	    
	    public String toString() {
	    	  return  "title: "+this.title+"id "+this.id+"task: "+this.task+"customer contact:  "+this.customerContact+"Event manager:  "+this.EventManager+"status: "+status;
	    }
	    
	    
	    
	  
	   
}
