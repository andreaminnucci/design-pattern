package designpattern.state.carrier;

public class ReceivedState implements PackageState {

	@Override
	public void next(Package pkg) {
		System.out.println("This package is already received by a client.");
	}

	@Override
	public void previous(Package pkg) {
		pkg.setState(new DeliveredState());
	}

	@Override
	public void printStatus() {
		 System.out.println("Package received.");
	}

}
