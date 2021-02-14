package designpattern.observer;

import designpattern.observer.youtube.Channel;
import designpattern.observer.youtube.Subscriber;

public class ObserverMain {

	public static void main(String[] args) {
		Channel telusko = new Channel();
		
		Subscriber s1 = new Subscriber("Akshay");
		Subscriber s2 = new Subscriber("Sonam");
		Subscriber s3 = new Subscriber("Harsh");
		Subscriber s4 = new Subscriber("Kiran");
		Subscriber s5 = new Subscriber("Pravin");

		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);
		
		s1.subscriberChannel(telusko);
		s2.subscriberChannel(telusko);
		s3.subscriberChannel(telusko);
		s4.subscriberChannel(telusko);
		s5.subscriberChannel(telusko);
		
		telusko.upload("How to learn Programming?");
	}

}
