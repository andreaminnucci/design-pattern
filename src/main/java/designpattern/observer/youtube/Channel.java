package designpattern.observer.youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	List<Subscriber> subscribers = new ArrayList<>();
	private String title;
	
	public String getTitle() {
		return title;
	}

	@Override
	public void subscribe(Subscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubscriber() {
		for (Subscriber s : subscribers) {
			s.update();
		}
	}

	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}
	
}
