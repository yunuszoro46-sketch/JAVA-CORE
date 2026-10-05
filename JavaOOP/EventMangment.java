package event.lib;

import java.util.ArrayList;

public class EventManagement {
	public String name;
	public ArrayList<Event> events = new ArrayList<>();

	public EventManagement(String name) {
		this.name = name;
		this.events = new ArrayList<>();
	}

	public Event findEvent(String id) {
		for (int i = 0; i < events.size(); i++) {
			if (events.get(i).id == id) {
				return events.get(i);
			}
		}
		return null;
	}

	public void addEvent(String id, String title, String customerContact, String eventManager) {
		Event e = new Event(id, title, customerContact, eventManager);
		events.add(e);
	}

	public void addTask (String id, String tsk) {
	 if(events.contains(findEvent(id))) {
		 findEvent(id).addtask(id);
	 }
	}

	public boolean completeTask (String id, String tsk) {
		 if(events.contains(findEvent(id))) {
			return  findEvent(id).completeTask(tsk);
		 }else {
			 return false;
		 }
	}

	public void updateCustomerContact (String id, String tsk) {
			 if(events.contains(findEvent(id))) {
				 findEvent(id).updateCustomerContact(tsk);
			 }
	}

	public void updateManager (String id, String tsk) {
				 if(events.contains(findEvent(id))) {
					 findEvent(id).updateManager(tsk);
				 }
	}

	public void completeEvent(String id) {
		 if(events.contains(findEvent(id))) {
			 findEvent(id).completeTask(id);
		 }
	}

}
