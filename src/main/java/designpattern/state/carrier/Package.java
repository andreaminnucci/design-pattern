package designpattern.state.carrier;

import lombok.Data;

@Data
public class Package {
	
	private PackageState state = new OrderedState();


    public void previousState() {
        state.previous(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
    
}
