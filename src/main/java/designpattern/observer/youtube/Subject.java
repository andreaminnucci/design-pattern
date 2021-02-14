package designpattern.observer.youtube;

public interface Subject {

	public void subscribe(Subscriber subscriber);
	
	public void unsubscribe(Subscriber subscriber);
	
	public void notifySubscriber();
	
	public void upload(String title);
	
}
