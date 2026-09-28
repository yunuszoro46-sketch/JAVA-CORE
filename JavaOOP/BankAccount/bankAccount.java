package encapsulation;

public class bankAccount {
       public String accountNumber;
       public String accountHolder;
       public double balance;
       
       public bankAccount(String accountHolder , String accountNumber , double balance) {
    	    this.accountHolder=accountHolder;
    	    this.accountNumber=accountNumber;
    	    this.balance=balance;
       }
       
       public String getAccountNumber(){
    	      return accountNumber;
       }
       public String getAccountHolder() {
    	      return accountHolder;
       }
       public double getbalance() {
    	      return balance;
       }
       
       public void setAccountHolder(String name) {
    	   if (name != null && !name.isEmpty()) {
    		   this.accountHolder=name;
    	   }
       }
       
       public void deposite(double amount) {
    	   if (amount >0) {
    		  this.balance+=amount;
    	   } else {
    		   System.out.println("Invalid deposit amount.");
    	   }
    		   
       }
       public void withdraw(double amount ) {
    	     if(amount <=0) {
    	    	 System.out.println("Invalid withdrawal amount.");
    	     }else if (amount > balance) {
    	    	 System.out.println("Insufficient balance." ); 
    	     }else {
    	    	 this.balance-=amount;
    	     }
       }
       
       public String toString() {
    	   return "Account Holder : "+this.accountHolder+"Balance :"+this.balance;
       }
}
