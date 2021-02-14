package designpattern.observer.youtube;

public class Subscriber implements Observer {
	
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		this.name = name;
	}
	
	@Override
	public void update() {
		System.out.println("Hey " + name + ", Video uploaded: " + channel.getTitle());
	}
	
	@Override
	public void subscriberChannel(Channel channel) {
		this.channel = channel;
	}
}
