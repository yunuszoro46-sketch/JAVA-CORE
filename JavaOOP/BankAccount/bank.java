package encapsulation;
import java.util.Scanner;
public class bank {
       public static void main(String[] args) {
    	Scanner scanner = new Scanner (System.in);
		bankAccount b = new bankAccount("younus","2510019",1000);
		System.out.println(b);
		
		System.out.println("Deposite money: ");
		double deposite = scanner.nextInt();
		b.deposite(deposite);
		System.out.println("done");
		
		System.out.println("withdraw money: ");
		double withdraw = scanner.nextInt();
	    b.withdraw(withdraw);
		System.out.println("done");
		
		System.out.println("final balance : "+b.getbalance());
		
		
	}
}
