package event.lib;

import java.util.Scanner;


import event.lib.EventManagement;
import event.lib.*;

public class EventApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		EventManagement evs = new EventManagement(name);

		int option = -1;
		option = scan.nextInt();
		while (option != 0) {
			System.out.println("0.Exit");
			System.out.println("1.display info");
			System.out.println("2.display specific event");
			System.out.println("3.add event");
			System.out.println("4. add task");
			System.out.println("5.complete task");
			System.out.println("6.update customer contact");
			System.out.println("7.update event manage info an event");
			System.out.println("8.update status");

		

			switch (option) {
			case 0:
				break;

			case 1:
				for (Event i : evs.events){
					  System.out.println(i);
				}
				break;

			case 2:
				System.out.println("Enter id: ");
				String id = scan.next();
				System.out.println(evs.findEvent(id));
				break;
			case 3:
				System.out.println("Enter the title: ");
				String title = scan.next();
                System.out.println("Enter event: ");
                String event = scan.next();
                System.out.println("Enter customer : ");
                String customer = scan.next();
                System.out.println("Enter id: ");
                String ide =scan.next();
                
                evs.addEvent(ide, title, customer, event);
                System.out.println(evs);
			   break;
			case 4:
				System.out.println("Enter event id:  ");
				String eventid = scan.next();
				System.out.println("Enter task: ");
				String tsk =scan.next();
				break;
				
			case 5:
				System.out.println("Enter event id: ");
				String e = scan.next();
			    System.out.println("enetr event task : ");
			    String t =scan.next();
			     evs.updateCustomerContact(eventid, tsk);
			     break;
			case 6:
				System.out.println("Enter event id: ");
				String l = scan.next();
			    System.out.println("enetr event task : ");
			    String k =scan.next();
			     evs.updateCustomerContact(eventid, tsk);
				break;
			case 7:
				System.out.println("Enter event id: ");
				String g = scan.next();
			    System.out.println("enetr event task : ");
			    String f =scan.next();
			     evs.updateCustomerContact(eventid, tsk);
			     break;
			case 8:
				System.out.println("Enter event id: ");
				String a = scan.next();
			    System.out.println("enetr event task : ");
			    String w =scan.next();
			     evs.updateCustomerContact(eventid, tsk);
				break;
				
			}
		}
	}
}
